package JavaBasic;

import org.springframework.beans.factory.BeanFactory;

import java.util.LinkedHashMap;
import java.util.Map;

public class ComputeIfAbsentTest {


	public static void main(String[] args) {
		Map<String,String> testMap = new LinkedHashMap<>();

		testMap.put("a","a");
		testMap.put("b","b");
		testMap.put("c","c");
		testMap.put("d","d");
		testMap.put("e","e");
		testMap.put("f","f");
		testMap.put("g","g");

		testMap.computeIfAbsent("&&&&&g",(beanName)->{
			do{
				beanName = beanName.substring(1);
				System.out.println(beanName + "------------------");
			}while (!beanName.startsWith("&"));
			return beanName;
		});

		System.out.println(testMap.get("x"));
//		return transformedBeanNameCache.computeIfAbsent(name, beanName -> {
//			do {
//				//循环干掉 &
//				beanName = beanName.substring(BeanFactory.FACTORY_BEAN_PREFIX.length());
//			}
//			while (beanName.startsWith(BeanFactory.FACTORY_BEAN_PREFIX));
//			return beanName;
//		});
	}
}
