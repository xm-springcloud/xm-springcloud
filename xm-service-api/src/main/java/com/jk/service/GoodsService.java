package com.jk.service;

import com.jk.model.UserBean;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public interface GoodsService {


    @RequestMapping("/findUserInfoByAccount")
    UserBean findUserInfoByAccount(@RequestParam String account);
}
