package com.lgs.lab.interface2;

public class Main {

	public static void main(String[] args) {
		
		MyCalculator calc = new MyCalculator();
		calc.a = 5;
		calc.b = 3;
		
		MyCalculator.viewCalcResult(calc.plus());
		MyCalculator.viewCalcResult(calc.minus());
		MyCalculator.viewCalcResult(calc.multiply());
		MyCalculator.viewCalcResult(calc.devide());
		
		System.out.println();
		
		MyCalculator calc2 = new MyCalculator(8, 4);
		
		MyCalculator.viewCalcResult(calc2.plus());
		MyCalculator.viewCalcResult(calc2.minus());
		MyCalculator.viewCalcResult(calc2.multiply());
		MyCalculator.viewCalcResult(calc2.devide());
	}

}
