package com.git.onedayrex.bean.proxy;

import org.apache.log4j.Logger;

/**
 * Created by onedayrex on 2017/6/4.
 */
public class UserServiceImpl implements UserService{
    public static final Logger log = Logger.getLogger(UserServiceImpl.class);

    public void addUser(String userName, String password) {
        log.info("addUser==>userName:"+userName+",password:"+password);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
