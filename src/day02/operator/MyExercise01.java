package day02.operator;
import java.util.Scanner;

public class MyExercise01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초를 입력해주세요 : ");
		int time = sc.nextInt();
		
		int hour = time / 3600;
		int minute = (time % 3600) / 60;
		int second = time % 60;
		
		System.out.printf("입력하신 시간은 %d시간 %d분 %d초 입니다", hour, minute, second);		
	}
}
