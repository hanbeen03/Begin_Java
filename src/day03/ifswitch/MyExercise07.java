package day03.ifswitch;

import java.util.Scanner;

public class MyExercise07 {
	public static void main(String[] args) {
		/*
		 * ������ǰ �븮���� ����.
		 * 
		 * ���ǰ��� ���� ������ �����ϰ� �ִ�.
		 * 
		 * ---------------------------
		 * ���ǰ�  10���� ����   30���� ����   30���� �ʰ�
		 * ������    3% ����      5% ����      8% ����
		 * ---------------------------
		 * 
		 * ������� >
		 * 
		 * ���ǰ�(����) : 10
		 * ���ݾ� : 97000�� �Դϴ�.
		 * 
		 * ���ǰ�(����) : 20
		 * ���ݾ� : 190000 �Դϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ǰ�(����) : ");
		int price = sc.nextInt();
		
		if( price <= 10 )
		{
			System.out.printf("���ݾ� : %.0f�� �Դϴ�", price * 10000 * 0.97);
			//System.out.println("���ݾ� : " + (int)(price * 10000 * 0.97) + "�� �Դϴ�.");
		}
		else if( price <= 30 )
		{
			System.out.printf("���ݾ� : %.0f�� �Դϴ�", price * 10000 * 0.95);
			//System.out.println("���ݾ� : " + (int)(price * 10000 * 0.95) + "�� �Դϴ�.");			
		}
		else
		{
			System.out.printf("���ݾ� : %.0f�� �Դϴ�", price * 10000 * 0.92);
			//System.out.println("���ݾ� : " + (int)(price * 10000 * 0.92) + "�� �Դϴ�.");
		}
	}
}
