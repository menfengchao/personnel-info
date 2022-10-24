package com.byd.personnel.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * @author mfc
 * @version v1.0
 * @date 2022/10/24 10:18 上午
 **/
@Data
public class CardChartEntity implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 取状态正常的最小为第一帧 目前支持在业务代码控制1-3帧 数据库不做限制
     */
    private Long orderNumber;

    /**
     * 文件主表ID
     */
    private Long pictureLink;

    /**
     * 链接展示文本
     */
    private String text;

    /**
     * 链接文章ID
     */
    private Long articleLinkId;

    /**
     * 阅读量
     */
    private Integer readNumber;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 创建人
     */
    private String createId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateId;

    /**
     * 更新时间同样为下线时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
