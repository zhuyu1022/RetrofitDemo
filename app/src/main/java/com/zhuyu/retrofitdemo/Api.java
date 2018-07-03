package com.zhuyu.retrofitdemo;

import com.zhuyu.retrofitdemo.entity.GetBean;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Name: Api
 * Author: zhu_yu
 * Email:
 * Comment: //TODO
 * Date: 2018-07-02 15:58
 */
public interface Api {

//    @GET("toutiao/index")
//    Call<ResponseBody> getNews(@Query("type")String type, @Query("key")String key);


    /**
     * 数据类型： 福利 | Android | iOS | 休息视频 | 拓展资源 | 前端 | all
     请求个数： 数字，大于0
     第几页：数字，大于0
     * @return
     */
    @GET("api/data/{type}/{size}/{page}")
    Call<GetBean> getData(@Path("type")String type, @Path("size")String size, @Path("page")String page);

}
