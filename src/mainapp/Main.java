package mainapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
     System.out.println("1.Register here");
     System.out.println("2.Login");
     int x;
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     x = Integer.parseInt(br.readLine());
     RegisterPojo rejisterpojo = new RegisterPojo();
     RegisterDAO  rejisterdao =  new RegisterDAO();
     LoginPojo loginpojo = new LoginPojo();
     LoginDAO  logindao = new LoginDAO();
     
     switch(x)
     {
     case 1:
    	 System.out.println("Enter the first name");
    	 String firstname = br.readLine();
    	 System.out.println("Enter the last name");
    	 String lastname = br.readLine();
    	 System.out.println("Enter the user name");
    	 String username = br.readLine();
    	 System.out.println("Enter the password");
    	 String password = br.readLine();
    	 System.out.println("Enter the email");
    	 String email = br.readLine();
    	 rejisterpojo.setFirstname(firstname);
    	 rejisterpojo.setLastname(lastname);
    	 rejisterpojo.setUsername(username);
    	 rejisterpojo.setPassword(password);
    	 rejisterpojo.setEmail(email);
    	 rejisterdao.addUser(rejisterpojo);
    	 break;
     case 2:
    	 System.out.println("Enter the user name");
    	 String name = br.readLine();
    	 System.out.println("Enter the password");
    	 String pass = br.readLine();
    	 loginpojo.setUsername(name);
    	 loginpojo.setPassword(pass);
		if(logindao.validate(loginpojo)==true)
    	 {
    		 Luck luck = new Luck();
    		 luck.display();
    	 }
    	 else
    		 System.out.println("Incorrect username/password");
    	 break;
     }
     
	}

}
