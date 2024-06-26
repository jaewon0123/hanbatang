package com.hanbatang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbatang.dto.ProductPage;
import com.hanbatang.mapper.ProductPageMapper;

@Service
public class ProductPageService {
	
	@Autowired
	private ProductPageMapper productPageMapper;
	
	public List<ProductPage> getAllProduct(){
		return productPageMapper.getAllProduct();
	}
	
	public ProductPage getGoodsByKind(String goods_kinds) {
		return productPageMapper.getGoodsByKind(goods_kinds);
	}
}
