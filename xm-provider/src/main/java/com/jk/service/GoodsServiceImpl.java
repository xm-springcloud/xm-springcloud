package com.jk.service;

import com.jk.mapper.GoodsMapper;
import com.jk.model.UserBean;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;


    @Override
    @RequestMapping("/findUserInfoByAccount")
    public UserBean findUserInfoByAccount(@RequestParam String account) {
        return goodsMapper.findUserInfoByAccount(account);
    }
}
