package com.briup.cms.common.text;

import com.briup.cms.bean.Student;
import com.briup.cms.dao.StudentDao;
import com.briup.cms.bean.Category;
import com.briup.cms.dao.CategoryDao;

public class DaoText {
	public static void main(String[] args) {
		StudentDao dao=new StudentDao();
		CategoryDao dao1 = new CategoryDao();
		dao.save(new Student(123L,123123,"2","男",19));
		dao1.save(new Category(1L,"1","1"));
		System.out.println("success!");
	}
}
