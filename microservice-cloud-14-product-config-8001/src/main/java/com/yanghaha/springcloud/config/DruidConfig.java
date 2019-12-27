package com.yanghaha.springcloud.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @version v1.0
 * @ProjectName: spingCloud
 * @ClassName: DruidConfig
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Yanghaha
 * @Date: 2019/12/27 18:00
 */
@Configuration //不要少了
public class DruidConfig {
    @RefreshScope //刷新数据源
    @ConfigurationProperties(prefix = "spring.datasource") //绑定数据源配置
    @Bean
    public DataSource druid() {
        return new DruidDataSource();
    }
}
