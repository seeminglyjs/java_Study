package jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/notice?serverTimezone=UTC";
		String sql = "SELECT * FROM NOTICE";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,"root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		System.out.println("정상실행");
		rs.close();
		st.close();
		con.close();

	}

}
