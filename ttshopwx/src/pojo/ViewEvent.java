package pojo;

import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class ViewEvent{
	
	//基本
	@XStreamAlias("ToUserName")
	private String tousername;
	@XStreamAlias("FromUserName")
	private String fromusername;
	@XStreamAlias("CreateTime")
	private long createtime;
	@XStreamAlias("MsgType")
	private String msgtype;
	@XStreamAlias("Event")
	private String event;
	@XStreamAlias("EventKey")
	private String eventKey;

	
	
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
		this.msgtype = WXTYPE.EVENT;
	}
	
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = WXTYPE.VIEW_EVENT;
	}
	public String getEventKey() {
		return eventKey;
	}
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
	public ViewEvent() {
		super();
	}
	public ViewEvent(String tousername, String fromusername, String eventKey) {
		super();
		this.tousername = tousername;
		this.fromusername = fromusername;
		this.createtime = new Date().getTime();
		this.msgtype = WXTYPE.EVENT;
		this.event = WXTYPE.VIEW_EVENT;
		this.eventKey = eventKey;
	}
	@Override
	public String toString() {
		return "ViewEvent [tousername=" + tousername + ", fromusername="
				+ fromusername + ", createtime=" + createtime + ", msgtype="
				+ msgtype + ", event=" + event + ", eventKey=" + eventKey + "]";
	}

	
	
	
}
