package nLayerdDemoHomework.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nLayerdDemoHomework.entities.concretes.User;

public class Utils {
	//Hi�bir alan�n boi b�rak�lamayacagh�n� saglayan metod
	public static boolean userValidator(User user) {
    	if(user.getEmail().isEmpty() 
    		|| user.getFirstName().isEmpty()
    		|| user.getLastName().isEmpty()
    		|| user.getPassword().isEmpty()) {
    		
    		return true;
    	}else {
    		return false;
    	}
	
    };
    	// Email regex
	public static boolean eMailValidator(String email) {
		
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);
        System.out.println(email +" : "+ matcher.matches());
        return matcher.matches();
        
	}
        // Parolan�n 6 karakterden fazla olmas�
        
      public static boolean isPasswordCorrect(String password) {
    	  if(password.length()>=6) {
    		  return true;
    	  }else {
    		  System.out.println("Parolan�z 6 karakterden az olamaz !");
    		  return false;
    	  }
      };
       
      //Ad soyad�n iki karakterden olu�mas�
      public static boolean isNameCorrect(String firstName,String lastName) {
    	  if(firstName.length() >=2 && lastName.length() >=2) {
    		  return true;
    	  }else {
    		  System.out.println("Ad veya soyad iki karakterden fazla olmal� !");
    		  return false;
    	  }
      };
      	//Email kullan�l�yor mu ?
      public static boolean isEmailExist(String email,User[] users) {
    	  
    	  for(User user : users) {
    		  if(user.getEmail() == email) {
    			  System.out.println("Email zaten mevcut");
    			  return false;
    		  };
    	  };
    		  return false;
      }
      
      
      
   		//Do�rulama epostas� g�nderme
   		public static void sendConfirmationEmail(String email) {
   			
   		};
   		
   	
		
	
	
	
}
