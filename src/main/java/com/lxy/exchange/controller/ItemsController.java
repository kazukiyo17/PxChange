package com.lxy.exchange.controller;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.lxy.exchange.entity.Item;
import com.lxy.exchange.service.ItemService;
import com.lxy.exchange.tool.IdWorker;

@Controller
@RequestMapping("/items")
public class ItemsController {

	@Resource
	private ItemService item_service;
	private IdWorker idWorker=new IdWorker(1,1,1);
	private String path="/upload/";
	private String docBase="F:\\SpringBootProject\\exchange\\upload\\";
	
	@RequestMapping("/itemlist")
	public String toItemList(HttpServletRequest request,Model model) throws Exception {
		List<Item> item_lst = item_service.getItemList();
		model.addAttribute("itemlist",item_lst);
		return "index";
	}
	
	
	@RequestMapping("/additempage")
	public String toAddItemPage(HttpServletRequest request,Model model) {
		System.out.println("To additempage");			//TEST
		//创建作品编号
		String itemId = String.valueOf(idWorker.nextId());
		System.out.println("itemId:"+itemId);			//TEST
		model.addAttribute("itemId",itemId);
		return "addWork";
	}
	
	@RequestMapping(value="/additem",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Boolean> addItem(HttpServletRequest request,
			@RequestParam("authorid") String authorId,
			@RequestParam("itemtitle") String itemTitle,
			@RequestParam("itemsubtitle") String itemSubtitle) throws Exception {
		System.out.println("additem"+"\t"+authorId+itemTitle+itemSubtitle);			//调试使用
		//返回信息
		Map<String,Boolean> map = new HashMap<String, Boolean>();
		if(item_service.addItem(authorId, itemTitle,itemSubtitle)) {
			map.put("result",true);
		}else {
			map.put("result",false);
		}
		return map;
	}
	
	@RequestMapping(value="/uploadimg",method=RequestMethod.POST)
	@ResponseBody
	public Map<String,String> uploadImg(@RequestParam("file_data") MultipartFile iamge, 
			@RequestParam("file_id") String filename,
			HttpServletRequest request) throws Exception {
		System.out.println("uploadimg");	
		//返回
		Map<String,String> map = new HashMap<String, String>();
		//文件是否为null
		if(iamge == null){
			map.put("type","error");
			map.put("msg","请选择要上传的文件！");
			return map;
		}
		
		//获取文件后缀
		String suffix = iamge.getOriginalFilename().substring(iamge.getOriginalFilename().lastIndexOf(".") + 1, iamge.getOriginalFilename().length());
		if (!"jpg,jpeg,gif,png".toUpperCase().contains(suffix.toUpperCase())) {
			map.put("type", "error");
            map.put("msg", "请选择jpg,jpeg,gif,png格式的图片！");
            return map;
		}
		
		//获取项目根目录加上图片目录 
//		String savePath = request.getSession().getServletContext().getRealPath("/resources/upload/");		
		String savePath =docBase;
		File savePathFile = new File(savePath);
		if (!savePathFile.exists()) {
			System.out.println("创建目录"+savePathFile);
            //若不存在该目录，则创建目录
            savePathFile.mkdir();
        }
		try {
			//将文件保存至指定目录
			iamge.transferTo(new File(savePath + filename+"."+suffix));
		}catch (Exception e) {
			map.put("type", "error");
            map.put("msg", "保存文件异常！");
            e.printStackTrace();
            return map;
        }
		map.put("type", "success");
		map.put("url", path+filename+"."+suffix);
		System.out.println("url:"+path+filename+"."+suffix);	
		System.out.println("uploadimg completed!");	
        return map;
	}
}
