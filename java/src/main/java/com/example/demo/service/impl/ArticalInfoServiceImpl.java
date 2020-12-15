package com.example.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.ArticalInfo;
import com.example.demo.mapper.ArticalInfoMapper;
import com.example.demo.service.ArticalInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mine
 * @since 2020-12-08
 */
@Service
public class ArticalInfoServiceImpl extends ServiceImpl<ArticalInfoMapper, ArticalInfo> implements ArticalInfoService {

    @Autowired
    ArticalInfoMapper articalInfoMapper;

    @Override
    public int postOneArtical(JSONObject jsonObject) {
        ArticalInfo oneaArtical = new ArticalInfo();
        //获取,封装
        oneaArtical.setArticalText(jsonObject.getString("artical_text"));
        oneaArtical.setArticalType(jsonObject.getString("artical_type"));
        oneaArtical.setArticalTitle(jsonObject.getString("artical_title"));
        oneaArtical.setAuthorId(jsonObject.getInteger("user_id"));
        oneaArtical.setAuthorName(jsonObject.getString("user_nick"));
        int postOne = articalInfoMapper.postOneArtical(oneaArtical);
        //判断
        if(postOne==1){
            return 1;
        }else{
            return 0;
        }
    }
}
