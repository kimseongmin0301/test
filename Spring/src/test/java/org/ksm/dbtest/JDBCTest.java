package org.ksm.dbtest;
//테스트코드작성

import java.sql.*;
import org.junit.Test;

public class JDBCTest {
	//driver 로드정보
	final String driver = "com.mysql.jdbc.Driver";
	// url 정보
	final String url = "jdbc:mysql://localhost:3306/exam?serverTimezone=Asia/Seoul";
	// userID 정보
	final String user = "root";
	// password 정보
	final String pw = "1234";

	//jdbc 연결 테스트
	@Test
	public void testConnection() throws Exception {
		Class.forName(driver);
		
		try(Connection con = DriverManager.getConnection(url,user,pw)) {
			System.out.println("DB연결성공");
		}catch(Exception e) {
			System.out.println("DB연결실패");
			e.printStackTrace();
		}	
	}
}