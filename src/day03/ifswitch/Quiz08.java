package day03.ifswitch;

import java.util.Scanner;

public class Quiz08 {
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
		int num1 = sc.nextInt();
		System.out.print("숫자2 : ");
		int num2 = sc.nextInt();
		System.out.print("숫자3 : ");
		int num3 = sc.nextInt();
		
		/*
		if(num1 > num2 && num1 > num3)
			System.out.println("최대값 : " + num1);
		else if (num2 > num1 && num2 > num3)
			System.out.println("최대값 : " + num2);
		else
			System.out.println("최대값 : " + num3);
		*/
		
		int max = Integer.MIN_VALUE; // 최대값 뽑을 때
		if( max < num1 )
			max = num1;
		if( max < num2 )
			max = num2;
		if( max < num3 )
			max = num3;
		System.out.println("최대값 : " + max);
		
		
		
		
	}
}
