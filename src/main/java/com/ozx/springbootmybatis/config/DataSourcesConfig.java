package com.ozx.springbootmybatis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @ClassName: DataSourcesConfig
 * @Description:TODO
 * @Author ou.zhenxing
 * @Date 2019/11/23 0:03
 * @Version： 1.0
 **/
@Configuration
public class DataSourcesConfig {
    @Bean(name = "dbOne")
    @ConfigurationProperties(prefix = "spring.datasource.one")
    @Primary
    DataSource dbOne(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "dbTwo")
    @ConfigurationProperties(prefix = "spring.datasource.two")
    DataSource dbTwo(){
        return  DataSourceBuilder.create().build();
    }
}
