package com.sudhir.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void main(String[] args) {

		ApplicationContext  ac = new ClassPathXmlApplicationContext("Spring.xml");
		
		Triangle t = (Triangle) ac.getBean("triangle");
		Edge e1 = (Edge) ac.getBean("edge1");
		Edge e2 = (Edge) ac.getBean("edge2");
		Edge e3 = (Edge) ac.getBean("edge3");
		
		t.setEdge1(e1);
		t.setEdge2(e2);
		t.setEdge3(e3);
		int l1 = e1.getElength();
		int l2 = e2.getElength();
		int l3 = e3.getElength();

		if(l1==l2&&l1==l3) {
			System.out.println("Equilateral Triangle");
		}
		else if(l1!=l2&&l2!=l3&&l1!=l3) {
			System.out.println("Scalene Triangle");
		}
		else {
			System.out.println("Isosceles Triangle");
		}
		
	}

}
