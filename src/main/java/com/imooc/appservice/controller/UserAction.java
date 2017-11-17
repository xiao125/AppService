package com.imooc.appservice.controller;

import com.imooc.appservice.bean.FestFulBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserAction {

    @ResponseBody
    public FestFulBean<String> loginByPwd(@RequestParam String username,@RequestParam String password){

        FestFulBean<String> restful = new FestFulBean<String>();
        restful.setData("hello"+username+"welcom to my!");
        restful.setStatus(0);
        restful.setMsg("成功");
        return restful;
    }



}
