package com.git.onedayrex.bean.retrofitclient.weathentity;

/**
 * Created by onedayrex on 2017/6/25.
 */
public class Weather {
    private Data data;

    private int status;

    private String desc;

    public void setData(Data data){
        this.data = data;
    }
    public Data getData(){
        return this.data;
    }
    public void setStatus(int status){
        this.status = status;
    }
    public int getStatus(){
        return this.status;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public String getDesc(){
        return this.desc;
    }

}
