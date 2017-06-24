package com.git.onedayrex.bean.proxy;

import com.alibaba.fastjson.JSON;
import net.sf.cglib.proxy.*;
import org.apache.log4j.Logger;

import java.lang.reflect.Method;

/**
 * Created by onedayrex on 2017/6/11.
 */
public class CGlibProxy implements MethodInterceptor{

    public static final Logger log = Logger.getLogger(CGlibProxy.class);

    public Object getProxy(Class target) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target);
        enhancer.setCallbacks(new Callback[]{this, NoOp.INSTANCE});
        CGlibCallBackFilter cGlibCallBackFilter = new CGlibCallBackFilter();
        enhancer.setCallbackFilter(cGlibCallBackFilter);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        log.info("---CGlib Proxy prepare--");
        log.info("param==>"+ JSON.toJSONString(objects));
        Object result = methodProxy.invokeSuper(o, objects);
        log.info("---CGlib Proxy complete--");
        return result;
    }
}
