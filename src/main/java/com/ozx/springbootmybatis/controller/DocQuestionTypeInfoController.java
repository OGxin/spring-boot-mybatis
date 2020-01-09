package com.ozx.springbootmybatis.controller;

import com.ozx.springbootmybatis.entity.DocQuestionTypeInfo;
import com.ozx.springbootmybatis.entity.DocRobotInfo;
import com.ozx.springbootmybatis.service.DocQuestionTypeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: DocQuestionTypeInfoController
 * @Description:TODO
 * @Author ou.zhenxing
 * @Date 2019/11/23 0:25
 * @Version： 1.0
 **/
@RestController
public class DocQuestionTypeInfoController {

    @Autowired
    private DocQuestionTypeInfoService docQuestionTypeInfoService;

    @PostMapping("/get")
    public List<DocRobotInfo> getDocQuestionTypeInfo(String docId){
        return docQuestionTypeInfoService.getDocQuestionTypeInfo(docId);
    }

}
