package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {
	@GetMapping("/listGoods")
	public String list() {
		return "상품목록";
	}
}
