package day04.loop;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * ȭ�鿡 1���� 10���� ����϶�
		 * ��, for���� �̿��϶�..
		 */
		
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.println(i+1);
		}
		
		int val = 1;
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.println(val++);
		}
		
		
		for(int i = 1 ; i <= 10 ; i++)
		{
			System.out.println(i);
		}
	}
}
