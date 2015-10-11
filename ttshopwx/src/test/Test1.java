package test;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import pojo.Item;
import pojo.News;
import tools.MyXStream;

public class Test1 {
	public static void main(String[] args) {
		Item item = new Item("hihihi", "suosiisisis", "19191.jpg", "sss.do");
		Item item1 = new Item("hihihi1", "suosiisisis1", "19191111.jpg", "sss111.do");
		
		List<Item> articles = new ArrayList<Item>();
		articles.add(item);
		articles.add(item1);
		News news = new News("hello_hh", "bbhhh_ss", articles.size(), articles);
		
		XStream xStream = MyXStream.initXStream(true);
		Class[] types = new Class[2];
		types[0] = Item.class;
		types[1] = News.class;
		xStream.processAnnotations(types);
		
		String xml = xStream.toXML(news);
		System.out.println(xml);
		
		
	}
}
