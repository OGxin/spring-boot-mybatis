package com.ozx.springbootmybatis.entity;

import lombok.Data;

/**
 * @ClassName: DocQuestionTypeInfo
 * @Description:TODO
 * @Author ou.zhenxing
 * @Date 2019/11/21 15:59
 * @Version： 1.0
 **/
@Data
public class DocQuestionTypeInfo {
    private  String questionTypeId;
    private  String questionTypeName;
    private  String questionTypeDesc;
    private  Integer questionTypeStatus;
    private  String createServiceId;
    private  String createServiceName;
    private  String companyId;
    private  Long createTime;
    private  String parentTypeId;
    private  Integer typeLevel;
    private  String updateServiceId;
    private  String updateServiceName;
    private  Long updateTime;
    private  Integer sortNo;
    /**
     * 分类下词条个数 包括子孙的 (问题学习里  待学习词条个数)
     */
    private  Long docNum;
    private  Integer robotFlag;
    /**
     * 广州定制ID
     */
    private String otherId;
}
