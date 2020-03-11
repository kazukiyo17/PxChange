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
		//������Ʒ���
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
		System.out.println("additem"+"\t"+authorId+itemTitle+itemSubtitle);			//����ʹ��
		//������Ϣ
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
		//����
		Map<String,String> map = new HashMap<String, String>();
		//�ļ��Ƿ�Ϊnull
		if(iamge == null){
			map.put("type","error");
			map.put("msg","��ѡ��Ҫ�ϴ����ļ���");
			return map;
		}
		
		//��ȡ�ļ���׺
		String suffix = iamge.getOriginalFilename().substring(iamge.getOriginalFilename().lastIndexOf(".") + 1, iamge.getOriginalFilename().length());
		if (!"jpg,jpeg,gif,png".toUpperCase().contains(suffix.toUpperCase())) {
			map.put("type", "error");
            map.put("msg", "��ѡ��jpg,jpeg,gif,png��ʽ��ͼƬ��");
            return map;
		}
		
		//��ȡ��Ŀ��Ŀ¼����ͼƬĿ¼ 
//		String savePath = request.getSession().getServletContext().getRealPath("/resources/upload/");		
		String savePath =docBase;
		File savePathFile = new File(savePath);
		if (!savePathFile.exists()) {
			System.out.println("����Ŀ¼"+savePathFile);
            //�������ڸ�Ŀ¼���򴴽�Ŀ¼
            savePathFile.mkdir();
        }
		try {
			//���ļ�������ָ��Ŀ¼
			iamge.transferTo(new File(savePath + filename+"."+suffix));
		}catch (Exception e) {
			map.put("type", "error");
            map.put("msg", "�����ļ��쳣��");
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
