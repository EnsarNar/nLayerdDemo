
import nLayerdDemoHomework.business.concretes.UserManager;
import nLayerdDemoHomework.dataAccess.concretes.HibernateUserDao;
import nLayerdDemoHomework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"ASDASD","sdasa","Ensar","Nar");
		
		//private int id;
		//private String password;
		//private String email;
		//private String firstName;
		//private String lastName;
		
		UserManager userManager = new UserManager(new HibernateUserDao());
		
		userManager.add(user);
		
	}

}
