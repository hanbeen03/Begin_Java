package day03.ifswitch;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * ����� ���� ���������� �Է��ϼ���
		 * �Է¹��� ���� �������� ���� 5�� �̻��� ���
		 * "�밡�� �Դϴ�"�� ���
		 * 
		 * ���α׷� ���� ��� - ���ǿ� ������� ���
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ���� ������ ���� �Է��ϼ��� : ");
		
		int size = sc.nextInt();
		
		if( size >= 5 ) {
			System.out.println("�밡�� �Դϴ�.");
		}
		
		System.out.println("���α׷� ����");
	}
}
