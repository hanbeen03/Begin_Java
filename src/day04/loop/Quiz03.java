package day04.loop;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		//7�� ��� 10���� ����϶�
		/*
		 * 7
		 * 14
		 * 21
		 * 28
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		for(int i = 1 ; i <= 10 ; i++)
			System.out.println(num * i);
		
	}
}
