package com.swastin.javaEight.FunctionalInterface.Consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Consumerfi {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		/*consumer take the input form the user but return nothing*/
		Consumer<Integer> consume=i->System.out.println("the square of value "+i+"  is  "+i*i);
		consume.accept(5);
		/*BiConsumer*/
		BiConsumer<Integer,Integer> consume1=(i,j)->System.out.print(i*j);
		consume1.accept(4, 5);
/**
 * there is primitive datatype spcific consumer
 * IntConsumer,LongConsumer and DoubleConsumer
 * 
 * */
	}

}
