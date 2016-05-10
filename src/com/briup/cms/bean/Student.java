package com.briup.cms.bean;

/**
 * 学生类 JavaBean
 * 用来存储学生的信息
 **/
public class Student {
	//1.私有属性
	private Long id;
	private int sno;
	private String name;//编号
	private String sex;
	private int age;
	
	//2.构造函数
	public Student() {
		
	}
	public Student(Long id, int sno, String name, String sex, int age) {
		super();
		this.id = id;
		this.sno = sno;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	//3.setters和getter方法
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
