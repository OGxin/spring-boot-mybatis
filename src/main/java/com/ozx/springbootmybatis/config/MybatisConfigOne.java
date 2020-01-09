package com.ozx.springbootmybatis.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @ClassName: MybatisConfigOne
 * @Description:TODO
 * @Author ou.zhenxing
 * @Date 2019/11/23 0:08
 * @Version： 1.0
 **/
@Configuration
@MapperScan(basePackages = "com.ozx.springbootmybatis.mapper1",sqlSessionTemplateRef = "sqlSessionTemplate1",
                sqlSessionFactoryRef = "sqlSessionFactory1")
public class MybatisConfigOne {
    @Resource(name = "dbOne")
    private DataSource dbOne;

    @Bean
    @Primary
    SqlSessionFactory sqlSessionFactory1() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dbOne);
        return bean.getObject();
    }

    @Bean
    @Primary
    SqlSessionTemplate sqlSessionTemplate1() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory1());
    }
}
