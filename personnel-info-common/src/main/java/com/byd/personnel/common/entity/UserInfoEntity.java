package com.byd.personnel.common.entity;

import lombok.Data;

/**
 * 临时用户基本信息表(UserInfo)实体类
 *
 * @author mfc
 * @since 2022-10-25 15:13:19
 */
@Data
public class UserInfoEntity {
    /**
     * 主键ID
     */
    private Long id;
    /**
     * 部门/工厂
     */
    private String departmentName;
    /**
     * 姓名
     */
    private String name;
    /**
     * 工号
     */
    private Integer jobNumber;
    /**
     * 移动电话
     */
    private String phone;
    /**
     * 0:人力资源部用户 1:用工部门用户
     */
    private Integer userType;
    /**
     * 扩展字段1
     */
    private String extend1;

}