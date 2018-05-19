package com.hotpot.entity;

import java.io.Serializable;

public class User implements Serializable {

    private Integer id;
    private String name;
    private String birthday;
    private String address;
    //省略getXxx()、setXxx()
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}