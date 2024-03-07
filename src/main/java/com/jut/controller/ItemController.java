package com.jut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {
	@RequestMapping("/items-form")
	public String addForm() {
		return "items/add";

	}

}
