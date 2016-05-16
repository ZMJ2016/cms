package com.briup.cms.common.text;

import com.briup.cms.common.ConnectionFactory;
public class ConnTest {
	public static void main(String[] args) {
		try {
			System.out.println(ConnectionFactory.getConn());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
