package day04.loop;

public class Test01 {
	public static void main(String[] args) {
		//ȭ�鿡 100�� 10�� ����϶�
		
		/*
		 for( ; ; )
		   	 ���๮��

		 for(�ʱⰪ;���Ǵ°���;������ ������ �ִ� ���� ����) {
		 	 ���� ��� ����
		   	 ���๮��
		   	 ���๮��
		   	 ���๮��
		 }
		 
		 for(1;2;3) {
		 	4
		 }
		 5
		 
		 �ݺ��� ����� ����
		 1 -> 2(��) -> 4 -> 3
		   -> 2(��) -> 4 -> 3
		   -> 2(��) -> 4 -> 3
		   -> 2(����) -> 5
		 
		 */
		
		/*
		 int i = 0;               -  1   i(0)
		 i < 10                   -  2(��)
  		 System.out.println(100);  - 4
  		 i++;                      -  3   i(1)	
		 i < 10                    -  2(��)
  		 System.out.println(100);  - 4
  		 i++;                      -  3   i(2)	
		 
		 */
		
		for(int i = 0 ; i < 10 ; i++ ) {
			System.out.println(100);	
		}
		
	}
}
