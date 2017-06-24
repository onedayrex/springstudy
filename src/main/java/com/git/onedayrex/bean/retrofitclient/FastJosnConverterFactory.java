package com.git.onedayrex.bean.retrofitclient;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * Created by onedayrex on 2017/6/25.
 * 重写retrofit2的body转化类，实现用fastJson来转化
 */
public class FastJosnConverterFactory extends Converter.Factory{

    public static FastJosnConverterFactory create() {
        return new FastJosnConverterFactory();
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        return new FastJsonResponseBody<>(type);
    }

    @Override
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] parameterAnnotations, Annotation[] methodAnnotations, Retrofit retrofit) {
        return new FastJsonRequestBody<>();
    }
}
