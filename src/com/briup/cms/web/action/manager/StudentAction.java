package com.briup.cms.web.action.manager;

import org.apache.struts2.convention.annotation.Action;

import com.briup.cms.bean.Student;
import com.briup.cms.service.IStudentService;
import com.briup.cms.service.impl.StudentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 学生的处理类
 **/
public class StudentAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	private int sno;
	private String name;
	private String sex;
	private int age;
	private IStudentService studentService = new StudentServiceImpl();
	/**
	 * 处理添加学生信息的方法
	 * */
	@Action(value="addStudent")
	public void addStudent(){
		Student student = new Student(null, sno, name, sex, age);
		studentService.add(student);
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
