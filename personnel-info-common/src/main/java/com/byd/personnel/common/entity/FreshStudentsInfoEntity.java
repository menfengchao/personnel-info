package com.byd.personnel.common.entity;

import lombok.Data;

/**
 * 应届生信息表(FreshStudentsInfo)实体类
 *
 * @author mfc
 * @since 2022-10-25 15:09:56
 */
@Data
public class FreshStudentsInfoEntity {
    /**
     * 主键
     */
    private Long id;
    /**
     * 报名号
     */
    private String infoRegistrationNo;
    /**
     * 姓名
     */
    private String infoName;
    /**
     * 0:男性 1:女性
     */
    private Integer infoSex;
    /**
     * 毕业学校
     */
    private String infoGraduationSchool;
    /**
     * 专业
     */
    private String infoMajor;
    /**
     * 最高学历
     */
    private String infoHighestEducation;
    /**
     * 电话
     */
    private String infoPhone;
    /**
     * 邮箱
     */
    private String infoMailbox;
    /**
     * 籍贯
     */
    private String infoNativePlace;
    /**
     * 工作地点
     */
    private String infoWorkPlace;
    /**
     * 意向岗位
     */
    private String infoIntendedPost;
    /**
     * 数据创建时间
     */
    private Object infoCreateTime;
    /**
     * 数据创建人
     */
    private String infoCreateName;
    /**
     * 面试时间
     */
    private Object infoInterviewTime;
    /**
     * 人事面试评价
     */
    private String infoPersonnelInterview;
    /**
     * 人事评分
     */
    private String infoPersonnelScore;
    /**
     * 人事面试官
     */
    private String infoPersonnelName;
    /**
     * 工厂/部门
     */
    private String infoDeptment;
    /**
     * 简历推送部门
     */
    private String infoPushDepartment;
    /**
     * 简历推送人
     */
    private String infoPushName;
    /**
     * 简历推送时间
     */
    private String infoPushTime;
    /**
     * 简历推送人
     */
    private String infoResumePusher;
    /**
     * 科室
     */
    private String postSectionOffice;
    /**
     * 实际岗位
     */
    private String postActualPosition;
    /**
     * 岗位职责
     */
    private String postDuty;
    /**
     * 技术面试评价
     */
    private String technicalInterview;
    /**
     * 技术评分
     */
    private String technicalScore;
    /**
     * 技术面试官
     */
    private String technicalName;
    /**
     * 成绩单
     */
    private String stuSchoolReport;
    /**
     * 英语四级
     */
    private String stuCet4;
    /**
     * 学信网学历报告
     */
    private String stuEducationReport;
    /**
     * 其他
     */
    private String stuOther;
    /**
     * 最后审核时间
     */
    private Object auditLastTime;
    /**
     * 最后审核人
     */
    private String auditName;
    /**
     * 审核状态
     */
    private String auditStatus;
    /**
     * 备注说明
     */
    private String auditRemark;
    /**
     * 是否签约
     */
    private String signStatus;
    /**
     * 录用表
     */
    private String signEmploymentForm;
    /**
     * 最后上传时间
     */
    private Object signTime;
    /**
     * 最后维护人
     */
    private String signName;
    /**
     * 谈薪时间
     */
    private Object salaryTime;
    /**
     * 谈薪人
     */
    private String salaryName;
    /**
     * offer发送时间
     */
    private Object offerTime;
    /**
     * offer发送人
     */
    private String offerSendName;
    /**
     * 跟进签约
     */
    private String followSign;
    /**
     * 签约跟进时间
     */
    private Object followSignTime;
    /**
     * 签约跟进人
     */
    private String followSignName;
    /**
     * 收/寄资料
     */
    private String followMeans;
    /**
     * 收/寄资料时间
     */
    private Object followMeansTime;
    /**
     * 收/寄资料人
     */
    private String followMeansName;
    /**
     * 1:正常 0:违约
     */
    private Integer defaultStatus;
    /**
     * 违约说明
     */
    private String defaultExplain;
    /**
     * 违约时间
     */
    private Object defaultTime;
    /**
     * 违约信息维护人
     */
    private String defaultName;
    /**
     * 整体招聘状态
     */
    private String status;
    /**
     * 扩展字段1
     */
    private String entend1;
    /**
     * 扩展字段2
     */
    private String entend2;
    /**
     * 扩展字段3
     */
    private String entend3;
    /**
     * 扩展字段4
     */
    private String entend4;
    /**
     * 扩展字段5
     */
    private String entend5;

}