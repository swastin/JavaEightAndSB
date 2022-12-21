package com.swastin.javaEight.FunctionalInterface.Function;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;

public class FunctionFiDemo {

	public static void main(String[] args) {	
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
/*IntToDouble */
IntToDoubleFunction intToDoubleFunction=(x)->x;
Double intToDouble =intToDoubleFunction.applyAsDouble(10);
System.out.println(intToDouble.getClass());
/*InttoLong */
IntToLongFunction intToLongFunction=(x)->x;
Long intLong=intToLongFunction.applyAsLong(12345);
System.out.println(intLong.getClass());

/*like above we have
 * DoubleToInt
 * DoubleToLong
 * LongToInt
 * LongToDouble
 * 
 */
}

}
