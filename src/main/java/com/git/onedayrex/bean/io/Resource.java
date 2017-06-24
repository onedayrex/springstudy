package com.git.onedayrex.bean.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by onedayrex on 2017/6/4.
 */
public interface Resource {

    public InputStream getInputStream() throws IOException;
}
