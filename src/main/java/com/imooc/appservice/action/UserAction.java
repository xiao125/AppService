package com.imooc.appservice.action;

import com.imooc.appservice.bean.RestFulBean;
import com.imooc.appservice.bean.UserBean;
import com.imooc.appservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserAction {

    @Autowired
    private UserService userService;


    /**
     * 登录
     * @param phone
     * @param password
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/loginbypwd.do",method = RequestMethod.POST)
    public RestFulBean<UserBean> loginByPwd(@RequestParam String phone, @RequestParam String password){

       System.out.println("phone:"+phone);
        return userService.login(phone,password);
    }

    /**
     * 注册
     * @param userBean
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/register.do",method = RequestMethod.PUT)
    public RestFulBean<UserBean> register(@RequestBody UserBean userBean){

        System.out.println("phone:"+userBean.getPhone());
        return userService.registorServer(userBean);

    }


}
