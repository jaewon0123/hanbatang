package com.hanbatang.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hanbatang.dto.ProductPage;

@Mapper
public interface CartMapper {
	
	
	void insertCart(ProductPage productPage);
	
	List<ProductPage> getCartList(@Param("uesrid") String userid);
}
