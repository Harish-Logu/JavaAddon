package Day12;

import java.sql.*;

public class JDBCMain {

	public static void main(String[] args) throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/java";
		String username = "root";
		String password = "";

		Connection connect = DriverManager.getConnection(url, username, password);
		System.out.println("Driver Loaded");

//		Statement st = connect.createStatement();
		int cid=03;
		String cname="WD";

		String sql = "insert into course values(?,?)";
		PreparedStatement st= connect.prepareStatement(sql);
		st.setInt(1, cid);
		st.setString(2,cname);
		
		st.executeUpdate();
//		int val = st.executeUpdate(sql);
		System.out.println("data Inserted done using prepared statement");
		connect.close();

//		ResultSet rs = st.executeQuery(sql);
//		while(rs.next()){
//		System.out.println(rs.getString(1));
//		}
//		rs.next();
//		System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
//		rs.next();
//		System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
//		rs.next();
//		System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

	}

}
