package services;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dao.imple.BookDaoImple;

import bean.BookBean;


public class BookService {
	public void viewBook() throws ClassNotFoundException, SQLException
	{
		List<BookBean>list=new  BookDaoImple().viewBook();
		for(BookBean i:list)
		{
			System.out.println(i);
		}	
	}
	public void insertBook() throws ClassNotFoundException, SQLException
	{
		BookBean bb=new BookBean();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		System.out.println("enter the Bookname");
		String  bookname=sc.next();
		System.out.println("enter the BookNo");
		int bookno=sc.nextInt();
		System.out.println("enter the Writername");
		String writername=sc.next();
		System.out.println("enter the Prize");
		int prize=sc.nextInt();
		System.out.println("enter the Quantity");
		int quantity=sc.nextInt();
		System.out.println("hii");
		bb.setId(id);
		bb.setBookname(bookname);
		bb.setBookno(bookno);
		bb.setWritername(writername);
		bb.setPrize(prize);
		bb.setQuantity(quantity);
		System.out.println("end");
		new BookDaoImple().insertBook(bb);
		
	}
	public void updateBook() throws ClassNotFoundException, SQLException
	{
		BookBean bb=new BookBean();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the Bookname");
		String  bookname=sc.next();
		System.out.println("enter the BookNo");
		int bookno=sc.nextInt();
		System.out.println("enter the Writername");
		String writername=sc.next();
		System.out.println("enter the Prize");
		int prize=sc.nextInt();
		System.out.println("enter the Quantity");
		int quantity=sc.nextInt();
		System.out.println("enter the id");
		int id=sc.nextInt();
		
		bb.setBookname(bookname);
		bb.setBookno(bookno);
		bb.setWritername(writername);
		bb.setPrize(prize);
		bb.setQuantity(quantity);
		bb.setId(id);
		new BookDaoImple().updateBook(bb);
	}
	public void deleteBook() throws ClassNotFoundException, SQLException
	{
		BookBean bb=new BookBean();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the id");
		int id=sc.nextInt();
		bb.setId(id);
		
		new BookDaoImple().deleteBook(bb);
	}
}
