package day02.operator;

public class Test06 {
	public static void main(String[] args) {
		/*
		 *  ����������
		 *  : ������ =
		 *  +=, -=, *=, /=
		 */
		{
			int a = 5;
			a = a + 1;
			System.out.println(a);
		}
		{
			int a = 5;
			a++;
			System.out.println(a);
		}
		{
			int a = 5;
			a += 1;
			
			// a = a * 10;
			a *= 10;
			System.out.println(a);
		}
	}
}
