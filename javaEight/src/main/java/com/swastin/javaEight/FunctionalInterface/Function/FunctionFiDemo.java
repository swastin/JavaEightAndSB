package com.swastin.javaEight.FunctionalInterface.Function;

import java.util.function.Function;

public class FunctionFiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("hi");

Function<Integer,Integer> function =(x)->x*x;
Integer apply = function.apply(5);
System.out.println(apply);
	}

}
