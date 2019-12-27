package com.yanghaha.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version v1.0
 * @ProjectName: spingCloud
 * @ClassName: ProductProvider_Config_8001
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Yanghaha
 * @Date: 2019/12/27 15:22
 */
@EnableEurekaClient //将此服务注册到Eureka 服务注册中心
@MapperScan("com.yanghaha.springcloud.mapper")
@SpringBootApplication
public class ProductProvider_Config_8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_Config_8001.class,args);
    }
}
