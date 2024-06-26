package com.hanbatang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hanbatang.dto.ProductPage;

@Mapper
public interface ProductPageMapper {

	List<ProductPage> getAllProduct();
	
	ProductPage getGoodsByKind(String goods_kinds);
}
