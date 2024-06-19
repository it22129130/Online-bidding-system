package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class contactDBUtil {

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<contact> validate(String fullname,String email,String message)
	{
		ArrayList<contact> con =new ArrayList<>();
		
		//create database connection
	
		//validate
		try {
			con = (ArrayList<contact>) DBConnect.getConnection();
			stmt = ((Connection) con).createStatement();
			String sql = "Select * from bidding where fullname ='"+fullname+"'and email='"+email+"'and message'"+message+"'";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				int idcustomer=rs.getInt(1);
				String fullname1 =rs.getString(2);
				String email1 =rs.getString(3);
				String message1 =rs.getString(4);
				
				contact c = new contact(idcustomer,fullname,email,message);
				con.add(c);
			}
				
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static boolean insertcustomer(String fullname,String email,String message) {
		
		boolean isSuccess =false;
		
		//create db connection
		
		
		try {
			
			con =DBConnect.getConnection();
			stmt =con.createStatement();
			String sql = "insert into bidding values (0,'"+fullname+"','"+email+"','"+message+"')";
			int rs =stmt.executeUpdate(sql);
			
			if(rs>0) {
				
				isSuccess =true;
			}else {
				isSuccess=false;
			}
		
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		return isSuccess;
		
	}
	
	public static boolean updatecustomer(int idcustomer,String fullname,String email,String message){
		
		try {
			con =DBConnect.getConnection();
			stmt =con.createStatement();
			String sql ="update bidding set fullname='"+fullname+"',email='"+email+"',message='"+message+"'"
					+"where idcustomer ='"+idcustomer+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess =true;
			}else {
				isSuccess=false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
		
	}
	
	public static List<contact> getCustomerDetails(String idcustomer){
	
		int convertedidcustomer =Integer.parseInt(idcustomer);
		
		ArrayList<contact> cus =new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt =con.createStatement();
			String sql ="select * from bidding where idcustomer='"+convertedidcustomer+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				int idcustomer1 =rs.getInt(1);
				String fullname =rs.getString(2);
				String email =rs.getString(3);
				String message =rs.getString(4);
				
				contact c =new contact(idcustomer1,fullname,email,message);
				cus.add(c);
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return cus;
	}
	
	public static boolean deleteCustomer(String idcustomer) {
		
		int convId =Integer.parseInt(idcustomer);
		
		try {
			
			con = DBConnect.getConnection();
			stmt =con.createStatement();
			String sql ="delete from bidding where idcustomer='"+convId+"'";
			int r =stmt.executeUpdate(sql);
			
			if(r>0) {
				isSuccess =true;
			}else {
				isSuccess =false;
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
	
	
	
}
