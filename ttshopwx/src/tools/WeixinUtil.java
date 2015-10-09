package tools;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import pojo.AccessToken;
import pojo.JsonResult;
import pojo.Menu;

public class WeixinUtil {
	
	private static final String APPID = "wx94bdf1d400ade68b";
	private static final String APPSECRET = "aef6d0b09adc0ba84460b31a878b4508";
	
	public static AccessToken getAccessToken(){
		String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
		AccessToken token = new AccessToken();
		//String requrl = url.replace("APPID", "wx6b4128c483aa5624").replace("APPSECRET", "2130bf8fa7d09b4f1717611e3e3533e4");
		String requrl = url.replace("APPID", APPID).replace("APPSECRET", APPSECRET);
		CloseableHttpClient client = HttpClients.createDefault();
		try {
			HttpGet get = new HttpGet(requrl);
			ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
				@Override
				public String handleResponse(HttpResponse arg0)
						throws ClientProtocolException, IOException {
					int status = arg0.getStatusLine().getStatusCode();
					if(status>=200 && status <300){
						HttpEntity entity = arg0.getEntity();
						return entity != null? EntityUtils.toString(entity):null;
					}else{
						throw new ClientProtocolException("Unexpected response status: " + status);
					}
				}
			};
			String responsebody = client.execute(get, responseHandler);
			Gson gson = new GsonBuilder().create();
			token = gson.fromJson(responsebody, AccessToken.class);
			System.out.println(token);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return token;
	}
	
	public static JsonResult createMenu(AccessToken token,Menu menu){
		JsonResult jsonResult = new JsonResult();
		String posturl = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
		posturl = posturl.replace("ACCESS_TOKEN", token.getAccess_token());
		
		Gson gson = new GsonBuilder().create();
		String json = gson.toJson(menu);
		
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(posturl);
		post.setEntity(new StringEntity(json, "utf-8"));
		
		try {
			HttpResponse response = client.execute(post);
			HttpEntity entity = response.getEntity();
			if (entity!=null) {
				String out = EntityUtils.toString(entity, "utf-8");
				jsonResult = gson.fromJson(out, JsonResult.class);
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonResult;
	}
	
	public static JsonResult deleteMenu(AccessToken token){
		JsonResult jsonResult = new JsonResult();
		String posturl = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";
		posturl = posturl.replace("ACCESS_TOKEN", token.getAccess_token());
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost post = new HttpPost(posturl);
		try {
			HttpResponse response = client.execute(post);
			HttpEntity entity = response.getEntity();
			if (entity!=null) {
				String out = EntityUtils.toString(entity, "utf-8");
				Gson gson = new Gson();
				jsonResult = gson.fromJson(out, JsonResult.class);
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonResult;
	}
	
	
	public static String getAllUsers(AccessToken token){
		String url = "https://api.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN";
		String result = "";
		url = url.replace("ACCESS_TOKEN", token.getAccess_token());
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet get = new HttpGet(url);
		try {
			HttpResponse httpResponse = client.execute(get);
			HttpEntity entity = httpResponse.getEntity();
			if(entity!=null){
				result = EntityUtils.toString(entity, "utf-8");
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(result.contains("errcode")){
			System.out.println("请求出错");
		}
		return result;
	}
	
}
