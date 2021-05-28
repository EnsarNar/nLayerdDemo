package nLayerdDemoHomework.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import nLayerdDemoHomework.entities.concretes.User;

public class Utils {
	//Hiçbir alanýn boi býrakýlamayacaghýný saglayan metod
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
        // Parolanýn 6 karakterden fazla olmasý
        
      public static boolean isPasswordCorrect(String password) {
    	  if(password.length()>=6) {
    		  return true;
    	  }else {
    		  System.out.println("Parolanýz 6 karakterden az olamaz !");
    		  return false;
    	  }
      };
       
      //Ad soyadýn iki karakterden oluþmasý
      public static boolean isNameCorrect(String firstName,String lastName) {
    	  if(firstName.length() >=2 && lastName.length() >=2) {
    		  return true;
    	  }else {
    		  System.out.println("Ad veya soyad iki karakterden fazla olmalý !");
    		  return false;
    	  }
      };
      	//Email kullanýlýyor mu ?
      public static boolean isEmailExist(String email,User[] users) {
    	  
    	  for(User user : users) {
    		  if(user.getEmail() == email) {
    			  System.out.println("Email zaten mevcut");
    			  return false;
    		  };
    	  };
    		  return false;
      }
      
      
      
   		//Doðrulama epostasý gönderme
   		public static void sendConfirmationEmail(String email) {
   			
   		};
   		
   	
		
	
	
	
}
