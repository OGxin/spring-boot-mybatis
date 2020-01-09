package com.ozx.springbootmybatis.mapper1;

import com.ozx.springbootmybatis.entity.DocQuestionTypeInfo;
import com.ozx.springbootmybatis.entity.DocRobotInfo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface DocQuestionTypeInfoMapper {

    @Results(id = "docRobotInfoMap",value = {
            @Result(column = "doc_id",property = "docId",jdbcType = JdbcType.VARCHAR),
            @Result(column = "company_id",property = "companyId",jdbcType = JdbcType.VARCHAR),
            @Result(column = "question_type_id",property = "questionTypeId"),
            @Result(column = "used_flag",property = "usedFlag"),
            @Result(column = "link_flag",property = "linkFlag"),
            @Result(column = "audit_status",property = "auditStatus")
    }
    )
    @Select("select * from doc_robot_info where doc_id = #{docId}")
    List<DocRobotInfo> getDocQuestionTypeInfo(String docId);
}
