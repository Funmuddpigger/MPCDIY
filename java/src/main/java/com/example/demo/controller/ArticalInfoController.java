package com.example.demo.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.example.demo.entity.ArticalInfo;
import com.example.demo.service.ArticalInfoService;
import com.example.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Wrapper;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mine
 * @since 2020-12-08
 */
@CrossOrigin
@RestController
@RequestMapping("/artical-info")
public class ArticalInfoController {

    @Autowired
    ArticalInfoService articalInfoService;

    //get all artical
    @PostMapping("/artical/getAllArtical")
    public Result selectAllArtical(){
        QueryWrapper<ArticalInfo> arWrapper = new QueryWrapper<ArticalInfo>();
        List<ArticalInfo> list = articalInfoService.list(arWrapper);
        return Result.success(list);
    }

    //get by type
    @PostMapping("/artical/getAllByType")
    public Result getByArticalType(@RequestParam(value = "type",defaultValue ="") String type){
        QueryWrapper<ArticalInfo> arWrapper = new QueryWrapper<>();
        arWrapper.eq("artical_type",type);
        List<ArticalInfo> list = articalInfoService.list(arWrapper);
        return Result.success(list);
    }
    @PostMapping("/artical/getByNearlyTime")
    public Result getByNearlyPostTime(){
        return Result.success(null);
    }


    @PostMapping("/artical/postOne")
    public Result postOneArtical(@RequestBody JSONObject jsonObject){
        int res = articalInfoService.postOneArtical(jsonObject);
        if(res==1) {
            return Result.success("insert one artical");
        }else{
            return Result.fail(410,"insert artical fail","fail");
        }
    }




}
