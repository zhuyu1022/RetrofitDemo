package com.zhuyu.retrofitdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zhuyu.retrofitdemo.ApiImpl;
import com.zhuyu.retrofitdemo.Constant;
import com.zhuyu.retrofitdemo.R;
import com.zhuyu.retrofitdemo.entity.GetBean;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NormalActivity extends AppCompatActivity {
    private Button getBtn;
    private TextView resultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        initView();
    }

    private void initView() {
        getBtn = findViewById(R.id.getBtn);
        resultTv = findViewById(R.id.resultTv);
        getBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
            }
        });
    }

    private void getData() {


        String type = "Android";
        String size = "10";
        String page = "1";
        ApiImpl.getData(type, size, page, newsCallback);
    }

    Callback<GetBean> newsCallback = new Callback<GetBean>() {
        @Override
        public void onResponse(Call<GetBean> call, Response<GetBean> response) {

                String result = response.body().toString();
                resultTv.setText(result);


        }

        @Override
        public void onFailure(Call<GetBean> call, Throwable t) {

        }
    };
}
