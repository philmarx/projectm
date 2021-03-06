package com.yywl.projectT.dmo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="admin")
public class AdminDmo implements Serializable{

	private static final long serialVersionUID = -9061175148895759254L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String username;
	@JsonIgnore
	private String password;
	
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSuper(boolean isSuper) {
		this.isSuper = isSuper;
	}

	private boolean enable=true;

	private boolean isSuper;
	
	public boolean getIsSuper() {
		return isSuper;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	private String token;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date expire;

	public Date getExpire() {
		return expire;
	}

	public void setExpire(Date expire) {
		this.expire = expire;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public AdminDmo() {
		super();
	}

	public AdminDmo(Long id) {
		super();
		this.id = id;
	}
	
}
