package day03.ifswitch;

public class Test05 {
	public static void main(String[] args) {
		/*
		 * switch
		 * 
		 *  : ���� �񱳽� ���
		 *  
		 *  ; -> �����ݷ�
		 *  : -> �ݷ�
		 *  
		 *  ���ǻ��� :
		 *  switch ���� break�� ������ switch ���� ����������.
		 *  
		 *  
		 *  switch(����) {
		 *  	case ��1:
		 *  		ó������     -> ���İ� ��1�� ���� ���� ���
		 *  		break;
		 *  	case ��2:
		 *  		ó������     -> ���İ� ��2�� ���� ���� ���
		 *  	case ��3:
		 *  		ó������     -> ���İ� ��3�� ���� ���� ���
		 *  	default:
		 *  		ó������
		 *  }
		 */
		
		int v = 2;
		
		switch (v) {
		case 1:
			System.out.println(v + "�Դϴ�.");
			break;
		case 2:
			System.out.println(v * 2 + "�Դϴ�.");
			break;
		case 3:
			System.out.println(v * 3 + "�Դϴ�.");
			break;
		default:
			System.out.println(v * v + "�Դϴ�.");
		}
	}
}
