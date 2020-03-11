package com.lxy.exchange.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lxy.exchange.entity.Offer;
import com.lxy.exchange.service.OfferService;
import com.lxy.exchange.tool.StaticAttribute;
@Controller
@RequestMapping("/offer")
public class OfferController {
	
	@Resource
	private OfferService offerService;
	
	/*
	 * 获取属性并跳转至委托发布页面
	 */
	@RequestMapping("/new")
	public String toNewOfferPage(HttpServletRequest request,Model model){
		System.out.println("To newOfferPage");			//TEST
		model.addAttribute("typelist",StaticAttribute.TYPELIST);
		model.addAttribute("pattenlist",StaticAttribute.PATTENLIST);
		model.addAttribute("formatlist",StaticAttribute.FORMATLIST);
		return "newOffer";
	}
	
	/*
	 * 获取委托信息并跳至委托详情页
	 */
	@RequestMapping("/show")
	public String showOfferInfo(@RequestParam("id") String offerId,Model model) {
		model.addAttribute("offerInfo",offerService.getOfferByOfferId(offerId));
		return "showOffer";
	}
	
	/*
	 * 接收前端传来的委托信息并交给Service处理
	 */
	@RequestMapping(value="/addoffer",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> addOfferInfo(HttpServletRequest request,
			@RequestParam("usage") String usage,
			@RequestParam("title") String title,
			@RequestParam("type") String type,
			@RequestParam("styles") String styles,
			@RequestParam("pricemin") String priceMin,
			@RequestParam("pricemax") String priceMax,
			@RequestParam("patten") String patten,
			@RequestParam("sizewidth") String sizeWidth,
			@RequestParam("sizeheight") String sizeHeight,
			@RequestParam("sizeunit") String sizeUnit,
			@RequestParam("format") String format,
			@RequestParam("testdrw") String testDrw,
			@RequestParam("feedback") String feedback,
			@RequestParam("deadline") String deadline,
			@RequestParam("description") String description){
		System.out.println("Controller addOfferInfo");			//TEST
		//返回
		Map<String,String> map = new HashMap<String, String>();
		String offerId=offerService.addOfferInfo(usage, title, type, styles, priceMin, priceMax, patten, sizeWidth, 
				sizeHeight, sizeUnit, format, testDrw, feedback, deadline, description);
		if(offerId.equals("")) {
			map.put("result","fail");
		}else {
			map.put("result","success");
			map.put("offerid",offerId);
		}
		System.out.println("To show"+offerId);			//TEST
		return map;
	}

}
