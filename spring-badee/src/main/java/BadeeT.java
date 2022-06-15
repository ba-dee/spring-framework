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

//		ApplicationContext
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		/**BeanDefinition**/
//		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//		beanDefinition.setBeanClass(UserService.class);
//		beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
//		beanDefinition.setInitMethodName("name");
//		context.registerBeanDefinition("user", beanDefinition);
//		context.refresh();
//		System.out.println(context.getBean("user",UserService.class));
//		System.out.println(context.getBean("user",UserService.class));

//		/**beanDefinitionReader**/
//		AnnotatedBeanDefinitionReader annotatedBeanDefinitionReader = new AnnotatedBeanDefinitionReader(context);
//		annotatedBeanDefinitionReader.register(UserService.class);
//		context.refresh();
//		System.out.println(context.getBean("userService"));


//		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(context);
//		xmlBeanDefinitionReader.loadBeanDefinitions();


//		/**ClassPathBeanDefinitionScanner**/
//		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(context);
//		context.refresh();
//		scanner.scan("service");
//		System.out.println(context.getBean("userService"));

//
//		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//		beanDefinition.setBeanClass(UserService.class);
//		beanFactory.registerBeanDefinition("user", beanDefinition);
//		System.out.println(beanFactory.getBean("user"));
//		for (String beanDefinitionName : context.getBeanDefinitionNames()) {
//
//			System.out.println(beanDefinitionName);
//		}

//		System.out.println(context.getMessage("test", null,null));
//		try{
//			Resource resource = context.getResource("file://C:\\Users\\Administrator\\Desktop\\log\\recovery-consumer.log");
//			resource.getFilename();
//			System.out.println(resource.contentLength());
//
//			Resource[] resources = context.getResources("classpath:service/*.class");
//			for (Resource resource1 : resources) {
//				System.out.println(resource1.contentLength());
//				System.out.println(resource1.getFilename());
//			}
//
//
//		}catch (Exception e){
//			e.printStackTrace();
//		}
//
////		for (String s : context.getEnvironment().getSystemEnvironment().keySet()) {
////
////			System.out.println(s + "-------------");
////		}
//
//		System.out.println(context);
//
//		System.out.println("=============================================");
//		for(String s: context.getEnvironment().getSystemProperties().keySet()){
//			System.out.println(s + "-------------");
//		}
		//@PropertySource("classpath:spring.properties");

		System.out.println(context.getEnvironment().getSystemEnvironment());

		System.out.println("=============================================");

		System.out.println(context.getEnvironment().getSystemProperties());

		System.out.println(context.getEnvironment().getProperty("os.version") + "----------------");
	}
}
