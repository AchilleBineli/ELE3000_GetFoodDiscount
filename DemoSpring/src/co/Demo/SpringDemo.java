package co.Demo;

import java.lang.String;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;




public class SpringDemo 
{
	public static void main(String[] args){
		Employee emp = new Employee();
		emp.setId(100);
		emp.setAddress("Avenue Lacombe");
		emp.setName("Achille");
		System.out.print("Employee details: " + emp+ "\n");
		
		// Spring way
		BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
		reader.loadBeanDefinitions(new ClassPathResource("EmployeData.xml"));
		
		
		Employee emp1 = (Employee)((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("employee1");
//		Employee emp2 = (Employee)((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("employee2");
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeData.xml");
//		
//		emp1 = (Employee)context.getBean("employee1");
//		emp2 =  context.getBean("employee2", Employee.class);
		
		System.out.print("Employee details: " + emp1 + "\n");
//		System.out.print("Employee details: " + emp2 + "\n");
		
		
	}
}
