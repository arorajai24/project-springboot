package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Product;
import com.example.demo.service.salesDAO;

@Controller
public class AppController {
	
	@Autowired
	private salesDAO dao;
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		List<Product> list = dao.list();
		mv.addObject("List",list);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/new")
	public String addnew() {
		return "addproduct";
	}
	
	@RequestMapping("/newproduct")
	public String newproduct(@ModelAttribute Product product) {
		dao.save(product);
		return "redirect:/";
	}
	
	@RequestMapping("/edit")
	public String get()
	{
		Product pro = dao.getproduct(2);
		ModelAndView mv = new ModelAndView();
		mv.addObject("product",pro);
		return "edit";
	}
	
	@RequestMapping("/update")
	public String editproduct(@ModelAttribute Product product) {
		dao.edit(product);
		return "redirect:/";
	}
	
}
