package controller;

import java.util.HashMap;

import com.thoughtworks.xstream.XStream;
import pojo.BaseMsg;
import pojo.Text;
import pojo.WXTYPE;
import tools.MyXStream;

public class EventHandler {
	
	private static String formuser;
	private static String touser;
	
	public String dispatcher(BaseMsg baseMsg){
		String event = baseMsg.getEvent();
		formuser = baseMsg.getTousername();
		touser = baseMsg.getFromusername();
		System.out.println(baseMsg);
		//HashMap<String, String> actions = ActionMap.getActions();
		System.out.println("#EVENT:"+event +"="+ WXTYPE.SUBSCRIDE_EVENT);
		if(event.equalsIgnoreCase(WXTYPE.SUBSCRIDE_EVENT)){
			System.out.println("subscride事件");
			String content = "欢迎关注";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.SCAN_EVENT)){
			System.out.println("scan事件");
			String content = "欢迎关注";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.LOCATION_EVENT)){
			String content = "上报地理信息";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.VIEW_EVENT)){
			String content = "跳转事件";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.CLICK_EVENT)){
			String content = "点击事件";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.LOCATION_SELECT_EVENT)){
			String content = "位置上报";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.SCANCODE_PUSH_EVENT)){
			String content = "扫描事件";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.SCANCODE_WAITMSG_EVENT)){
			String content = "扫描信息";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.PIC_SYSPHOTO_EVENT)){
			String content = "拍照事件";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.PIC_PHOTO_OR_ALBUM_EVENT)){
			String content = "选择图片";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.PIC_WEIXIN_EVENT)){
			String content = "弹出微信相册发图器的事件推送";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else{
			String content = "未能识别事件";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}
	}
	
	public String dispatcher(HashMap<String, String> map){
		String event = map.get("event");
		formuser = map.get("tousername");
		touser = map.get("fromusername");
		System.out.println(map);
		//HashMap<String, String> actions = ActionMap.getActions();
		System.out.println("#EVENT:"+event +"="+ WXTYPE.SUBSCRIDE_EVENT);
		if(event.equalsIgnoreCase(WXTYPE.SUBSCRIDE_EVENT)){
			System.out.println("subscride事件");
			String content = "欢迎关注";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.SCAN_EVENT)){
			System.out.println("scan事件");
			String content = "欢迎关注";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.LOCATION_EVENT)){
			String content = "上报地理信息";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.VIEW_EVENT)){
			String content = "跳转事件";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.CLICK_EVENT)){
			String content = "点击事件";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.LOCATION_SELECT_EVENT)){
			String content = "位置上报";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.SCANCODE_PUSH_EVENT)){
			String content = "扫描事件";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.SCANCODE_WAITMSG_EVENT)){
			String content = "扫描信息";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.PIC_SYSPHOTO_EVENT)){
			String content = "拍照事件";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.PIC_PHOTO_OR_ALBUM_EVENT)){
			String content = "选择图片";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else if(event.equalsIgnoreCase(WXTYPE.PIC_WEIXIN_EVENT)){
			String content = "弹出微信相册发图器的事件推送";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}else{
			String content = "未能识别事件";
			Text text = new Text(touser, formuser, content);
			XStream xStream = MyXStream.initXStream(true);
			xStream.processAnnotations(Text.class);
			String xml = xStream.toXML(text);
			System.out.println(xml);
			return xml;
		}
	}
	
}
