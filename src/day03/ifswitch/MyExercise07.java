package day03.ifswitch;

import java.util.Scanner;

public class MyExercise07 {
	public static void main(String[] args) {
		/*
		 * 전자제품 대리점에 갔다.
		 * 
		 * 물건값에 따라서 할인을 진행하고 있다.
		 * 
		 * ---------------------------
		 * 물건값  10만원 이하   30만원 이하   30만원 초과
		 * 할인율    3% 할인      5% 할인      8% 할인
		 * ---------------------------
		 * 
		 * 출력형식 >
		 * 
		 * 물건값(만원) : 10
		 * 계산금액 : 97000원 입니다.
		 * 
		 * 물건값(만원) : 20
		 * 계산금액 : 190000 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("물건값(만원) : ");
		int price = sc.nextInt();
		
		if( price <= 10 )
		{
			System.out.printf("계산금액 : %.0f원 입니다", price * 10000 * 0.97);
			//System.out.println("계산금액 : " + (int)(price * 10000 * 0.97) + "원 입니다.");
		}
		else if( price <= 30 )
		{
			System.out.printf("계산금액 : %.0f원 입니다", price * 10000 * 0.95);
			//System.out.println("계산금액 : " + (int)(price * 10000 * 0.95) + "원 입니다.");			
		}
		else
		{
			System.out.printf("계산금액 : %.0f원 입니다", price * 10000 * 0.92);
			//System.out.println("계산금액 : " + (int)(price * 10000 * 0.92) + "원 입니다.");
		}
	}
}
