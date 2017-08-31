package com.za.tutorial.mvc;

public class PersonBeanModel {
	private String name = null;
	private String mail = null;
	private String tel = null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail= mail;
	} 
	public void doSomething() {
		setName("["+getName()+"]");
		setMail("["+getMail()+"]");
	}
}
