package pojo;

import java.util.List;

public class Button {
	
	private String type;
	private String name;
	private String key;
	private String url;
	private List<Button> sub_button;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<Button> getSub_button() {
		return sub_button;
	}
	public void setSub_button(List<Button> sub_button) {
		this.sub_button = sub_button;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Button() {
		super();
	}
	public Button(String type, String name, String key) {
		super();
		this.type = type;
		this.name = name;
		this.key = key;
	}
	
	public static Button createViewButtone(String name,String url){
		Button button = new Button();
		button.setName(name);
		button.setUrl(url);
		button.setType("view");
		return button;
	}
	
}
