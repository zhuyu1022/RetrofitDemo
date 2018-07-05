package com.zhuyu.retrofitdemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zhuyu.retrofitdemo.Api;
import com.zhuyu.retrofitdemo.ApiImpl;
import com.zhuyu.retrofitdemo.R;
import com.zhuyu.retrofitdemo.entity.GetBean;
import com.zhuyu.retrofitdemo.netUtils.RetrofitUtil;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RXActivity extends AppCompatActivity {
    private Button getBtn;
    private TextView resultTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx);
        initView();
    }
    private void initView() {
        getBtn = findViewById(R.id.getBtn);

        resultTv = findViewById(R.id.resultTv);
        getBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDataWithRxJava();
            }
        });

    }

    private void getDataWithRxJava() {


        String type = "Android";
        String size = "10";
        String page = "1";
        ApiImpl.getData(type, size, page, newsCallback);

        Api api = RetrofitUtil.getInstanse().createApi();
        Observable<GetBean> observable = api.getDataWithRxJava(type,size,page);
        observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<GetBean>() {
                    @Override
                    public void accept(GetBean getBean) throws Exception {
                        resultTv.setText(getBean.toString());
                    }
                });
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
