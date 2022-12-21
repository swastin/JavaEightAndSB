package com.swastin.javaEight.FunctionalInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicatefi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*predicate is used to filter out the element from the Collection */
		Predicate<Integer>p=x->x<10;
		Predicate<Integer>p1=x->x>5;
		boolean test = p.test(20);
		System.out.println(test);
		/*predicate used in collection*/
		List<Integer> List = Arrays.asList(1,2,3,4,5,6,7,8,9,55,66,78,95);
		List<Integer> collect = List.stream().filter(p).collect(Collectors.toList());
		System.out.println(collect);
		/*multiple predicate*/
		List<Integer> List1 = Arrays.asList(1,2,3,4,5,55,66,78,95);
		List<Integer> collect1 = List.stream().filter(p.and(p1)).collect(Collectors.toList());
		System.out.println(collect1);
		/*or predicate*/
		List<Integer> List2 = Arrays.asList(1,2,3,4,5,55,66,78,95);
		List<Integer> collect2 = List.stream().filter(p.or(p1)).collect(Collectors.toList());
		System.out.println(collect2);
		/*Negate*/
		List<Integer> List3 = Arrays.asList(1,2,3,4,5,55,66,78,95);
		List<Integer> collect3 = List.stream().filter(p.negate()).collect(Collectors.toList());
		System.out.println(collect3);
		
		
		
		
		

	}

}
