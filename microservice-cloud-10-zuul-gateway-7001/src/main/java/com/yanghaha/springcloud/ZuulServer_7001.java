package com.yanghaha.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @version v1.0
 * @ProjectName: spingCloud
 * @ClassName: ZuulServer_7001
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Yanghaha
 * @Date: 2019/12/23 17:52
 */
@EnableZuulProxy //开启zuul的功能
@SpringBootApplication
public class ZuulServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServer_7001.class);
    }
}
