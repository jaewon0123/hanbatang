package com.hanbatang.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cart {
	// goods 테이블
	private int goods_no;
	private String goods_kinds;
	private int goods_price;
	private String img_path;
	private String goods_text;
	private int price_avg; 
	private String origin;
	private String goods_name;
	
	//장바구니 테이블
	private int cart_no;
	private String userid;
	private int goodsno;
	
}
