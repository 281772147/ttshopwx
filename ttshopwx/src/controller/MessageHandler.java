package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.thoughtworks.xstream.XStream;
import pojo.BaseMsg;
import pojo.Item;
import pojo.News;
import pojo.Text;
import tools.MyXStream;

public class MessageHandler {
	
	private static String formuser;
	private static String touser;
	
	public String dispatcher(BaseMsg baseMsg){
		String action = baseMsg.getContent();
		formuser = baseMsg.getTousername();
		touser = baseMsg.getFromusername();
		HashMap<String, String> actions = ActionMap.getActions();
		
		if(actions.containsKey(action)){
			String url = actions.get(action)+touser;
			String context = "<a href='"+url+"'>"+action+"</a>\n";
			Text text2 = new Text(touser, formuser, context);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text2);
			System.out.println(xml);
			return xml;
		}else if(action.equals("产品")){
			String picurl = "https://mmbiz.qlogo.cn/mmbiz/R4zgkicuYMgIg8IoLfHLbvvTrwrCwLrcDib0WZ5OnglRxic7iaHaoc6xiawkKWcbR8JU89EaqyeVtUxsLc7IN7lmMlw/0";
			Item item = new Item("自然乐园芦荟胶", "自然乐园芦荟胶 谁谁谁水水水水", picurl, "http://ttshop.aliapp.com");
			Item item1 = new Item("自然乐园芦荟胶", "自然乐园芦荟胶 事实上事实上", picurl, "http://ttshop.aliapp.com");
			
			List<Item> articles = new ArrayList<Item>();
			articles.add(item);
			articles.add(item1);
			News news = new News(touser, formuser, articles.size(), articles);
			
			XStream xStream = MyXStream.initXStream(true);
			@SuppressWarnings("rawtypes")
			Class[] types = new Class[2];
			types[0] = Item.class;
			types[1] = News.class;
			xStream.processAnnotations(types);
			String xml = xStream.toXML(news);
			System.out.println(xml);
			return xml;
		}else{
			String content = "您好,小T不能识别您的指令!\n";
			content+="您可以使用如下指令\n";
			content+="1.注册会员\n";
			content+="2.会员卡\n";
			content+="3.积分兑换\n";
			content+="4.产品\n";
			content+="5.产品+产品名\n";
			Text text2 = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(false);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text2);
			System.out.println(xml);
			return xml;
		}
		
	}
	
	public String dispatcher(HashMap<String, String> map){
		String action = map.get("content");
		formuser =map.get("tousername");
		touser = map.get("fromusername");
		HashMap<String, String> actions = ActionMap.getActions();
		
		if(actions.containsKey(action)){
			String url = actions.get(action)+touser;
			String context = "<a href='"+url+"'>"+action+"</a>\n";
			Text text2 = new Text(touser, formuser, context);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text2);
			System.out.println(xml);
			return xml;
		}else if(action.equals("产品")){
			String picurl = "https://mmbiz.qlogo.cn/mmbiz/R4zgkicuYMgIg8IoLfHLbvvTrwrCwLrcDib0WZ5OnglRxic7iaHaoc6xiawkKWcbR8JU89EaqyeVtUxsLc7IN7lmMlw/0";
			Item item = new Item("自然乐园芦荟胶", "自然乐园芦荟胶 谁谁谁水水水水", picurl, "http://ttshop.aliapp.com");
			Item item1 = new Item("自然乐园芦荟胶", "自然乐园芦荟胶 事实上事实上", picurl, "http://ttshop.aliapp.com");
			
			List<Item> articles = new ArrayList<Item>();
			articles.add(item);
			articles.add(item1);
			News news = new News(touser, formuser, articles.size(), articles);
			
			XStream xStream = MyXStream.initXStream(true);
			@SuppressWarnings("rawtypes")
			Class[] types = new Class[2];
			types[0] = Item.class;
			types[1] = News.class;
			xStream.processAnnotations(types);
			String xml = xStream.toXML(news);
			System.out.println(xml);
			return xml;
		}else{
			String content = "您好,小T不能识别您的指令!\n";
			content+="您可以使用如下指令\n";
			content+="1.注册会员\n";
			content+="2.会员卡\n";
			content+="3.积分兑换\n";
			content+="4.产品\n";
			content+="5.产品+产品名\n";
			Text text2 = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(false);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text2);
			System.out.println(xml);
			return xml;
		}
		
	}
	
}
