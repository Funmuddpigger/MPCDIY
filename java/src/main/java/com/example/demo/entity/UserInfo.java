package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userId;

    private String userAccount;

    private String userNick;

    private String userPassword;

    private String userThumb;

    private String userFans;

    @TableField("user_articalsAccount")
    private String userArticalsaccount;


}
