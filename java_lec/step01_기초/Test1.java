package step01_����;

/* ����
 * ���� ������ ����� ���� �����Ͽ�
 * ����� ����ϼ��� (�̸�, ����, �Ի�����)
 * 
 * ��� ---
 * �� �̸��� ��ȣ���̸� ������ �����̰�
 * �Ի� ������ 85.35���Դϴ�.
 * 
 */

public class Test1 {
	public static void main(String[] args) {
		String name="��ȣ��";
		char gender='��';
		double score=85.35;
		System.out.println("�� �̸��� "+name+"�̸� "+"������ "+gender+"���̰�\n"+"�Ի� ������ "+score+"���Դϴ�.");
		
		System.out.printf("�� �̸��� %s�̸� ������ %c���̰�\n", name,gender);
		System.out.printf("�Ի� ������ %.2f���Դϴ�.", score);
	}
}
