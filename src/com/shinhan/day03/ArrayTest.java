package com.shinhan.day03;

import java.util.Arrays;


//cmd>java com/shinhan/day03/ArrayTest 100 200
//명령형 매개변수
public class ArrayTest {

	public static void main(String[] args) { //숫자가 됐던 문자가 됐던 받기 위해서 String
//		f1();
//		f2();
//		f3();
//		f4();
//		f5();
//		f6();
//		f7();
		
		System.out.println(args.length);
		
		
		if(args.length <2) {
			//main 빠지기
			//return;
			//프로그램 종료
			System.exit(0);  //0:정상종료, -1:비정상종료
		}
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("더하기:"+(a+b));
		
		
	}
	
	
	private static void f7() {
		
	}


	private static void f6() {
		int[] arr1 = new int[] {100, 90, 50, 88};
		int[] arr2 = new int[10];
		int[] arr3 = new int[10];
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.arraycopy(arr1, 0, arr3, 4, arr1.length);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

	private static void f5() {
		//선언+생성...자동 초기화
		int[] arr = new int[5];
		//선언+생성+초기화...길이는 반드시 생략
		int[] arr2 = new int[] {100, 90, 80, 100};
		int[] arr3 = {100, 90, 80, 100};  //new int[] 생략 가능
		int[] arr4;
		arr4 = new int[] {100, 90, 80, 100};  //new int[] 생략 불가
		
		int[][] arr5 = {{100, 90, 80, 100},{100, 90, 80}};
		int[][] arr6;
		arr6 = new int[][] {{100, 90, 80, 100},{100, 90, 80}};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println("-------------------------");
		for(int[] aa:arr6) {
			System.out.println(Arrays.toString(aa));
		}
		
	}

	private static void f4() {
		int[] arr2[];
		arr2 = new int[3][];
		arr2[0] = new int[3];
		arr2[1] = new int[4];
		arr2[2] = new int[2];
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+ "\t");
			}
			System.out.println();
		}
	}

	private static void f3() {
		//2차원배열 : 배열의 배열
		//1.배열변수 선언
		int[][] arr1;
		int[] arr2[];
		int arr3[][];
		
		//2.배열생성...배열길이필수
		arr1 = new int[3][4];
		arr2 = new int[3][];
		arr3 = new int[3][];
		
		//3.배열사용
		System.out.println(arr1[0][0]);
		System.out.println(arr2[0]);

		for(int i=0;i<arr1.length;i++) {
			for(int j=0; j<arr1[1].length;j++) {
				System.out.printf("%d행 %d열: %d\n", i, j, arr1[i][j]);
			}
		}
		
		//2차원 배열 확장for
		for(int[] aa:arr1) {
			for(int su:aa) {
				System.out.print(su+"\t");
			}
			System.out.println();
		}
	}

	private static void f2() {
		//1. 배열변수 선언
		int[] scores;
		
		//2. 배열생성 ...배열의 개수는 필수-> 생성시 자동으로 초기화
		//(정수 : 0, 실수:0.0, boolean:false, 객체:null)
		scores = new int[26];
		
		//3. 배열사용
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;
		int total = 0;
//		System.out.println(scores.length);
		
		//일반for
		for(int index=0;index<scores.length;index++) { //length: 변수, length(): 함수
			System.out.println("scores["+index+"]="+scores[index]);
		}
		
		//향상for, 확장for
		for(int score : scores) {
			total += score;
		}
		
		System.out.println("총점은 : "+ total);
		
	}

	private static void f1() {
		//배열 : 하나의 이름으로 같은 타입의 Heap에 연속 공간을 만드는 자료구조
		//1. 배열변수 선언
		int[] arr1=null;
		int arr2[];
		double[] arr3;
		boolean[] arr4;
		String[] arr5;
		
		//2. 배열생성 ...배열의 개수는 필수-> 생성시 자동으로 초기화
		//(정수 : 0, 실수:0.0, boolean:false, 객체:null)
		arr1 = new int[5];
		arr3 = new double[6];
		arr4 = new boolean[6];
		arr5 = new String[6];
		
		//3. 배열사용
		System.out.println(arr1[0]);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
	}

}
