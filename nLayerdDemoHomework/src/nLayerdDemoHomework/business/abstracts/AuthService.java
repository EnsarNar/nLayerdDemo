package nLayerdDemoHomework.business.abstracts;

import nLayerdDemoHomework.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void logIn(String email,String password);
	void logOut();
}
