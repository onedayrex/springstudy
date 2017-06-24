package com.git.onedayrex.bean.retrofitclient;

import com.git.onedayrex.bean.retrofitclient.weathentity.Weather;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by onedayrex on 2017/6/25.
 */
public interface HttpDemo {

    @GET("weather_mini")
    Call<Weather> getBaidu(@Query("city") String cityName);


}
