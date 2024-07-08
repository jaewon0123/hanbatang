package com.hanbatang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbatang.dto.ProductPage;
import com.hanbatang.mapper.CartMapper;

@Service
public class CartService {
	
	@Autowired
	private CartMapper cartMapper;
	
	// 상품 카트담기 insert
		public void insertCart(ProductPage productPage) {
			cartMapper.insertCart(productPage);
		}
		
		public List<ProductPage> getCartList(String userid) {
			return cartMapper.getCartList(userid);
		}
}
