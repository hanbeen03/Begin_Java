package day03.ifswitch;
import java.util.Scanner;

public class MyExercise03 {
	public static void main(String[] args) {
		/*
		 *  ȭ�鿡�� ������ �Է¹޴´�.
		 *  
		 *  �Է¹��� ������ 60�� �̻��̶��
		 *  "�հ�"�� ����ϰ�
		 *  60�� �̸��̶��
		 *  "���հ��� ����Ѵ�.
		 *  
		 *  ������� >
		 *  ���� : _70
		 *  �հ�
		 *  
		 *  ���� : _55
		 *  ���հ�
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		
		if(score >= 60)
		{
			System.out.println("�հ�");
		}
		else
		{
			System.out.println("���հ�");
		}
	}
}
