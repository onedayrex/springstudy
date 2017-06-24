package com.git.onedayrex.bean.proxy;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * Created by onedayrex on 2017/6/11.
 */
public class CGlibCallBackFilter implements CallbackFilter{
    public int accept(Method method) {
        if ("addUser".equals(method.getName())) {
            return 0;
        }
        return 1;
    }
}
