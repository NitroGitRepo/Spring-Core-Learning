package com.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config5.xml");
     Teacher t = (Teacher)context.getBean("tec");
     
     Demo d = (Demo)context.getBean("demo");
     System.out.println(d.getY());
     
//     SpelExpressionParser temp = new SpelExpressionParser();
//     Expression ex = (Expression) temp.parseExpression("22+22");
//     //System.out.print(ex.getValue());
	}

}
