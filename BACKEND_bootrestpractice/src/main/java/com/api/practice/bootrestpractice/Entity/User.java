package com.api.practice.bootrestpractice.Entity;


public class User {
private int id;
	
    private String name;
    private int age;
    private String city;
    private String phone;
    
    public User(int id, String name, int age, String city, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.phone = phone;
	}

    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
    
    

}
