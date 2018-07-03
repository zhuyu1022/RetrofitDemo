package com.zhuyu.retrofitdemo.netUtils;

import com.zhuyu.retrofitdemo.Api;
import com.zhuyu.retrofitdemo.Constant;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Name: RetrofitUtil
 * Author: zhu_yu
 * Email:
 * Comment: //TODO
 * Date: 2018-07-02 17:29
 */
public class RetrofitUtil {

    private static RetrofitUtil mRetrofitUtil;
    private Retrofit mRetrofit;

    public static RetrofitUtil getInstanse() {
        if (mRetrofitUtil == null) {
            mRetrofitUtil = new RetrofitUtil();
        }
        return mRetrofitUtil;
    }


    private RetrofitUtil() {
        initRetrofit();
    }

    private void initRetrofit() {

        mRetrofit = new Retrofit.Builder().baseUrl(Constant.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

    }

    public Api createApi() {
        return mRetrofit.create(Api.class);
    }

}
