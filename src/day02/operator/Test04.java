package day02.operator;

public class Test04 {
	public static void main(String[] args) {
		
		/*
		 *  ++�� �����̸� �տ� ���� ��
		 *  a = a + 1;
		 *  int b = a;
		 *  
		 *  ++�� �����̸� �ڿ� ���� ��
		 *  int b = a;
		 *  a = a + 1;
		 */
		{
			int a = 5;
			int b = ++a;
			System.out.println(a);
			System.out.println(b);
		}
		
		{
			int a = 5;
			int b = a++;
			System.out.println(a);
			System.out.println(b);
		}
		
		{
			int a = 5;
			/*
			 * a = a + 1;
			 * System.out.println(a);
			 * 
			 * System.out.println(a);
			 * a = a + 1;
			 */
			System.out.println(a++); //5
			System.out.println(a);   //6
			System.out.println(++a); //7
		}
	}
}
