package com.uca.labo4.controller;

import javax.validation.Valid;
import javax.xml.ws.BindingType;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.labo4.domain.Producto;
import com.uca.labo4.domain.Robot;

@Controller
public class MainController {

	@RequestMapping("/producto")
	public ModelAndView initMain()
	{
		Producto producto = new Producto();
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto",producto);
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/formProducto")
	public ModelAndView formProduct(@Valid @ModelAttribute Producto producto,BindingResult result)
	{
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors())
		{
			mav.setViewName("index");
		}
		else
		{
			Robot robot = new Robot();
			mav.addObject("robot",robot);
			mav.setViewName("robot");
		}
		return mav;
		
		
	}
	@RequestMapping("/seguridad")
	public ModelAndView seguridad(@Valid @ModelAttribute Robot robot, BindingResult result)
	{
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors())
		{
			mav.setViewName("robot");
		}
		
		else
		{
			mav.setViewName("exito");
		}
		return mav;
	}
}
