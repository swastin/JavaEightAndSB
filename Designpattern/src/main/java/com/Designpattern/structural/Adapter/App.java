package com.Designpattern.structural.Adapter;

public class App {
public static void main(String[] args) {
	MallardDuck duck = new MallardDuck();
	 WildTurkey turkey = new WildTurkey();
	 Duck turkeyAdapter = new TurkeyAdapter(turkey);
	 System.out.println("The Turkey says...");
	 turkey.gobble();
	 turkey.fly();
	 System.out.println("\nThe Duck says...");
//	 testDuck(duck);

	
}
}
