package com.ozx.springbootmybatis.service.impl;

import com.ozx.springbootmybatis.entity.DocQuestionTypeInfo;
import com.ozx.springbootmybatis.entity.DocRobotInfo;
import com.ozx.springbootmybatis.mapper1.DocQuestionTypeInfoMapper;
import com.ozx.springbootmybatis.service.DocQuestionTypeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: DocQuestionInfoServiceImpl
 * @Description:TODO
 * @Author ou.zhenxing
 * @Date 2019/11/23 0:23
 * @Version： 1.0
 **/
@Service
public class DocQuestionInfoServiceImpl implements DocQuestionTypeInfoService {

    @Autowired
    private DocQuestionTypeInfoMapper docQuestionTypeInfoMapper;
    @Override
    public List<DocRobotInfo> getDocQuestionTypeInfo(String docId) {
        return docQuestionTypeInfoMapper.getDocQuestionTypeInfo(docId);
    }
}
