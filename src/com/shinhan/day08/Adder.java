package com.shinhan.day08;

public class Adder {
	public static void main(String[] args) {
		Adder adder = new Adder();  //static이 아닌execute에서 쓰려고 객체 생성
		String expr = "3+5+9+1";
		System.out.println(expr + "=" + adder.execute(expr));
		expr = "11+45+77+3";
		System.out.println(expr + "=" + adder.execute(expr));
		expr = "33+51+12+11";
		System.out.println(expr + "=" + adder.execute(expr));
	}
	
	public int execute(String expr) {
		int result = 0;
		String strNum = "";
		for (int i=0;i<expr.length();i++) {
			char c = expr.charAt(i);
			if (c == '+') {
				result += Integer.parseInt(strNum);
				strNum = "";
			} else {
				strNum += c;
			}
		}
		return (result +Integer.parseInt(strNum));
	}
}
