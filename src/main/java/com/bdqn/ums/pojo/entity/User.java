package com.bdqn.ums.pojo.entity;

import javax.xml.crypto.Data;
import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 7444982593147488756L;
	private Long id;
	private String name;
	private String cellphone;
	private Data createTime;
	private Data updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public Data getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Data createTime) {
		this.createTime = createTime;
	}

	public Data getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Data updateTime) {
		this.updateTime = updateTime;
	}
}
