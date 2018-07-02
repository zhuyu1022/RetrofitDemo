package com.zhuyu.retrofitdemo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Name: Api
 * Author: zhu_yu
 * Email:
 * Comment: //TODO
 * Date: 2018-07-02 15:58
 */
public interface Api {

    @GET("toutiao/index")
    Call<ResponseBody> getNews(@Query("type")String type, @Query("key")String key);

}
