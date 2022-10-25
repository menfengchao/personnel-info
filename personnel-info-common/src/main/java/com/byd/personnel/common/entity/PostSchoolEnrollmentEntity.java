package com.byd.personnel.common.entity;

import lombok.Data;

/**
 * 校招岗位信息表(PostSchoolEnrollment)实体类
 *
 * @author mfc
 * @since 2022-10-25 15:40:46
 */
@Data
public class PostSchoolEnrollmentEntity {
    /**
     * 主键
     */
    private Long id;
    /**
     * 届别
     */
    private Integer classType;
    /**
     * 招聘类型
     */
    private String recruitingType;
    /**
     * 固定岗位序号
     */
    private String positionNumber;
    /**
     * 事业部
     */
    private String businessDivision;
    /**
     * 组织名称
     */
    private String organizationName;
    /**
     * 工厂
     */
    private String factory;
    /**
     * 部门
     */
    private String department;
    /**
     * 科室
     */
    private String sectionOffice;
    /**
     * 总人数
     */
    private Integer headCount;
    /**
     * 已招聘人数
     */
    private Integer recruitedNumber;
    /**
     * 到位人数
     */
    private Integer checkedNumber;
    /**
     * 岗位编码
     */
    private String positionCode;
    /**
     * 岗位名称
     */
    private String positionName;
    /**
     * 岗位级别
     */
    private String positionLevel;
    /**
     * 招聘级别
     */
    private String recruitingLevel;
    /**
     * 招聘小级别
     */
    private String recruitingLevelSmall;
    /**
     * 岗位方向
     */
    private String positionDirection;
    /**
     * 学历
     */
    private String education;
    /**
     * 专业类别（第一意向）
     */
    private String majorCategoryFirst;
    /**
     * 专业（第一意向）
     */
    private String majorFirst;
    /**
     * 研究方向（第一意向）
     */
    private String researchFirst;
    /**
     * 专业类别（第二意向）
     */
    private String majorCategorySecond;
    /**
     * 专业类别（第三意向）
     */
    private String majorCategoryThird;
    /**
     * 院校大类
     */
    private String schoolClassify;
    /**
     * 院校细分（第一意向）
     */
    private String schoolFirst;
    /**
     * 院校细分（第二意向
     */
    private String schoolSecond;
    /**
     * 工作地点及编码
     */
    private String workPlace;
    /**
     * 外语要求
     */
    private String foreignLanguage;
    /**
     * 性别
     */
    private String sex;
    /**
     * 人员服务项目
     */
    private String serviceProject;
    /**
     * 申请理由
     */
    private String applyReason;
    /**
     * 岗位职责
     */
    private String positionStatement;
    /**
     * 招聘要求
     */
    private String recruitingRequire;
    /**
     * 其他备注
     */
    private String ortherRemark;
    /**
     * 技术二面要求
     */
    private String technicalSecond;
    /**
     * 是否双管
     */
    private String doubleFlag;
    /**
     * 双管机构
     */
    private String doubleOrganization;
    /**
     * 截止日期
     */
    private String closeTime;
    /**
     * 状态
     */
    private String status;
    /**
     * 废弃数量
     */
    private Integer abandonNumber;
    /**
     * 废弃原因
     */
    private String abandonReason;
    /**
     * 操作人
     */
    private String operatorName;
    /**
     * 岗位招聘人员画像
     */
    private String positionDescribe;
    /**
     * 扩展字段1
     */
    private String extend1;
    /**
     * 扩展字段2
     */
    private String extend2;
    /**
     * 扩展字段3
     */
    private String extend3;

}