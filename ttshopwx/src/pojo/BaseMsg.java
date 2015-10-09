package pojo;

public class BaseMsg {
	/**
	 * 基本组成
	 */
	private String tousername;
	private String fromusername;
	private long createtime;
	private String msgtype;
	private long msgid;
	/**
	 * 文字信息
	 */
	private String content;
	/**
	 * 连接信息
	 */
	private String url;
	/**
	 * 图片信息要素
	 */
	private String picUrl;
	/**
	 * 图片信息, 语音信息,视屏信息 公用 , 图片/语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
	 */
	private String mediaId;
	/**
	 * 语音信息 ,语音格式，如amr，speex等
	 */
	private String format;
	/**
	 * 视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。
	 */
	private String thumbMediaId;
	/**
	 * 地理位置信息
	 */
	private double location_x;
	private double location_y;
	private int scale;
	private String lable;
	private String sendLocationInfo;
	private String poiname;
	/**
	 * 事件信息
	 */
	private String event;
	//事件KEY值，qrscene_为前缀，后面为二维码的参数值 , view里面的url , 自定义菜单的 key 值
	private String eventKey;
	//二维码的ticket，可用来换取二维码图片
	private String Ticket;
	//纬度
	private double latitude;
	//经度
	private double longitude;
	//精度
	private double precision;
	
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
		this.msgtype = msgtype;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getThumbMediaId() {
		return thumbMediaId;
	}
	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
	public double getLocation_x() {
		return location_x;
	}
	public void setLocation_x(double location_x) {
		this.location_x = location_x;
	}
	public double getLocation_y() {
		return location_y;
	}
	public void setLocation_y(double location_y) {
		this.location_y = location_y;
	}
	public int getScale() {
		return scale;
	}
	public void setScale(int scale) {
		this.scale = scale;
	}
	public String getLable() {
		return lable;
	}
	public void setLable(String lable) {
		this.lable = lable;
	}
	public BaseMsg() {
		super();
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getEventKey() {
		return eventKey;
	}
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
	public String getTicket() {
		return Ticket;
	}
	public void setTicket(String ticket) {
		Ticket = ticket;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getPrecision() {
		return precision;
	}
	public void setPrecision(double precision) {
		this.precision = precision;
	}
	@Override
	public String toString() {
		return "BaseMsg [tousername=" + tousername + ", fromusername="
				+ fromusername + ", createtime=" + createtime + ", msgtype="
				+ msgtype + ", msgid=" + msgid + ", content=" + content
				+ ", url=" + url + ", picUrl=" + picUrl + ", mediaId="
				+ mediaId + ", format=" + format + ", thumbMediaId="
				+ thumbMediaId + ", location_x=" + location_x + ", location_y="
				+ location_y + ", scale=" + scale + ", lable=" + lable
				+ ", event=" + event + ", eventKey=" + eventKey + ", Ticket="
				+ Ticket + ", latitude=" + latitude + ", longitude="
				+ longitude + ", precision=" + precision + "]";
	}
	
	
	
	
	
	
	
}
