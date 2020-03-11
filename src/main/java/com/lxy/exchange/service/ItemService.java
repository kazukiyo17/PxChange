package com.lxy.exchange.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.lxy.exchange.entity.Item;

/**
 * ��Ʒ����
 * @author kazukiyo
 *
 */
public interface ItemService {
	
	/**
	 * ��ѯ������Ʒ
	 */
	public List<Item> getItemList() throws Exception;
	
	/**
	 * �����Ʒ
	 */
	public boolean addItem(String author_id,String item_title,String item_subtitle) throws Exception;


}
