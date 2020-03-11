package com.lxy.exchange.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.lxy.exchange.entity.Item;

/**
 * 作品操作
 * @author kazukiyo
 *
 */
public interface ItemService {
	
	/**
	 * 查询所有作品
	 */
	public List<Item> getItemList() throws Exception;
	
	/**
	 * 添加作品
	 */
	public boolean addItem(String author_id,String item_title,String item_subtitle) throws Exception;


}
