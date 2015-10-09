package test;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import pojo.AccessToken;
import tools.WeixinUtil;

public class Test4 {
	public static void main(String[] args) {
		AccessToken token = WeixinUtil.getAccessToken();
		String result = WeixinUtil.getAllUsers(token);
		System.out.println(result);
		
		Gson gson = new Gson();
		JsonObject jsonObject = gson.fromJson(result, JsonObject.class);
		System.out.println(jsonObject.get("total"));
		
		
	}
}
