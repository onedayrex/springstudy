package com.git.onedayrex.bean.proxy;


import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by onedayrex on 2017/6/4.
 * 动态代理
 */
public class MyInvokeProxy implements InvocationHandler{

    private static final Logger log = Logger.getLogger(MyInvokeProxy.class);

    private Object target;

    public MyInvokeProxy(Object target) {
        super();
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("---proxy execute prepare---");
        String paramInfo = JSON.toJSONString(args);
        log.info("method param==>"+paramInfo);
        Object result = method.invoke(target, args);
        log.info("---proxy execute prepare---");
        return result;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);
    }
}
