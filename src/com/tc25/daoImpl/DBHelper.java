package com.tc25.daoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tc25.bean.User;

public class DBHelper {

	public static final String DRIVER = "oracle.jdbc.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER = "YICHAO";
	public static final String PWD = "19920310";
	private Connection mConnection;
	public Connection getConnection() {
		try {
			Class.forName(DRIVER);
			if(mConnection == null) {
				mConnection = DriverManager.getConnection(URL,USER,PWD);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mConnection;
	}
	
public static void main(String[] args) {
		
		DBHelper db = new DBHelper();
		ArrayList<User> list = new ArrayList<>();
		try {
			Connection conn = db.getConnection();
			PreparedStatement pStment = conn.prepareStatement("select dvddate from dvdlist where dvdid = 1");
			ResultSet rSet = pStment.executeQuery();
			//pStment.executeUpdate();//--ÔöÉ¾¸Ä.
			Date d = null;
			while (rSet.next()) {
				
				d = rSet.getDate("DVDDATE");
				/*User u = new User();
				u.setUserAcc(rSet.getString("USERACC"));
				u.setUserName(rSet.getString("USERNAME"));
				u.setUserId(rSet.getInt("USERID"));
				u.setUserPwd(rSet.getString("USERPWD"));
				u.setUserPwdTip(rSet.getString("USERPWDTIP"));
				//u.setUserStatus(rSet.getInt("USERSTATUS"));
				list.add(u);*/
				System.out.println(d.toString());
			}
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		
		/*for (User user : list) {
			System.out.println(user);
		}*/
		
	
	}
}
