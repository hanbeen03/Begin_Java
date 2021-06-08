package day02.operator;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초를 입력해주세요 : ");
		int time = sc.nextInt();
		
		//int time = 7451;
		
		// 출력결과
		// 7451 초는 ??시간 ??분 ??초 입니다.
		
		/*
		int hour = time / 3600;
		int minute = (time - (hour * 3600)) / 60;
		int second = (time - (hour * 3600)) - (minute * 60);
		*/
		int hour = time / 3600;
		int minute = (time % 3600) / 60;
		int second = time % 60;
		
		System.out.println(time + "초는 " + hour + "시간 " + minute + "분 " + second + "초 입니다.");
		
	}
}
