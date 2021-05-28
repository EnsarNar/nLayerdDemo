package nLayerdDemoHomework.business.concretes;

import nLayerdDemoHomework.business.abstracts.UserService;
import nLayerdDemoHomework.dataAccess.abstracts.UserDao;
import nLayerdDemoHomework.entities.concretes.User;

public class UserManager implements UserService {

	UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	};
	
	@Override
	public void add(User user) {
		System.out.println("User Manager göz kýrptý :)");
		this.userDao.add(user);
	}

}
