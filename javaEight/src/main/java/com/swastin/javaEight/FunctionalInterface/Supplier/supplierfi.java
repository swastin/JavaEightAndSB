package com.swastin.javaEight.FunctionalInterface.Supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class supplierfi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Take no input but provide the out put*/
		Supplier<LocalDateTime> sup=()->LocalDateTime.now();
		LocalDateTime localDateTime = sup.get();
		System.out.println(localDateTime);
	}

}
