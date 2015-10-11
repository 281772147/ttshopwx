package pojo;

import java.util.Date;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class News{
	
	//基本
	@XStreamAlias("ToUserName")
	private String tousername;
	@XStreamAlias("FromUserName")
	private String fromusername;
	@XStreamAlias("CreateTime")
	private long createtime;
	@XStreamAlias("MsgType")
	private String msgtype;
	
	//图文消息个数,限制10条,必要
	@XStreamAlias("ArticleCount")
	private int articleCount;
	
	//多条图文消息信息，默认第一个item为大图,注意，如果图文数超过10，则将会无响应,必要
	//private String articles;
	@XStreamAlias("Articles")
	private List<Item> articles; 
	
	public String getTousername() {
		return tousername;
	}
	public void setTousername(String tousername) {
		this.tousername = tousername;
	}
	public String getFromusername() {
		return fromusername;
	}
	public void setFromusername(String fromusername) {
		this.fromusername = fromusername;
	}
	public long getCreatetime() {
		return createtime;
	}
	public void setCreatetime(long createtime) {
		this.createtime = createtime;
	}
	public String getMsgtype() {
		return msgtype;
	}
	public void setMsgtype(String msgtype) {
		this.msgtype = WXTYPE.NEWS;
	}
	public int getArticleCount() {
		return articleCount;
	}
	public void setArticleCount(int articleCount) {
		this.articleCount = articleCount;
	}
	public List<Item> getArticles() {
		return articles;
	}
	public void setArticles(List<Item> articles) {
		this.articles = articles;
	}
	public News() {
		super();
	}
	public News(String tousername, String fromusername, int articleCount,
			List<Item> articles) {
		super();
		this.tousername = tousername;
		this.fromusername = fromusername;
		this.articleCount = articleCount;
		this.articles = articles;
		this.createtime = new Date().getTime();
		this.msgtype = WXTYPE.NEWS;
	}
	
	
	
	
}
