package com.jk.service;

import com.jk.model.UserBean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("/error")
@Component
public class GoodsServiceFallback implements GoodsServiceFeign {


    @Override
    public UserBean findUserInfoByAccount(String account) {
        return null;
    }
}
