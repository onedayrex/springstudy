package com.git.onedayrex.bean.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by onedayrex on 2017/6/4.
 */
public class ProxyUtilTest {
    @Test
    public void writeClass() throws Exception {
        ProxyUtil.writeClass("D:/$Proxy01.class");
    }

}