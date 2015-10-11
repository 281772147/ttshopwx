package pojo;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class Link{
	
	//基本
	@XStreamAlias("ToUserName")
	private String tousername;
	@XStreamAlias("FromUserName")
	private String fromusername;
	@XStreamAlias("CreateTime")
	private long createtime;
	@XStreamAlias("MsgType")
	private String msgtype;
	//文字消息
	@XStreamAlias("Title")
	private String title;
	
	@XStreamAlias("Description")
	private String description;
	
	@XStreamAlias("Url")
	private String url;
	
	@XStreamAlias("MsgId")
	private long msgid;

	
	
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
		this.msgtype = WXTYPE.LINK;
	}
	public long getMsgid() {
		return msgid;
	}
	public void setMsgid(long msgid) {
		this.msgid = msgid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Link() {
		super();
	}
	public Link(String tousername, String fromusername, String url,String title,String desc) {
		super();
		this.tousername = tousername;
		this.fromusername = fromusername;
		this.createtime = new Date().getTime();
		this.msgtype = WXTYPE.LINK;
		this.msgid = new Date().getTime();
		this.url = url;
		this.title = title;
		this.description = desc;
	}
	@Override
	public String toString() {
		return "Link [tousername=" + tousername + ", fromusername="
				+ fromusername + ", createtime=" + createtime + ", msgtype="
				+ msgtype + ", title=" + title + ", description=" + description
				+ ", url=" + url + ", msgid=" + msgid + "]";
	}
	
	
	
}
