package com.imooc.appservice.service;

import com.imooc.appservice.bean.RestFulBean;
import com.imooc.appservice.bean.UserBean;
import com.imooc.appservice.dao.UserDao;
import com.imooc.appservice.util.RestFulUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public RestFulBean<UserBean> registorServer(UserBean userBean){

        UserBean user = userDao.getUser(userBean.getPhone());

        if (user !=null){
            return RestFulUtil.getInstance().getResuFulBean(null,1,"已经注册过了");
        } else {

            user = userDao.registor(userBean); //进行注册

            if (user !=null){
                return RestFulUtil.getInstance().getResuFulBean(user,0,"注册成功");
            }else {

                return RestFulUtil.getInstance().getResuFulBean(null,1,"注册失败");
            }
        }
    }

    public RestFulBean<UserBean> login(String phone,String password){

        UserBean user = userDao.login(phone,password);

        if (user !=null){
            return RestFulUtil.getInstance().getResuFulBean(user,0,"登录成功");
        }else {

            return RestFulUtil.getInstance().getResuFulBean(null,1,"用户不存在");
        }

    }




}
