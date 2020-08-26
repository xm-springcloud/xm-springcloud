package com.jk.controller;

import com.jk.model.UserBean;
import com.jk.service.GoodsService;
import com.jk.service.GoodsServiceFeign;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Resource
    private GoodsServiceFeign goodsService;



    @RequestMapping("/login")
    @ResponseBody
    public Map login(UserBean userBean,HttpSession session){
        HashMap result = new HashMap<>();
        //查看账号是否存在
        UserBean userInfo =goodsService.findUserInfoByAccount(userBean.getAccount());
        if (userInfo==null){
            result.put("code", 3);
            result.put("msg", "您输入的账号不存在,请重新输入....");
            return result;
        }
        //判断密码是否正确
        if(!userInfo.getPassword().equals(userBean.getPassword())){
            result.put("code", 5);
            result.put("msg", "您输入密码错误");
            return result;
        }
        session.setAttribute(session.getId(),userInfo);
        result.put("code", 0);
        result.put("msg", "登录成功");
        return result;
    }


    /**
     * 跳转到登陆页面
     * @return
     */
    @RequestMapping("Login")
    public String Login(){
        return "toLogin";
    }


    @RequestMapping("/test")
    public String test(){
        return "main";
    }


}
