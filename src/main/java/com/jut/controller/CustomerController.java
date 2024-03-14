package com.jut.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jut.dao.CustomerDao;
import com.jut.entity.Customer;

@Controller
public class CustomerController {
	@Autowired
	private CustomerDao customerDao;

	@RequestMapping("/customer1")
	public String addForm() {
		return "customer/add";

	}

	@RequestMapping("/customers")
	private String add(@ModelAttribute Customer c) {

		customerDao.add(c);
		return "redirect:all";

	}

	@RequestMapping("/all")
	private String CustomerList(@ModelAttribute Customer c, Model model) {
		List<Customer> list = customerDao.CustomerList(model);

		if (list != null) {
			model.addAttribute("customer", list);
			return "customer/list";
		}
		return null;
	}

	@RequestMapping("/editCustomer")
	private String editCustomer() {
		return "customer/update";

	}

	@RequestMapping("/updateCustomer")
	private String update(@ModelAttribute Customer c, Model model) {
		boolean isUpdated = customerDao.update(c);
		if (isUpdated) {
			
			model.addAttribute("msg", "Update");


		}else{
			model.addAttribute("msg", " Not Update");
		}
			
		return"redirect:all";
	}

	@RequestMapping("/deletes")
	private String delete(@RequestParam int id, Model model) {
		customerDao.delete(id);
		return "redirect:all";
	}
}
