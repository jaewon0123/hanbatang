package com.hanbatang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hanbatang.dto.Members;
import com.hanbatang.dto.ProductPage;
import com.hanbatang.service.CartService;

import jakarta.servlet.http.HttpSession;

@Controller
public class CratController {

	@Autowired
	private CartService cartService;
	
	
	 // 장바구니 보는 페이지 메서드
    @GetMapping("/cartPage")
    public String getCartList(ProductPage productPage, Model model, HttpSession session) {
    	Members membrs = (Members) session.getAttribute("loginSession");
    	
    	if(membrs == null) {
    		return "redirect:/login";
    	}
    	
    	List<ProductPage> cartList = null;
    	
    	cartList = cartService.getCartList(membrs.getMember_id());
    	
    	model.addAttribute("cart", cartList);
    	return "cartPage";
    }
    
    // 장바구니 insert 메서드
    @PostMapping("/cartPage")
    public String insertCart(ProductPage productPage, Model model, HttpSession session) {
    	
    	// 회원 로그인 안되어있으면 로그인 화면 이동
    	Members members = (Members) session.getAttribute("loginSession");
    	
    	productPage.setUserid(members.getMember_id());
    	
    	cartService.insertCart(productPage);
    	
    	List<ProductPage> cartList = cartService.getCartList(productPage.getUserid());
    	model.addAttribute("cart",cartList);
    	
    	return "cartPage";
    }
    
    
}
