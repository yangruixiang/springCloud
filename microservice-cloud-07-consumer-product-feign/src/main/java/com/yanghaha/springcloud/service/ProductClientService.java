package com.yanghaha.springcloud.service;

import com.yanghaha.springcloud.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @version v1.0
 * @ProjectName: spingCloud
 * @ClassName: ProductClientService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Yanghaha
 * @Date: 2019/12/20 14:05
 */
//指定调用的服务 MICROSERVICE-PRODUCT
@FeignClient(value = "MICROSERVICE-PRODUCT")
public interface ProductClientService {
    @RequestMapping(value = "/product/get/{id}",method = RequestMethod.GET)
    Product get(Long id);
    @RequestMapping(value = "/product/list",method = RequestMethod.GET)
    List<Product> list();
    @RequestMapping(value = "/product/add",method = RequestMethod.POST)
    boolean add(Product product);

}
