package com.example.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.AdminInfo;
import com.example.demo.mapper.AdminInfoMapper;
import com.example.demo.service.AdminInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.utils.Result;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mine
 * @since 2020-12-28
 */
@Service
public class AdminInfoServiceImpl extends ServiceImpl<AdminInfoMapper, AdminInfo> implements AdminInfoService {

    @Override
    public Result logininbyAdmin(JSONObject jsonObject) {
        jsonObject.getString("username");
        jsonObject.getString("password");
        return null;
    }
}
