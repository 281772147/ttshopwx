package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="actionmapping")
public class ActionMapping {
	@Column(name="id")
	private Integer id;
	
	@Column(name="action")
	private String action;
	@Column(name="content")
	private String content;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public ActionMapping() {
		super();
	}
	@Override
	public String toString() {
		return "ActionMapping [id=" + id + ", action=" + action + ", content="
				+ content + "]";
	}
	
	
}
