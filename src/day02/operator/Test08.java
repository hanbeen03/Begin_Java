package day02.operator;
import java.util.Scanner;




public class Test08 {
	public static void main(String[] args) {
		/*
		 * ����ڿ��� �Է� �ޱ�
		 */
		
		// Scanner
		// Scanner <- Ÿ��
		// sc      <- �̸�
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.println("�Էµ� �̸� : " + name);
		System.out.println("�Էµ� ���� : " + age);
		
		/*
		 * nextInt() : int �������� �Է¹ްڴ�.
		 * next() : ���ڿ��� �Է¹ްڴ�.
		 */
		
		/*
		Test t = new Test();
		Random r = new Random();
		String s = new String();
		String s2 = "";
		*/
	}
}
