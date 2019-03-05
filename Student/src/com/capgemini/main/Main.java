package com.capgemini.main;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.capgemini.pojo.StudentClass;

public class Main {
	public static void main(String[] args)
	{
		  Resource resource=new ClassPathResource("NewFile.xml");  
		    BeanFactory factory=new XmlBeanFactory(resource);  
		      
		    StudentClass student=(StudentClass)factory.getBean("studentbean");  
		    student.displayInfo();  
	}

}
