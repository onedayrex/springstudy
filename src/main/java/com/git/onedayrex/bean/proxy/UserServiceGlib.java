package com.git.onedayrex.bean.proxy;

import org.apache.log4j.Logger;

/**
 * Created by onedayrex on 2017/6/11.
 */
public class UserServiceGlib {

    private static final Logger log = Logger.getLogger(UserServiceImpl.class);

    public void addUser(String userName, String password) {
        log.info("addUser==>userName:"+userName+",password:"+password);
    }

    public void ccm(String userName, String password) {
        log.info("ccm==>userName:"+userName+",password:"+password);
    }
}
