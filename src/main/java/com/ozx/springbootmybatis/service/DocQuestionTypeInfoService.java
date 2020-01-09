package com.ozx.springbootmybatis.service;

import com.ozx.springbootmybatis.entity.DocQuestionTypeInfo;
import com.ozx.springbootmybatis.entity.DocRobotInfo;

import java.util.List;

public interface DocQuestionTypeInfoService {

    List<DocRobotInfo> getDocQuestionTypeInfo(String docId);
}
