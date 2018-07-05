package com.zhuyu.retrofitdemo.netUtils;

import java.io.IOException;

import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Name: AppendHeaderParamInterceptor  header统一追加参数
 * Author: zhu_yu
 * Email:
 * Comment: //TODO
 * Date: 2018-07-05 17:12
 */
public class AppendHeaderParamInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();

        Headers.Builder builder = request.headers().newBuilder();
        //追加参数，得到新的headers
        Headers newHeaders = builder.add("userid", "zhuyu")
                .add("token", "i am token")
                .build();
        //利用新的headers，构建新request，发送给服务器
        Request newRequest = request.newBuilder().headers(newHeaders).build();

        return chain.proceed(newRequest);
    }
}
