package com.lxy.exchange.service.impl;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxy.exchange.entity.Item;
import com.lxy.exchange.entity.ItemExample;
import com.lxy.exchange.service.ItemService;
import com.lxy.exchange.dao.ItemMapper;
import com.lxy.exchange.tool.IdWorker;

@Service
public class ItemServiceImpl implements ItemService  {
	
	@Resource
	private ItemMapper item_mapper;
	
	private IdWorker itemId=new IdWorker(1,1,1);
	private int itemIdLength=80;
	private int itemTitleLength=80;
	private int itemSubtitleLength=80;

	@Override
	public List<Item> getItemList() throws Exception {
		ItemExample item_example = new ItemExample();
		item_example.createCriteria();
		List<Item> item_lst = item_mapper.selectByExample(item_example);
		System.out.println(item_lst);
		return item_lst;
	}
	
	@Override
	public boolean addItem(String author_id,String item_title,String item_subtitle) throws Exception{
		System.out.println("ItemService-add");		//调试使用
		if(author_id.length()<itemIdLength&&item_title.length()<itemTitleLength&&item_subtitle.length()<itemSubtitleLength) {
			//获取日期
			LocalDate date = LocalDate.now();
			String workId = String.valueOf(itemId.nextId());
			String publishDate = date.getYear()+"-"+date.getMonthValue()+"-"+date.getDayOfMonth();
			Item item = new Item();
			item.setAuthorId(author_id);
			item.setId(workId);
			item.setPublishTime(publishDate);
			item.setSubtitle(item_subtitle);
			item.setTitle(item_title);
			//插入数据	
			if(item_mapper.insert(item)==1) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
