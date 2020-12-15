package com.example.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 
 * </p>
 *
 * @author mine
 * @since 2020-12-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ArticalInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "artical_id", type = IdType.AUTO)
    private Integer articalId;

    private String articalText;

    private String articalType;

    private String articalTitle;

    private Integer authorId;

    private String authorName;

    @TableField(fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime postTime;
}
