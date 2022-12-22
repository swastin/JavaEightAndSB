package com.swastin.JavaReflection.ClassDemo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class App {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
Student s=new Student();
Class<? extends Student> class1 = s.getClass();
//System.out.println(class1);
Field[] fields = class1.getFields();
for (int i = 0; i < fields.length; i++) {
	System.out.println(fields[i]);
}
Method[] methods = class1.getMethods();
for (int i = 0; i < fields.length; i++) {
	System.out.println(methods[i]);
}
int modifiers = class1.getModifiers();
System.out.println(modifiers);
/*Demo Example*/

Integer Int=new Integer(10);
Class<? extends Integer> Intclass = Int.getClass();
Method[] methods2 = Intclass.getMethods();

System.out.println(); 





}	
}
