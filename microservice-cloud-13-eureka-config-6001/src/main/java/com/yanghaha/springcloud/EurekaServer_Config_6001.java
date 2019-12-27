package com.yanghaha.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version v1.0
 * @ProjectName: spingCloud
 * @ClassName: EurekaServer_Config_6001
 * @Description: TODO(EurekaServer服务器端启动类,接受其它微服务注册进来)
 * @Author: Yanghaha
 * @Date: 2019/12/25 16:02
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer_Config_6001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_Config_6001.class,args);
     }
}
