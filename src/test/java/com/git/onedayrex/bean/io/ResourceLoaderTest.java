package com.git.onedayrex.bean.io;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.StringBufferInputStream;


/**
 * Created by onedayrex on 2017/6/4.
 */
public class ResourceLoaderTest {
    @Test
    public void getResource() throws Exception {
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource resource = resourceLoader.getResource("spring.md");
        InputStream inputStream = resource.getInputStream();
        BufferedInputStream bf = new BufferedInputStream(inputStream);
        byte[] c = new byte[1024];
        while (bf.read(c, 0, c.length) != -1) {
            String str = new String(c);
            System.out.println(str);
        }
    }

}