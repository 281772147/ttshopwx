package tools;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.thoughtworks.xstream.XStream;

import controller.EventHandler;
import controller.MessageHandler;
import pojo.BaseMsg;
import pojo.Text;
import pojo.WXTYPE;


public class ConnectFilter implements Filter {
	
	private Logger logger = LoggerFactory.getLogger(ConnectFilter.class);
	
	private String signature;
	private String timestamp;
	private String nonce;
	private String echostr;
	private static String TOKEN = "ttshopwx";
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		String method = request.getMethod();
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/xml");
		if(method.equalsIgnoreCase("get")){
			//签名
			signature = request.getParameter("signature");
			//时间撮
			timestamp = request.getParameter("timestamp");
			//随机数
			nonce = request.getParameter("nonce");
			//随机数字符串
			echostr = request.getParameter("echostr");
			
			//字典排序
			String[] strs = new String[3];
			strs[0] = TOKEN;
			strs[1] = timestamp;
			strs[2] = nonce;
			Arrays.sort(strs);
			StringBuilder tempstr = new StringBuilder();
			for (String string : strs) {
				tempstr.append(string);
			}
			//加密
			String checkstr = SHA1.encode(tempstr.toString());
			if (signature.equals(checkstr)){
				response.getWriter().write(echostr);
			}
		}else{
			PrintWriter writer = response.getWriter();
			InputStream inputStream = request.getInputStream();
			XMLToBean xmlToBean = new XMLToBean();
			try {
				BaseMsg baseMsg = (BaseMsg) xmlToBean.xmlToBean(inputStream, BaseMsg.class);
				if(baseMsg.getMsgtype().equals(WXTYPE.TEXT)){
					MessageHandler handler = new MessageHandler();
					String xml = handler.dispatcher(baseMsg);
					writer.write(xml);
					writer.flush();
					writer.close();
				}else if(baseMsg.getMsgtype().equals(WXTYPE.EVENT)){
					EventHandler eventHandler = new EventHandler();
					String xml = eventHandler.dispatcher(baseMsg);
					writer.write(xml);
					writer.flush();
					writer.close();
				}else{
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		TOKEN = arg0.getInitParameter("token");
		System.out.println(TOKEN);
	}
	
	

}
