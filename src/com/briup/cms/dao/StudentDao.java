package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.briup.cms.bean.Student;
import com.briup.cms.common.ConnectionFactory;

/**
 * 关于学生信息与数据库交互的类
 * 增删改查方法，不涉及业务逻辑处理
 * @author oyxk
 * @date 2016.5.9
 * */
public class StudentDao {
	/**
	 * 将student对象中的学生信息保存到数据库学生表中
	 * @param 学生对象
	 * */
	public void save(Student student){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				//获取连接
				conn = ConnectionFactory.getConn();
				String sql = "insert into t_student(sno,name,sex,age) values(?,?,?,?)";
				//预处理sql
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, student.getSno());
				pstmt.setString(2, student.getName());
				pstmt.setString(3, student.getSex());
				pstmt.setInt(4, student.getAge());
				//执行sql
				pstmt.executeUpdate();
			}finally{
				if(pstmt!=null){
					pstmt.close();
				}
				if(conn!=null){
					conn.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 查询所有的学生信息
	 * @return 包含学生信息的集合
	 * */
	public List<Student> findAll(){
		return null;
	}
}
