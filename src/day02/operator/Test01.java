package day02.operator;

public class Test01 {
	public static void main(String[] args) {
		//System.out.println("Hello World");
		/*
		 * 
		 */
		
		/*
		 * ���������
		 * : +, -, *, /(��), %(������)
		 * 
		 * ������Ÿ�� : int(����), char(�ƽ�Ű�ڵ�), String(+)
		 * "1" + "2" -> "12"
		 */
		
		System.out.println(100 + 200);
		// �Ǽ�(�Ҽ����� �����ϴ� ����) : float, double(�⺻Ÿ��)
		// 1.1 -> double, 1.1f or 1.1F -> float
		// ����d, ����D -> double
		// 100 - int / 100 - int 
		// int ��������� int -> ����� int
		// int ��������� double -> ����� double
		// double ��������� int -> ����� double
		
		System.out.println(100 - 200);
		System.out.println(100 / 200);
		System.out.println(100 / 200d);
		System.out.println(100 / 200.0);
		System.out.println(100.0 / 200);
		System.out.println(100 * 200);
		System.out.println(100 % 200);
		System.out.println(75 % 2); //1
		System.out.println(100 % 2); //0
		System.out.println(999 % 2); //1
		
	}
}
