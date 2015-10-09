package pojo;

public class WXTYPE {
	
	public static final String TEXT = "text";
	public static final String IMAGE = "image";
	public static final String VOICE = "voice";
	public static final String VIDEO = "video";
	public static final String SHORTVIDEO = "shortvideo";
	public static final String LOCATION = "location";
	public static final String LINK = "link";
	public static final String EVENT = "event";
	public static final String NEWS = "news";
	
	//自定义菜单跳转事件
	public static final String VIEW_EVENT = "view";
	//自定义菜单点击事件
	public static final String CLICK_EVENT = "click";
	//上传定位事件
	public static final String LOCATION_EVENT = "location";
	//关注一个已关注的工众号时(重复添加)
	public static final String SCAN_EVENT = "scan";
	//关注公众号事件
	public static final String  SUBSCRIDE_EVENT = "subcride";
	
	//菜单事件
	//location_select：弹出地理位置选择器的事件推送
	public static final String LOCATION_SELECT_EVENT = "location_select";
	//扫码推送事件
	public static final String  SCANCODE_PUSH_EVENT = "scancode_push";
	//扫码不推送 , 返回获取的信息
	public static final String  SCANCODE_WAITMSG_EVENT = "scancode_waitmsg";
	//pic_sysphoto：弹出系统拍照发图的事件推送
	public static final String  PIC_SYSPHOTO_EVENT = "pic_sysphoto";
	//pic_photo_or_album：弹出拍照或者相册发图的事件推送
	public static final String  PIC_PHOTO_OR_ALBUM_EVENT = "pic_photo_or_album";
	//pic_weixin：弹出微信相册发图器的事件推送
	public static final String  PIC_WEIXIN_EVENT = "pic_weixin";
	
			
	
	
	
	
}
