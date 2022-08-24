package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

import com.model.Login;
import com.model.Product;

public class ProductsDB {
	
	Connection con;
	
	
	public ProductsDB()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/mohan","root","root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	

	public ArrayList<Product> getProductList() {
		ArrayList<Product> Product_list = new ArrayList<Product>();
		try {
			
			PreparedStatement ps = con
					.prepareStatement("select * from product where quantity>0");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Product i = new Product(rs.getInt(1), rs.getString(2), rs
						.getString(3), rs.getInt(4), rs.getDouble(5));
				Product_list.add(i);
			}
			return Product_list;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public ArrayList<Product> getProductList(String keys[]) {
		ArrayList<Product> Product_list = new ArrayList<Product>();
		try {
						
			PreparedStatement ps = con
					.prepareStatement("select * from product where productid=?");
			for(String key:keys){
			ps.setString(1, key);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				Product i = new Product(rs.getInt(1), rs.getString(2), rs
						.getString(3), rs.getInt(4),rs.getDouble(5));
				Product_list.add(i);
			}
			}
			return Product_list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	
	public void updateProduct(ArrayList<Product> prds)
	{
		try {
		
		
		PreparedStatement ps = con.prepareStatement("update product set quantity=quantity-? where productid=?");

        for(Product p:prds)
        {
        	ps.setInt(1,p.getQuantity());
        	ps.setInt(2,p.getProductid());
        	ps.executeUpdate();
        	
        }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public boolean validateUser(Login login) {
		boolean b = false;
		try {

			
			PreparedStatement ps = con
					.prepareStatement("select * from login where username=? and password=?");
			ps.setString(1, login.getUsername());
			ps.setString(2, login.getPassword());

			ResultSet rs = ps.executeQuery();
			if (!rs.next())
				b = false;
			else
				b = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;

	}
}
