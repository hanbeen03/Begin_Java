package day03.ifswitch;

import java.util.Scanner;

public class MyExercise09 {
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
		int num_1 = sc.nextInt();
		System.out.print("����2 : ");
		int num_2 = sc.nextInt();
		System.out.print("����3 : ");
		int num_3 = sc.nextInt();
		
		int max = Integer.MIN_VALUE;
		if(num_1 > max) max = num_1;
		if(num_2 > max) max = num_2;
		if(num_3 > max) max = num_3;
		
		System.out.println("\n�ִ밪 : " + max);
	}
}
