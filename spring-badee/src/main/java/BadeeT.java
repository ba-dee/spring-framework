import cofnig.AppConfig;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import service.UserService;

import java.util.Locale;

public class BadeeT {

	public static void main(String[] args) {

		//1.扫描
		//2.创建非懒加载的单利bean

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	}
}
