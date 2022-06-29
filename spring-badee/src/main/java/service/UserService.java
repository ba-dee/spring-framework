package service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UserService {

	public UserService(){
		System.out.println("1----------------------------");
	}
	public UserService(OrderService orderService){
		System.out.println("2----------------------------");
	}
	public void name(){
		System.out.println("my name is apple");
	}
}
