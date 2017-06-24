package com.git.onedayrex.bean.retrofitclient;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;
import retrofit2.Converter;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * Created by onedayrex on 2017/6/25.
 */
public class FastJsonResponseBody<T> implements Converter<ResponseBody,T>{

    private final Type type;

    public FastJsonResponseBody(Type type) {
        this.type = type;
    }

    public T convert(ResponseBody responseBody) throws IOException {
        byte[] bytes = responseBody.bytes();
        String s = new String(bytes, "UTF-8");
        return JSON.parseObject(s,type);
    }
}
