package model.bo;

import java.util.ArrayList;

import model.bean.Wife;
import model.dao.CheckLoginDAO;

public class CheckLoginBO {
	CheckLoginDAO checkLoginDao = new CheckLoginDAO();
	public boolean isValidUser(String username, String password) {
		return checkLoginDao.isExistUser(username, password);
	}
	public ArrayList<Wife> getWifeList(String username){
		return checkLoginDao.getWifeList(username);
	}
}
