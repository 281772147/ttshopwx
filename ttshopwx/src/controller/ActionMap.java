package controller;

import java.util.HashMap;

public class ActionMap {
	
	public static HashMap<String, String> actions = new HashMap<String, String>();

	public static HashMap<String, String> getActions() {
		actions.put("会员注册", "http://ttshop.aliapp.com/customer/viptelephone.jsp?weixinopenid=");
		actions.put("会员卡","http://ttshop.aliapp.com/customer/mycardbyopenid?weixinopenid=");
		actions.put("积分兑换","http://ttshop.aliapp.com/customer/tochangemycredits.action?customer.weixinopenid=");
		return actions;
	}

	public static void setActions(HashMap<String, String> actions) {
		ActionMap.actions = actions;
	}
	
	
	
	
}
