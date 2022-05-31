package miniproject; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;//참고로 이 경로는 바뀌지않는다

public class SqlConnection { 

	Connection conn; 
	PreparedStatement psmt; 
	ResultSet rs; 
	Scanner sc = new Scanner(System.in);
	

	public void SQL() {

		// 동적로딩-------------------------------------------------------------------------------
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DB연결----------------------------------------------------------------------------------------------
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String db_id = "hr";
		String db_pw = "hr";

		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
				System.out.println("DB 연결 성공");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}