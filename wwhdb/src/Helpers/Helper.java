package Helpers;

import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Entities.Admin;

public class Helper {
	//static DBManager dbm = new DBManager();
	//static Connection con = dbm.getConnection();
	//static Statement st = null;
	//ResultSet rs = null;
	
	public static boolean confirm(String str) {

		String msg;
		switch(str) {
		case "add_admin":
			msg = "Sind Sie sicher, dass Sie dieser Admin addieren m�chten?";
			break;
		case "delete_admin":
			msg = "Sind Sie sicher, dass Sie dieser Admin l�schen m�chten?";
			break;
		case "update_admin":
			msg = "Sind Sie sicher, dass Sie dieser Admin aktualisieren m�chten?";
			break;
		case "update_personal":
			msg = "Sind Sie sicher, dass Sie dieser Personal aktualisieren m�chten?";
			break;
		case "delete_personal":
			msg = "Sind Sie sicher, dass Sie dieser Personal l�schen m�chten?";
			break;
		case "add_personal":
			msg = "Sind Sie sicher, dass Sie dieser Personal addieren m�chten?";
			break;
		default:
			msg = str;
			break;
		}
		
		int res = JOptionPane.showConfirmDialog(null, msg, "Achtung!!!", JOptionPane.YES_NO_OPTION);
		if(res == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/*public static Object[] sqlSuche(String table, String column, String key) {
		Object[] rest = new Object[10];
		String query = "SELECT * FROM ? WHERE ? = ?";
	    	try {
	    		st = con.createStatement();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	
	    	
	    return rest;
	}*/
}
