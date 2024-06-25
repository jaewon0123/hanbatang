package com.hanbatang.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hanbatang.dto.ProductPage;

@Mapper
public interface ProductPageMapper {

	ProductPage getGoodsByKinds(String goods_kinds);
}
