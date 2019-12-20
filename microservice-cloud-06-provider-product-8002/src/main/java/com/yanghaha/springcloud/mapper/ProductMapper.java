package com.yanghaha.springcloud.mapper;

import com.yanghaha.springcloud.entities.Product;

import java.util.List;

/**
 * @Auther: 梦学谷
 */
//@Mapper //或者在启动类上标识 @MapperScan
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}