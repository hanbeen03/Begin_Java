package day02.operator;
import java.util.Scanner;

public class MyExercise01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ʸ� �Է����ּ��� : ");
		int time = sc.nextInt();
		
		int hour = time / 3600;
		int minute = (time % 3600) / 60;
		int second = time % 60;
		
		System.out.printf("�Է��Ͻ� �ð��� %d�ð� %d�� %d�� �Դϴ�", hour, minute, second);		
	}
}
