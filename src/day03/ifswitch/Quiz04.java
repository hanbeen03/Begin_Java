package day03.ifswitch;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		/*
		 * ȭ�鿡�� ���ڸ� �ϳ� �Է¹޴´�.
		 * �Է¹��� ������ ���� ���� ����Ѵ�.
		 * 
		 * ���� : 7
		 * ���밪 : 7
		 * 
		 * ���� : -7
		 * ���밪 : 7
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("���밪 : " + num);
		} else {
			System.out.println("���밪 : " + (num * -1));
		}
	}
}
