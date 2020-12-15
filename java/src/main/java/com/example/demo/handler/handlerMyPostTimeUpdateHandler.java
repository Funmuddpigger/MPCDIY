package com.example.demo.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.time.LocalDateTime;
import java.util.Date;

public class handlerMyPostTimeUpdateHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject,"postTime", LocalDateTime.class,new Date());
    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
