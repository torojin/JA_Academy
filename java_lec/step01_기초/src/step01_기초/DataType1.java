package step01_����;

public class DataType1 {

	public static void main(String[] args) {
		String name="ȫ�浿"; //���ڿ� �ڷ���
		int age=23; //4����Ʈ ���� �ڷ��� +2147483647 ~ -2147483648
		char gender='��'; // ���� 1���� '' �ȿ� ��� //���̼������� ���� �� �ڸ� ���� ���ϰ� ���
		float weight=63.4f; // 4����Ʈ �Ǽ� �ڷ��� �ҷ��ڷ������� ����� ���� ���� f���� //�ǹ������� �� ��� ���� 
		double tall=175.5; // 8����Ʈ �Ǽ� �ڷ��� �⺻������ ����ϴ� �Ǽ��ڷ���
		
		//���� �̷� �������� ���
		System.out.println("�̸�: "+name); 
		System.out.println("����: "+age+" ��");
		System.out.println("����: "+gender+"��");
		System.out.println("ü��: "+weight+"kg");
		System.out.println("����: "+tall+"cm");
		
		//�̿� ���� ����� �����ϱ� ���� �� �Ȼ��..
		System.out.println("�̸�: "+name+
							"\n����: "+age+" ��"+
							"\n����: "+gender+"��"+
							"\nü��: "+weight+"kg"+
							"\n����: "+tall+"cm");		 		
		
//		System.out.println("�̸�: ȫ�浿");
//		System.out.println("����: 23");
//		System.out.println("����: ��");
//		System.out.println("ü��: 63.4kg");
//		System.out.println("����: 175.5cm");
		
		// ���� ���� �ּ� ���� Ctrl + Shift + /
		//        �ּ� ���� Ctrl + Shift + \
		// �ε����̼�(����): Ctrl + Shift + f
	}

}
