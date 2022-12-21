package com.swastin.javaEight.FunctionalInterface.Function;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class FunctionFiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("hi");
/*Taking input as Integer and output as Integer*/
Function<Integer,Integer> function =(x)->x*x;
Integer apply = function.apply(5);
System.out.println(apply);
/*BiFunction*/
BiFunction<String,String,String> Concat=(x,y)->x+y;
String apply2 = Concat.apply("node",".js");
System.out.println(apply2);
/*IntFunction*/
IntFunction<Integer> intfunction=(x)->x*1;
Integer apply3 = intfunction.apply(10);
System.out.println(apply3);
/*LongFunction*/
LongFunction<Long>longfunction=x->x*x;
Long apply4 = longfunction.apply(123456789);
System.out.println(apply4);
/*DoubleFunction*/

DoubleFunction<Double> doublefunction=x->x*2.0;
Double apply5 = doublefunction.apply(2.1587);
System.out.println(apply5);	
}

}
