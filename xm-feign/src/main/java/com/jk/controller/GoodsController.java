package com.jk.controller;

import com.jk.service.GoodsService;
import com.jk.service.GoodsServiceFeign;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Resource
    private GoodsServiceFeign goodsService;


    @RequestMapping("/test")
    public String test(){
        return "main";
    }


}
