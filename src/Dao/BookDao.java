package Dao;


import java.sql.SQLException;
import java.util.List;

import bean.BookBean;



public interface BookDao {
	public List<BookBean>viewBook() throws ClassNotFoundException, SQLException;
	public void insertBook(BookBean b) throws ClassNotFoundException, SQLException;
	public void updateBook(BookBean b) throws ClassNotFoundException, SQLException;
	public void deleteBook(BookBean b) throws ClassNotFoundException, SQLException;

	
}
