package com.example.demo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author mine
 * @since 2020-12-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ArticalComment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer articalId;

    private String commentText;

    private Integer commentUserid;

    private String commentUsernick;

    private LocalDateTime commentPotime;


}
