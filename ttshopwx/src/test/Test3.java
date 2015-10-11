package test;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import pojo.AccessToken;
import pojo.Button;
import pojo.JsonResult;
import pojo.Menu;
import tools.WeixinUtil;

public class Test3 {
	public static void main(String[] args) {
		//自定义菜单
		Button sub_button1 = new Button("location_select", "我的位置", "V1001_SUB_TEXT");
		Button sub_button2 = new Button("pic_weixin", "微信相册", "V1001_SUB_TEXT2");
		Button sub_button3 = new Button("pic_photo_or_album", "系统相册", "V1001_SUB_TEXT3");
		Button sub_button4 = new Button("scancode_push", "扫一扫", "V1001_SUB_TEXT4");
		
		List<Button> list = new ArrayList<Button>();
		list.add(sub_button1);
		list.add(sub_button2);
		list.add(sub_button3);
		list.add(sub_button4);
		
		Button button = new Button();
		button.setName("自定义菜单");
		button.setSub_button(list);
		Button button1 = Button.createViewButtone("TTShop", "http://ttshop.aliapp.com");
		Button button2 = Button.createViewButtone("百度搜索", "http://www.baidu.com");
		
		List<Button> menulist = new ArrayList<Button>();
		menulist.add(button);
		menulist.add(button1);
		menulist.add(button2);
		
		Menu menu = new Menu();
		menu.setButton(menulist);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(menu);
		System.out.println(json);
		
		AccessToken token = WeixinUtil.getAccessToken();
		
		JsonResult jsonResult = WeixinUtil.createMenu(token, menu);
		
		System.out.println(jsonResult.getErrcode()==0?"创建成功":"创建失败");
		//删除 menu
//		AccessToken token = WeixinUtil.getAccessToken();
//		WeixinUtil.deleteMenu(token);
		
	}
}
