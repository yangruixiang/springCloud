package com.yanghaha.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version v1.0
 * @ProjectName: spingCloud
 * @ClassName: ConfigClient
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Yanghaha
 * @Date: 2019/12/25 14:14
 */
@RestController
public class ConfigClient {
    //会从github中的microservice-config-application.yml中获取
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${server.port}")
    private String port;

    //请求访问
    @RequestMapping("/config")
    public String getConfig() {
        String content = "applicationName:" + applicationName + ", port:" +
                port;
        System.out.println("content: " + content);
        return content;
    }
}
