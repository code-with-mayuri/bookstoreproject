package IplMain;

import java.sql.SQLException;
import java.util.Scanner;

import com.IPLService.IplService;
import com.IplDaoImplement.IplDaoImplement;

public class IplMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String s;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("IPLManagementSystem");
	      System.out.println("1.View IPL");
	      System.out.println("2.Add IPL");
	      System.out.println("3.Update IPL");
	      System.out.println("4.Delete IPL");
	      
	      System.out.println("IPLManagementSystem");
	      IplService ipl=new IplService();
	      do
	      {
	    	  System.out.println("Enter the choice ");
	    	  int choice=sc.nextInt();
	    	  switch(choice)
	    	  {
	    	  case 1:
            ipl.ViewAll();
            break;
	    	  case 2:
	    		  ipl.insertipl();
	    		  break;
	    	  case 3:
	    		  ipl.updateipl();
	    		  break;
	    	  case 4:
	    		  ipl.deleteeipl();
	    		  break;
	    		  }
	    	 
	    	  System.out.println("do you want to continue");
	    	  s=sc.next();
	      }
	      while(s.equals("yes"));
	      
	}
}
