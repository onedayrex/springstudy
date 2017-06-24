package com.git.onedayrex.bean.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by onedayrex on 2017/6/11.
 */
public class CGlibProxyTest {
    @Test
    public void intercept() throws Exception {
        CGlibProxy cGlibProxy = new CGlibProxy();
        UserServiceGlib proxy = (UserServiceGlib) cGlibProxy.getProxy(UserServiceGlib.class);
        proxy.ccm("cat","6789");
        proxy.addUser("tom","123456");
    }

}