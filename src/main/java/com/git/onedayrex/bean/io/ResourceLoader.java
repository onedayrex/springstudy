package com.git.onedayrex.bean.io;

import java.net.URL;

/**
 * Created by onedayrex on 2017/6/4.
 */
public class ResourceLoader {

    public Resource getResource(String location) {
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}
