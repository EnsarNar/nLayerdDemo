package nLayerdDemoHomework.dataAccess.concretes;

import java.util.List;

import nLayerdDemoHomework.dataAccess.abstracts.UserDao;
import nLayerdDemoHomework.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi ->" + user.getFirstName() + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		
		System.out.println("Hibernate ile silindi ->" + user.getFirstName() + user.getLastName());
	}

	@Override
	public void update(User user) {
		
		System.out.println("Hibernate ile güncellendi ->" + user.getFirstName() + user.getLastName());
	}

	@Override
	public User getById(int id) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

}
