package day03.ifswitch;

import java.util.Scanner;

public class MyExercise06 {
	public static void main(String[] args) {
		/*
		 *	�Ե����� ���̵��꿡 � �Դ�.
		 *	���̿� ���� ����� ����ؼ� ����Ѵ�.
		 *
		 *	-----------------------
		 *	0 - 5 : ����
		 *	6 - 11 : 2500��
		 *	12 �̻� : 5000��
		 *	-----------------------
		 *
		 *	������� >
		 *	���� : 4
		 *	����
		 *
		 *	���� : 8
		 *	2500��
		 *
		 *	���� : 22
		 *	5000��
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		if( age < 6 )
		{
			System.out.println("����");
		}
		else if ( age < 12)
		{
			System.out.println("2500��");
		}
		else
		{
			System.out.println("5000��");
		}
	}
}
