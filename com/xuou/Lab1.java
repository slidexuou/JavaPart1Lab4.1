package com.xuou;

public class Lab1 {
	public static void main(String[] args) {
		int score = 79;

		if (score >= 80) {
			System.out.println("Good");
		} else if (score >= 50 && score < 80) {
			System.out.println("Normal");
		} else {
			System.out.println("Fail");
		}
		Hands();
	}

	public static void Hands() {
		int score = 40;
		boolean isHandSome = true;
		if ((isHandSome == true) && ((score <= 100) || (score >= 0))) {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}
	}
}
