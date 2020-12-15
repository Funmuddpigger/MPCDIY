package com.example.demo.mapper;

import com.example.demo.entity.ArticalInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mine
 * @since 2020-12-08
 */
public interface ArticalInfoMapper extends BaseMapper<ArticalInfo> {
    //post artical
    public int postOneArtical(ArticalInfo articalInfo);

}
