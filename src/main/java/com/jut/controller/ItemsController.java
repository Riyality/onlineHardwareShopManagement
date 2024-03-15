package com.jut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jut.dao.ItemsDao;
import com.jut.entity.Items;

@Controller
public class ItemsController {

	@Autowired
	private ItemsDao dao;
	
	@RequestMapping("/items-form")
	private String addform() {
		return "items/add";
		
	}
	
	
	@RequestMapping("/add")
	private String add(@ModelAttribute Items i) {
		dao.add(i);
		return"redirect:/selectall";

	}
	
	@RequestMapping("/selectall")
	private String selectall(Model model) {
		List<Items> list = dao.selectall(model);
		if (list != null) {
			model.addAttribute("data", list);
			return "items/selectall";

		} else
			return null;
	}
	
	@RequestMapping("/updateitems")
	private String updateform() {
		return"items/update";
	}
	@RequestMapping("/update")
	private String update(@ModelAttribute Items i) {
		dao.updatedata(i);
		return "redirect:/selectall";
	}
	
	
	
	@RequestMapping("/delete")
	private String delete(@RequestParam int id) {
	dao.deletedata(id);
	return"redirect:/selectall";
	}
	
}
