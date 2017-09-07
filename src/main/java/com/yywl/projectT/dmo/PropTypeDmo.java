package com.yywl.projectT.dmo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 道具类型
 * @author jphil
 *
 */
@Entity
@Table(name="prop_type")
public class PropTypeDmo implements Serializable{

	private static final long serialVersionUID = 6164892425698555954L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private int uniqueId;
	
	private String name;

	private String title;

	private String photoUrl;
	
	private String description;
	
	private int badge;
	
	private int money;

	public PropTypeDmo() {
		super();
	}

	public int getBadge() {
		return badge;
	}

	public String getDescription() {
		return description;
	}

	public Integer getId() {
		return id;
	}
	
	public int getMoney() {
		return money;
	}
	
	public String getName() {
		return name;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public String getTitle() {
		return title;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}

	public PropTypeDmo(Integer id, int uniqueId, String name, String title, String photoUrl, String description,
			int badge, int money) {
		super();
		this.id = id;
		this.uniqueId = uniqueId;
		this.name = name;
		this.title = title;
		this.photoUrl = photoUrl;
		this.description = description;
		this.badge = badge;
		this.money = money;
	}

}
