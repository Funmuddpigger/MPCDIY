package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.AdminInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.utils.Result;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mine
 * @since 2020-12-28
 */
public interface AdminInfoService extends IService<AdminInfo> {
    //loginin admin
    Result logininbyAdmin(JSONObject jsonObject);
}
