package com.hanbatang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hanbatang.dto.ProductPage;
import com.hanbatang.service.ProductPageService;

@Controller
public class productPageController {
	
	@Autowired
	private ProductPageService productPageService;
	
	@GetMapping("/")
	public String main() {
		return "main";
	}
	
	@GetMapping("/productPage/{goods_kinds}")
	public String getGoodsByKinds(Model model, @PathVariable String goods_kinds) {
		ProductPage productPage = productPageService.getGoodsByKinds(goods_kinds);
		model.addAttribute("productPage", productPage);
		return "productPage";
	}
}
