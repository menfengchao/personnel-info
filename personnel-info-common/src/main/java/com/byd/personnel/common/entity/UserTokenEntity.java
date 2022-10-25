package com.byd.personnel.common.entity;

import lombok.Data;

/**
 * (UserToken)实体类
 *
 * @author mfc
 * @since 2022-10-25 17:13:58
 */
@Data
public class UserTokenEntity {
    /**
     * 主键
     */
    private Long id;
    /**
     * 登录人ID
     */
    private Long userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 临时授权码
     */
    private String token;
    /**
     * 有效期
     */
    private Object expiratedTime;

}