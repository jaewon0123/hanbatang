package com.hanbatang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbatang.dto.ProductPage;
import com.hanbatang.mapper.ProductPageMapper;

@Service
public class ProductPageService {
	
	@Autowired
	private ProductPageMapper productPageMapper;
	
	public ProductPage getGoodsByKinds(String goods_kinds) {
		return productPageMapper.getGoodsByKinds(goods_kinds);
	}
}
