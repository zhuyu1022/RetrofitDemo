package com.zhuyu.retrofitdemo;

import com.zhuyu.retrofitdemo.entity.GetBean;
import com.zhuyu.retrofitdemo.netUtils.RetrofitUtil;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Name: ApiImpl
 * Author: zhu_yu
 * Email:
 * Comment: //TODO
 * Date: 2018-07-02 17:28
 */
public class ApiImpl {
//    public static  void getNews(String type, String key, Callback callback) {
//        Api api = RetrofitUtil.getInstanse().createApi();
//        Call<ResponseBody> call = api.getNews(type, key);
//        call.enqueue(callback);
//    }

    public static  void getData(String type, String size,String page, Callback callback) {
        Api api = RetrofitUtil.getInstanse().createApi();
        Call<GetBean> call = api.getData(type,size,page);
        call.enqueue(callback);
    }
}
