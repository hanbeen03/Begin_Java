package day02.operator;

public class Test05 {
	public static void main(String[] args) {
		/*
		 *     &&(�Ѵ� ���� ��� ��)
		 *  T      T -> T 
		 *  T      F -> F 
		 *  F      T -> F 
		 *  F      F -> F 
		 * 
		 *     ||(�� �߿� �ϳ��� ���� ��� ��)
		 *  T      T -> T   
		 *  T      F -> T   
		 *  F      T -> T   
		 *  F      F -> F   
		 * 
		 * 
		 *  !T -> F
		 *  !F -> T
		 */
		
		int num = 10;
		System.out.println(num < 20 && num++ % 2 == 0);
		System.out.println(num);
		
		System.out.println((num == 20));
		System.out.println(!(num == 20));
	}
}
