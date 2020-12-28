package com.example.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.demo.utils.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mine
 * @since 2020-12-28
 */
@RestController
@RequestMapping("/admin-info")
public class AdminInfoController {

    @PostMapping("/admin/loginin")
    public Result logininByAdmin(@RequestBody JSONObject jsonObject){
        return Result.
    }
}
