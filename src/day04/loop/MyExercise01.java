package day04.loop;

public class MyExercise01 {
	public static void main(String[] args) {
		/*
		 * 화면에 1부터 10까지 출력하라
		 * 단, for문을 이용하라..
		 */
		
		// 10, 20, 30, 40, 50
				// for 문을 이용한다.
		
		//7의 배수 10개를 출력하라
				/*
				 * 7
				 * 14
				 * 21
				 * 28
				 */
		
//		for(int i = 1; i <= 10; i++)
//		{
//			System.out.println(i);
//		}
		
//		for(int i = 1; i <= 5; i++)
//		{
//			System.out.println(i * 10);
//		}
		
//		for(int i = 10; i <= 50; i += 10)
//		{
//			System.out.println(i);
//		}
		
//		for(int i = 1; i<= 10; i++)
//		{
//			System.out.println(7 * i);
//		}
		
		for(int i = 1; i<=10; i++)
		{
			System.out.printf("%d * %2d = %2d\n", 7, i, 7*i);
		}
	}
}
