package com.zhuyu.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Button getBtn;
    private TextView resultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        getBtn = findViewById(R.id.getBtn);
        resultTv = findViewById(R.id.resultTv);
        getBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNews();
            }
        });
    }

    private void getNews() {
        ApiImpl.getNews("top", Constant.NEWS_KEY, newsCallback);
    }

    Callback<ResponseBody> newsCallback = new Callback<ResponseBody>() {
        @Override
        public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
            try {
                String result=response.body().string();
                resultTv.setText(result);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        @Override
        public void onFailure(Call<ResponseBody> call, Throwable t) {

        }
    };
}
