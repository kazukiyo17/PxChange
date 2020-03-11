package com.lxy.exchange.service;

import java.math.BigDecimal;
import java.util.Map;

import com.lxy.exchange.entity.Offer;

/**
 * ί�в���Service�ӿ�
 * @author kazukiyo
 *
 */
public interface OfferService {
	
	/*
	 * �����ί��
	 */
	public String addOfferInfo(String usage,String title,String type,
			String styles,String priceMin,String priceMax,String patten,
			String sizeWidth,String sizeHeight,String sizeUnit,String format,
			String testDrw,String feedback,String deadline,String description);
	
	/*
	 * offer��ֵ
	 */
	public Offer setOfferAttribute(String offerId, String userId,int usage,String title,
			int type,String typeText,BigDecimal priceMin,BigDecimal priceMax,
			String deadline,String patten,String pattenText,BigDecimal sizeWidth,
			BigDecimal sizeHeight,int sizeUnit,String format,String formatText,
			int feedback,int testDrw,int publishState,String publishTime,
			int endState,int applyNum,String description,String img);
	
	/*
	 * ��ȡOffer������Ϣ
	 */
	public Map<String,String> getOfferByOfferId(String offerId);
	
}
