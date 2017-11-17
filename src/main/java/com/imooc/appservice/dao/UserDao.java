package com.imooc.appservice.dao;

import com.imooc.appservice.bean.UserBean;

public interface UserDao {

    /**
     * 注册
     * @param userBean
     * @return
     */
    UserBean registor(UserBean userBean);


    /**
     * 登录
     * @param phone
     * @param password
     * @return
     */
    UserBean login(String phone,String password);


    /**
     * 根据名字获取用户信息
     * @param phone
     * @return
     */
    UserBean getUser(String phone);




}
