package com.zhuyu.retrofitdemo.netUtils;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Name: AppendUrlParamInterceptor   url统一追加参数
 * Author: zhu_yu
 * Email:
 * Comment: //TODO
 * Date: 2018-07-05 16:49
 */
public class AppendUrlParamInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();
        //拿到拥有以前的request的url里的那些信息的builder
        HttpUrl.Builder builder = request.url().newBuilder();

        //追加参数，得到新的url
        HttpUrl newHttpUrl = builder.addQueryParameter("deviceid", "1234")
                .addQueryParameter("version", "1.0.1")
                .build();

        //利用新的url，构建新request，发送给服务器
        Request newRequest = request.newBuilder().url(newHttpUrl).build();

        return chain.proceed(newRequest);
    }
}
