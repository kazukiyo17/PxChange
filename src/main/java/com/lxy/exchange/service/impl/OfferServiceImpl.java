package com.lxy.exchange.service.impl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxy.exchange.dao.OfferMapper;
import com.lxy.exchange.entity.Offer;
import com.lxy.exchange.service.OfferService;
import com.lxy.exchange.tool.IdWorker;
import com.lxy.exchange.tool.StaticAttribute;

@Service
public class OfferServiceImpl implements OfferService {
	
	@Resource
	private OfferMapper offerMapper;
	
	private IdWorker offerIdCreator=new IdWorker(1,1,1);
	
	@Override
	public String addOfferInfo(String usagetmp,String title,String typetmp,
			String styles,String priceMintmp,String priceMaxtmp,String pattentmp,
			String width,String height,String sizeunit,String formattmp,
			String testdrw,String feedbacktmp,String deadline,String description) {
		System.out.println("Service addOfferInfo");			//TEST
		String offerId=String.valueOf(offerIdCreator.nextId());
		String userId="userIdtest";
		//��;
		int usage=Integer.valueOf(usagetmp);
		//����
		int type;
		String typeText="";
		String[] typeArr=typetmp.split(",");
		if(typeArr[0].equals("1")) {
			type=1;
			typeText=typeArr[1];
		}else {
			type=Integer.valueOf(typeArr[0]);
		}
		System.out.println("typeText:"+typeText);			//TEST
		System.out.println("type:"+type);					//TEST
		
		//�۸�
		BigDecimal priceMin=new BigDecimal(priceMintmp);
		BigDecimal priceMax=new BigDecimal(priceMaxtmp);
		
		//��ɫģʽ
		String[] patternArr=pattentmp.split(",");
		String pattenText="";
		List<String> pattenlst = new ArrayList<String>();
		for(int i=0;i<patternArr.length;i++) {
			pattenlst.add(patternArr[i]);
			if(patternArr[i].equals("1")) {
				pattenText=patternArr[i+1];
				break;
			}
		}
		System.out.println("pattenlst:"+pattenlst);						//TEST
		String patten=String.join(",", pattenlst);
		
		//�ߴ�
		BigDecimal sizeWidth=new BigDecimal(width);
		BigDecimal sizeHeight=new BigDecimal(height);
		int sizeUnit=Integer.valueOf(sizeunit);
		
		//�����ʽ
		String[] formatArr=formattmp.split(",");
		String formatText="";
		List<String> formatlst = new ArrayList<String>();
		for(int i=0;i<formatArr.length;i++) {
			formatlst.add(formatArr[i]);
			if(formatArr[i].equals("1")) {
				formatText=formatArr[i+1];
				break;
			}
		}
		String format=String.join(",", formatlst);
		//�Ƿ���Ҫ�Ը�
		int testDrw=Integer.valueOf(testdrw);
		//�Ƿ���Ҫ���ڷ���
		int feedback=Integer.valueOf(feedbacktmp);
		//����״̬
		int publishState=1;
		//��������
		LocalDate date = LocalDate.now();
		String publishTime = date.getYear()+"-"+date.getMonthValue()+"-"+date.getDayOfMonth();
		//����״̬-δ����
		int endState=2;
		//��������
		int applyNum=0;
		//�ο�ͼƬ
		String img="img";
		
		//��ʼ��Offer����
		Offer offer = setOfferAttribute(offerId,userId,usage,title,type,typeText,priceMin,priceMax,
				deadline,patten,pattenText,sizeWidth,sizeHeight,sizeUnit,format,formatText,feedback,
				testDrw,publishState,publishTime,endState,applyNum,description,img);
		
		if(offerMapper.insert(offer)==1) {
			return offerId;
		}else {
			return "";
		}
	}
	
	@Override
	public Offer setOfferAttribute(String offerId, String userId,int usage,String title,
			int type,String typeText,BigDecimal priceMin,BigDecimal priceMax,
			String deadline,String patten,String pattenText,BigDecimal sizeWidth,
			BigDecimal sizeHeight,int sizeUnit,String format,String formatText,
			int feedback,int testDrw,int publishState,String publishTime,
			int endState,int applyNum,String description,String img) {
		Offer offer=new Offer();
		offer.setoApplynum(applyNum);
		offer.setoColorpatten(patten);
		offer.setoColorpattentext(pattenText);
		offer.setoDeadline(deadline);
		offer.setoDescription(description);
		offer.setoEndstate(endState);
		offer.setoFeedback(feedback);
		offer.setoFormat(format);
		offer.setoFormattext(formatText);
		offer.setoHeight(sizeHeight);
		offer.setoId(offerId);
		offer.setoImg(img);
		offer.setoMaxprice(priceMax);
		offer.setoMinprice(priceMin);
		offer.setoPublishstate(publishState);
		offer.setoPublishtime(publishTime);
		offer.setoTestdrw(testDrw);
		offer.setoTitle(title);
		offer.setoType(type);
		offer.setoTypetext(typeText);
		offer.setoUnit(sizeUnit);
		offer.setoUsage(usage);
		offer.setoUserid(userId);
		offer.setoWidth(sizeWidth);
		
		return offer;
	}
	
	@Override
	public Map<String,String> getOfferByOfferId(String offerId) {
		System.out.println("Service getOfferByOfferId");					//TEST
		Offer offer =new Offer();
		Map<String,String> map=new HashMap<String,String>();
		offer = offerMapper.selectByPrimaryKey(offerId);
		//��������
		map.put("applynum", String.valueOf(offer.getoApplynum()));
		//��ɫģʽ
		String[] pattentmp = offer.getoColorpatten().split(",");
		List<String> pattenlst=new ArrayList<String>();
		for(int i=0;i<pattentmp.length;i++) {
			for(Map<String,String> tmp:StaticAttribute.PATTENLIST) {
				if(tmp.get("pattenid").equals(pattentmp[i])){
					pattenlst.add(tmp.get("pattenname"));
				}
			}
			if(pattentmp[i].equals("1")) {
				pattenlst.add(offer.getoColorpattentext());
			}
		}
		String patten = String.join("/", pattenlst);
		map.put("patten", patten);
		System.out.println("patten"+patten);					//TEST
		
		//��������
		map.put("patten", offer.getoDeadline());
		
		//��ϸ����
		map.put("description", offer.getoDescription());
		
		//����״̬
		if(offer.getoEndstate()==2) {
			map.put("endstate", "δ����");
		}else if(offer.getoEndstate()==1) {
			map.put("endstate", "�ѽ���");
		}
		//�Ƿ���Ҫ����
		if(offer.getoFeedback()==1) {
			map.put("feedback", "��");
		}else if(offer.getoFeedback()==2) {
			map.put("feedback", "��");
		}
		
		//�ļ�����
		String[] formattmp = offer.getoFormat().split(",");
		List<String> formatlst=new ArrayList<String>();
		for(int i=0;i<formattmp.length;i++) {
			for(Map<String,String> tmp:StaticAttribute.FORMATLIST) {
				if(tmp.get("formatid").equals(formattmp[i])){
					formatlst.add(tmp.get("formatname"));
				}
			}
			if(formattmp[i].equals("1")) {
				formatlst.add(offer.getoFormattext());
			}
		}
		String format = String.join("/", formatlst);
		map.put("format", format);
		System.out.println("format"+format);					//TES
		
		//�ߴ�
		map.put("size", String.valueOf(offer.getoWidth())+" �� "+String.valueOf(offer.getoHeight()));
		if(offer.getoTestdrw()==1) {
			map.put("sizeunit", "����");
		}else if(offer.getoTestdrw()==2) {
			map.put("sizeunit", "����");
		}
		
		//id
		map.put("offerid", offerId);
		
		//img
		map.put("img", offer.getoImg());
		
		//�۸�Χ
		map.put("price", String.valueOf(offer.getoMinprice())+" - "+String.valueOf(offer.getoMaxprice()));
		
		//����״̬
		map.put("publishstate", "1");
		
		//����ʱ��
		map.put("publishdate", offer.getoPublishtime());
		
		//�Ƿ���Ҫ�Ը�
		if(offer.getoTestdrw()==1) {
			map.put("testdrw", "��");
		}else if(offer.getoTestdrw()==2) {
			map.put("testdrw", "��");
		}
		
		//����
		map.put("title", offer.getoTitle());
		
		//����
		if(offer.getoType()==1) {
			map.put("type", "������"+offer.getoTypetext()+"��");
		}else {
			for(Map<String,String> tmp:StaticAttribute.TYPELIST) {
				if(tmp.get("typeid").equals(String.valueOf(offer.getoType()))) {
					map.put("type", tmp.get("typename"));
				}
			}
		}
		
		//��;
		if(offer.getoUsage()==1) {
			map.put("usage", "��ҵί��");
		}else if(offer.getoUsage()==2) {
			map.put("usage", "����ί��");
		}
		
		//�û�id
		map.put("userid", offer.getoUserid());
		
		System.out.println("map:"+map);			//TEST
		return map;
	}
}
