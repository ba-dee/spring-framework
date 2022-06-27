package service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class UserServiceFactoryBean  implements FactoryBean<UserService>, SmartFactoryBean<UserService> {

	@Override
	public UserService getObject() throws Exception {
		UserService userService=  new UserService();
		return userService;
	}

	@Override
	public Class<?> getObjectType() {
		return UserService.class;
	}

	@Override
	public boolean isEagerInit() {
		return true;
	}
}
