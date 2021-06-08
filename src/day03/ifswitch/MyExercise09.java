package day03.ifswitch;

import java.util.Scanner;

public class MyExercise09 {
	public static void main(String[] args) {
		/*
		 * 세 개의 서로 다른 숫자를 입력 받는다.(양수)
		 * 
		 * 입력받은 수 중에서 가장 큰 값을 출력하시오
		 * 
		 * 출력형식 >
		 * 숫자1 : 10
		 * 숫자2 : 50
		 * 숫자3 : 7
		 * 
		 * 최댓값 : 50
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 : ");
		int num_1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int num_2 = sc.nextInt();
		System.out.print("숫자3 : ");
		int num_3 = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		if(num_1 > max) max = num_1;
		if(num_2 > max) max = num_2;
		if(num_3 > max) max = num_3;
		
		System.out.println("\n최대값 : " + max);
	}
}
