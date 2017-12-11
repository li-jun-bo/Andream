package com.dream.java.pattern.dp12_combining.factory;

public class QuackCounter implements Quackable {
	Quackable duck;
	static int numberOfQuacks;
  
	public QuackCounter(Quackable duck) {
		this.duck = duck;
	}
  
	public void quack() {
		duck.quack();
		numberOfQuacks++;
	}
 
	public static int getQuacks() {
		return numberOfQuacks;
	}
   
	public String toString() {
		return duck.toString();
	}
}
