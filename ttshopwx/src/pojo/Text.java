package pojo;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class Text{
	
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
	@XStreamAlias("Content")
	private String content;
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
		this.msgtype = WXTYPE.TEXT;
	}
	public long getMsgid() {
		return msgid;
	}
	public void setMsgid(long msgid) {
		this.msgid = msgid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Text() {
		super();
	}
	public Text(String tousername, String fromusername, String content) {
		super();
		this.tousername = tousername;
		this.fromusername = fromusername;
		this.createtime = new Date().getTime();
		this.msgtype = WXTYPE.TEXT;
		this.msgid = new Date().getTime();
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Text [tousername=" + tousername + ", fromusername="
				+ fromusername + ", createtime=" + createtime + ", msgtype="
				+ msgtype + ", msgid=" + msgid + ", content=" + content + "]";
	}
	
}
