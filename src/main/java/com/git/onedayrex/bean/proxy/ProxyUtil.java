package com.git.onedayrex.bean.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by onedayrex on 2017/6/4.
 * 调用代理类生成字节码，然后写入到硬盘上
 */
public class ProxyUtil {

    /**
     * 写入字节码到硬盘
     * @param path
     */
    public static void writeClass(String path) {
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy01", UserServiceImpl.class.getInterfaces());

        FileOutputStream out = null;

        try {
            out = new FileOutputStream(path);
            out.write(classFile);
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
