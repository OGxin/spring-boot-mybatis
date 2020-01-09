package com.ozx.springbootmybatis.entity;

import lombok.Data;

@Data
public class DocRobotInfo {
    private String docId;
    private String companyId;
    private String questionTypeId;
    private Integer usedFlag;
    private Integer linkFlag;
    private Integer auditStatus;
    private String updateId;
    private Long updateTime;
    private String createId;
    private Long createTime;
    private Integer robotFlag;
    private Long invalidTime;
    private Long effectTime;
    private Integer matchFlag;
    private String otherDocId;
    private String docTag;
    private String label;
    //部门标识
    private String department;
    //地区标识
    private String area;
    //来源标识
    private  String source;
    //根节点docId
    private String rootDocId;
    //父类节点docId
    private String parentId;
    //分类级别
    private Integer docLevel;
    //排序号
    private Integer sortNo;
}
