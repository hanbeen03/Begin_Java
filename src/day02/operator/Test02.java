package day02.operator;

public class Test02 {
	public static void main(String[] args) {
		/*
		 * 	�� ������
		 * 	: ������ ����� ���� ������ ��ȯ�Ѵ�.
		 * 	: >, <, >=, <=, ==, !=
		 */
		System.out.println(1 > 2); //false
		System.out.println(1 < 2); //true
		System.out.println(2 >= 2); //true
		System.out.println(2 <= 2); //true
		System.out.println(1 == 2); //false
		System.out.println(1 != 2); //true
		
		
		/*
		 * �⺻(primitive) �ڷ���
		 * - ����(4����)
		 *  : int(�⺻), byte, short, long
		 * - �Ǽ�(2����)
		 *  : float(���ڵ� f or F), double(�⺻, ���ڵ� d or D)
		 * - ����(1����)
		 *  : char('a')
		 * - ��(1����)
		 *  : boolean - true, false ������ ��´�.
		 */
		
		boolean bool = true;
		//boolean bool = "true"; XXXX
		
		boolean b1 = 1 > 3;
		System.out.println(b1);
		System.out.println(b1);
		
		System.out.println(1 > 3);
	}
}
