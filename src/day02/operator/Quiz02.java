package day02.operator;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ʸ� �Է����ּ��� : ");
		int time = sc.nextInt();
		
		//int time = 7451;
		
		// ��°��
		// 7451 �ʴ� ??�ð� ??�� ??�� �Դϴ�.
		
		/*
		int hour = time / 3600;
		int minute = (time - (hour * 3600)) / 60;
		int second = (time - (hour * 3600)) - (minute * 60);
		*/
		int hour = time / 3600;
		int minute = (time % 3600) / 60;
		int second = time % 60;
		
		System.out.println(time + "�ʴ� " + hour + "�ð� " + minute + "�� " + second + "�� �Դϴ�.");
		
	}
}
