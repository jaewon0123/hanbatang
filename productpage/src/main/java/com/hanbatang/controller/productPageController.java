package com.hanbatang.controller;

import java.util.List;

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
	public String getAllGoods(Model model) {
		List<ProductPage> productPage = productPageService.getAllProduct();
		model.addAttribute("productPage", productPage);
		return "index";
	}
	
	@GetMapping("/productPage/{goods_kinds}")
	public String productPage(Model model, @PathVariable String goods_kinds) {
		ProductPage productPage = productPageService.getGoodsByKind(goods_kinds);
		model.addAttribute("productPage", productPage);
		return "productPage";
	}
}
