package com.git.onedayrex.bean.proxy;

import org.apache.catalina.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by onedayrex on 2017/6/4.
 */
public class MyInvokeProxyTest {

    @Test
    public void invoke() throws Exception {
        UserService userService = new UserServiceImpl();
        MyInvokeProxy myInvokeProxy = new MyInvokeProxy(userService);
        UserService proxy = (UserService) myInvokeProxy.getProxy();
        proxy.toString();
        proxy.addUser("tom","123456");
    }

    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        UserService userService = new UserServiceImpl();
        MyInvokeProxy myInvokeProxy = new MyInvokeProxy(userService);
        UserService proxy = (UserService) myInvokeProxy.getProxy();
        proxy.addUser("tom","123456");
    }

}