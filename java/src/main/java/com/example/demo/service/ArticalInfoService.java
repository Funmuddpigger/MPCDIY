package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.ArticalInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mine
 * @since 2020-12-08
 */
public interface ArticalInfoService extends IService<ArticalInfo> {
    //post
    int postOneArtical(JSONObject jsonObject);
}
