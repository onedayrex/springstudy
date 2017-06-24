package com.git.onedayrex.bean.retrofitclient;

import com.alibaba.fastjson.JSON;
import com.git.onedayrex.bean.retrofitclient.weathentity.Weather;
import okhttp3.ResponseBody;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import static org.junit.Assert.*;

/**
 * Created by onedayrex on 2017/6/25.
 */
public class HttpDemoTest {
    @Test
    public void getBaidu() throws Exception {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://wthrcdn.etouch.cn/").
                addConverterFactory(FastJosnConverterFactory.create()).build();
        HttpDemo httpDemo = retrofit.create(HttpDemo.class);
        Call<Weather> baidu = httpDemo.getBaidu("北京");
        Response<Weather> execute = baidu.execute();
        Weather weather = execute.body();
        System.out.println(JSON.toJSONString(weather));
    }

}