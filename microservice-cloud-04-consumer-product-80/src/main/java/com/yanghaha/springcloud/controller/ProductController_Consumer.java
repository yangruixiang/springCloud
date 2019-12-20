package com.yanghaha.springcloud.controller;

import com.yanghaha.springcloud.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @version v1.0
 * @ProjectName: spingCloud
 * @ClassName: ProductController_Consumer
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Yanghaha
 * @Date: 2019/12/16 14:11
 */
@RestController
public class ProductController_Consumer {
    //    private static final String REST_URL_PREFIX = "http://localhost:8001";
    //修改为Eureka注册中心的地址
    private static final String REST_URL_PREFIX = "http://MICROSERVICE-PRODUCT";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/product/add",
                product, Boolean.class);
    }

    @RequestMapping(value = "/consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/get/" + id,
                Product.class);
    }

    @RequestMapping(value = "/consumer/product/list")
    public List<Product> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/list",
                List.class);
    }

}
