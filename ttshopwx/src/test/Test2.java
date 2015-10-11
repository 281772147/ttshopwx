package test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Test2 {
	
	public static void main(String[] args) {
		CloseableHttpClient client = HttpClients.createDefault();
		
		try {
			HttpGet httpGet = new HttpGet("http://ttshop.aliapp.com/customer/viptelephone.jsp");
			CloseableHttpResponse response = client.execute(httpGet);
			System.out.println(response.getStatusLine());
			HttpEntity entity = response.getEntity();
			System.out.println(entity.toString());
			ResponseHandler<String> handler = new ResponseHandler<String>() {
				
				@Override
				public String handleResponse(HttpResponse response)
						throws ClientProtocolException, IOException {
					int status  = response.getStatusLine().getStatusCode();
					if(status>=200 && status <300){
						HttpEntity entity = response.getEntity();
						return entity != null ? EntityUtils.toString(entity) : null;
					}else{
						throw new ClientProtocolException("请求错误");
					}
				}
			}; 
			
			String responsebody = client.execute(httpGet,handler);
			System.out.println(responsebody);
			EntityUtils.consume(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
