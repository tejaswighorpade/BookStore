package UI;

import java.sql.SQLException;
import java.util.Scanner;

import services.BookService;



public class BookMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String s;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Book Store");
	      System.out.println("1.View Book");
	      System.out.println("2.Add Book");
	      System.out.println("3.Update Book");
	      System.out.println("4.Delete Book");

	      BookService b=new BookService();

	   
	      do
	      {
	    	  
	    	  System.out.println("Enter the choice ");
	    	  int choice=sc.nextInt();
	    	  switch(choice)
	    	  {
	    	  case 1:
	    		  
	    		    b.viewBook();
	    		    break;
	    	  case 2:
	    		  
                b.insertBook();
	    		
	    		 	 break;
	    		 
	    	  case 3:
	    		  
               b.updateBook();
	      		
	     		 
	     		 break;
	    	  case 4:
	    		  

	        		b.deleteBook();
	      		 
	      		 break; 	 
	    		  
	    	  }
	    	  System.out.println("do you want to continue");
	    	   s=sc.next();

	       }
		  while(s.equals("yes"));


	}

	}


