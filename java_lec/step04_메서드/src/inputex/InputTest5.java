package inputex;
//printf���
public class InputTest5 {

	public static void main(String[] args) {
		int eno=101;
		String ename="ȫ�浿";		
		char dept='A';//�ƽ�Ű �ڵ� ü�� �������� 1byte�� ó�� ������ ���󸶴� ��� ü�谡 �����ڵ��̰ų�.. ����ϸ� 2byte or 3byte���
		double score=85.9;
		
		System.out.printf("�����ȣ : %d\n", eno);
		System.out.printf("����̸� : %s\n", ename);
		System.out.printf("�μ��ڵ� : %c\n", dept);
		System.out.printf("�Ի缺�� : %.2f\n", score);
		
		//�ε��Ҽ�����
	}

}
