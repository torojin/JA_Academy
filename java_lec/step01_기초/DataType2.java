package step01_����;
//System.out.printf("�޽��� or �����", ����1, ����2, ����3...);
//printf�� �Ҽ��� �Ʒ� ǥ���ϱ� ���� / �Ǽ��� �߶� ����ϱ� ���ؼ� ���� ����Ѵ�.
//�������α׷�, ���ʿ����� printf�� ���� �����Ѵ�.
/* �����
 * %s : String ���ڿ�, char
 * %c : char ���� 1��
 * %f : float, double �Ǽ�
 * %d : int byte ����
 * */

public class DataType2 {

	public static void main(String[] args) {
		String name="ȫ�浿";
		char gender='��';
		double score=85.3;
		int age=25;
		double tall=183.4;
		
		//printf������ +�����ϰ� ,���
		//����� ���Ĺ��ڸ� �������� ��
		//%s�� ������ �Լ��� �����ڰŴ�..?
		System.out.printf("�̸�: %s\n", name);
		System.out.printf("����: %c\n", gender);
		System.out.printf("����: %-10.1f\n", score); //-10 10�ڸ��� ǥ���ϴµ� ���� ���� //-10.1�Ҽ��� �Ʒ� 1�ڸ�
		System.out.printf("����: %10d\n", age); //+10 10�ڸ� ������ ����
		System.out.printf("����: %.2f\n", tall); //�Ҽ��� �Ʒ� 2�ڸ��� ǥ��
		System.out.println("------------------------");
		System.out.println("total : " +String.format("%.1f",score));
	}

}
