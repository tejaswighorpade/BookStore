package com.dao.imple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.BookDao;
import bean.BookBean;

public class BookDaoImple implements BookDao{

	@Override
	public List<BookBean> viewBook() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ArrayList<BookBean> list=new ArrayList<BookBean>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8627capgemini","root","root");
		try {
			PreparedStatement pst=con.prepareStatement("select * from BookStore");
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				BookBean bb=new BookBean();
				bb.setId(rs.getInt("id"));
				bb.setBookname(rs.getString("bookname"));
				bb.setBookno(rs.getInt("bookno"));
				bb.setWritername(rs.getString("writername"));
				bb.setPrize(rs.getInt("prize"));
				bb.setQuantity(rs.getInt("quantity"));
				list.add(bb);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void insertBook(BookBean b) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("this is insert");
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("this is Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8627capgemini","root","root");
		System.out.println("this is connection");
			PreparedStatement pst=con.prepareStatement("insert into BookStore values(?,?,?,?,?,?)");
			pst.setInt(1, b.getId());
			pst.setString(2,b.getBookname());
			pst.setInt(3, b.getBookno());
			pst.setString(4, b.getWritername());
			pst.setInt(5, b.getPrize());
			pst.setInt(6, b.getQuantity());
			System.out.println("dkj");
			pst.executeUpdate();
	        con.close();
			
		
		
	}

	@Override
	public void updateBook(BookBean b) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8627capgemini","root","root");
       
        PreparedStatement pst=con.prepareStatement("update BookStore set bookname=?,bookno=?,writername=?,prize=?,quantity=? where id=?");
        
        pst.setString(1, b.getBookname());
        pst.setInt(2, b.getBookno());
        pst.setString(3, b.getWritername());
        pst.setInt(4, b.getPrize());
        pst.setInt(5, b.getQuantity());
        pst.setInt(6, b.getId());
        pst.executeUpdate();
        con.close();
        
	}

	@Override
	public void deleteBook(BookBean b) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/8627capgemini","root","root");
       
        PreparedStatement pst=con.prepareStatement("delete from BookStore where id=?");
        
       
        pst.setInt(1, b.getId());
        pst.executeUpdate();
        con.close();
		
	}

}
