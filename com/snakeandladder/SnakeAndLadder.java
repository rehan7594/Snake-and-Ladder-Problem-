package com.snakeandladder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		//when a player rolls the die
		int output=(int)(Math.random() * 6) + 1;
		System.out.println("The dice number is: "+ output);
	}

}
