package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Wife;

public class CheckLoginDAO {
	public Connection  conn = ConnectionUtils.getConnection();
	public boolean isExistUser(String username, String password) {		
		try {
			Statement stmt = conn.createStatement();
			String query = "SElECT * FROM user WHERE name = '"+username+"'";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(username);
				if(password.equals(rs.getString("password")))
				{
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public ArrayList<Wife> getWifeList(String username){
		ArrayList<Wife> list = new ArrayList<Wife>();
		try {
			Statement  stmt = conn.createStatement();
			String query = "SELECT user_id FROM user WHERE name = '"+username+"'";
			ResultSet rs = stmt.executeQuery(query);
			int user_id = -1;
			while(rs.next()) {
				user_id = rs.getInt("user_id");
			}
			if(user_id>0) {
				query = "SELECT * FROM wife WHERE user_id = '"+user_id+"'";
				rs = stmt.executeQuery(query);
				while(rs.next()) {
					Wife w = new Wife();
					w.setName(rs.getString("name"));
					w.setAddress(rs.getString("address"));
					w.setAlive(rs.getBoolean("alive"));
					list.add(w);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
