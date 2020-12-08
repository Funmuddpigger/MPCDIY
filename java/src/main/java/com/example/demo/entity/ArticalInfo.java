package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

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

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer articalId;

    private String articalText;

    private String articalType;

    private String articalTitle;

    private String articalComment;

    private Integer authorId;

    private String authorName;


}
