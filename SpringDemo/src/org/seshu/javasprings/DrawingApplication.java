package org.seshu.javasprings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DrawingApplication {

	public static void main(String[] args) {
	//	Traingle obj = new Traingle();
		
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext abc = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) abc.getBean("xyz");
		triangle.draw();
	}

}
