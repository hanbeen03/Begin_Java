package day03.ifswitch;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		/*
		 * �� ���� ���� �ٸ� ���ڸ� �Է� �޴´�.(���)
		 * 
		 * �Է¹��� �� �߿��� ���� ū ���� ����Ͻÿ�
		 * 
		 * ������� >
		 * ����1 : 10
		 * ����2 : 50
		 * ����3 : 7
		 * 
		 * �ִ� : 50
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		System.out.print("����3 : ");
		int num3 = sc.nextInt();
		
		/*
		if(num1 > num2 && num1 > num3)
			System.out.println("�ִ밪 : " + num1);
		else if (num2 > num1 && num2 > num3)
			System.out.println("�ִ밪 : " + num2);
		else
			System.out.println("�ִ밪 : " + num3);
		*/
		
		int max = Integer.MIN_VALUE; // �ִ밪 ���� ��
		if( max < num1 )
			max = num1;
		if( max < num2 )
			max = num2;
		if( max < num3 )
			max = num3;
		System.out.println("�ִ밪 : " + max);
		
		
		
		
	}
}
