package step01_����;

/*
 * float ������ ����� 75.3
 * double ������ ����� 89.53�� ���� ������ �� 
 * 
 * System.out.print();�� �ѹ��� ����Ͽ� ����ϼ���
 * 
 * --���
 * ���� ������ 75.3���̰�
 * ���� ������ 89.53���Դϴ�.
 */
public class Test3 {

	public static void main(String[] args) {
		float kor=75.3f;
		double mat=89.53;
		
		System.out.print("���� ������ "+kor+"���̰�\n"+"���� ������ "+mat+"���Դϴ�.\n");
		System.out.println("���� ������ "+kor+"���̰�\n"+"���� ������ "+mat+"���Դϴ�.");
		System.out.printf("���� ������ %.1f ���̰� \n���� ������ %.2f���Դϴ�.\n",kor,mat);
	}

}
