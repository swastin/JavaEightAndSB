package com.Designpattern.structural.Adapter;

public class TurkeyAdapter implements Duck {
Turkey turk;

	public TurkeyAdapter(Turkey turk) {
	super();
	this.turk = turk;
}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
turk.fly();
	}

	@Override
	public void quack() {
		turk.gobble();
		// TODO Auto-generated method stub

	}

}
