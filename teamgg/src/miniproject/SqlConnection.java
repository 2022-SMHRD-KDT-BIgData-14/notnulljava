package miniproject; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;//����� �� ��δ� �ٲ����ʴ´�

public class SqlConnection { 

	Connection conn; 
	PreparedStatement psmt; 
	ResultSet rs; 
	Scanner sc = new Scanner(System.in);
	

	public void SQL() {

		// �����ε�-------------------------------------------------------------------------------
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DB����----------------------------------------------------------------------------------------------
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String db_id = "hr";
		String db_pw = "hr";

		try {
			conn = DriverManager.getConnection(url, db_id, db_pw);
			if (conn != null) {
				System.out.println("DB ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}