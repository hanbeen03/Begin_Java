package day03.ifswitch;

import java.util.Scanner;

public class MyExercise04 {
	public static void main(String[] args) {
		/*
		 * 	숫자를 입력받아서 
		 * 	입력받은 숫자가 "짝수"인지 "홀수"인지 출력
		 * 
		 * 출력 형식 >
		 * 숫자 : 10
		 * 짝수
		 * 
		 * 숫자 : 9
		 * 홀수
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if( num % 2 == 1 )
		{
			System.out.println("홀수");
		}
		else
		{
			System.out.println("짝수");
		}
	}

}
