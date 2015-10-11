package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;

import pojo.BaseMsg;
import pojo.Text;
import pojo.WXTYPE;
import tools.MyXStream;
import tools.XMLToBean;
import com.thoughtworks.xstream.XStream;

public class Test {
	
	public static void main(String[] args) throws Exception {
//		
//		//xml to bean
//		File file = new File("/Users/mac/Workspaces/MyEclipse 10/ttshopwx/src/news.xml");
//		System.out.println(file.exists());
//		InputStream inputStream = new FileInputStream(file);
//		XMLToBean xmlToBean = new XMLToBean();
//		BaseMsg text = (BaseMsg) xmlToBean.xmlToBean(inputStream, BaseMsg.class);
//		System.out.println(text);
//		
//		if(text.getMsgtype().equals("text")){
//			Text textout = new Text();
//			textout.setFromusername(text.getTousername());
//			textout.setTousername(text.getFromusername());
//			textout.setMsgtype(text.getMsgtype());
//			textout.setContent("you enter "+text.getContent());
//			textout.setCreatetime(text.getCreatetime());
//			textout.setMsgid(text.getMsgid());
//			// bean to 微信xml
//			//Text obj = new Text("hello", "hello1", new Date().getTime(), "text", new Date().getTime(), "this is a test");
//			XStream xStream = MyXStream.initXStream(true);
//			xStream.processAnnotations(Text.class);
//			String out = xStream.toXML(textout);
//			System.out.println(out);
//		}
		System.out.println(WXTYPE.SCAN_EVENT.equalsIgnoreCase("scan"));
	}
	
}
