package constructor;

public class ConstructorEx7 {

	public static void main(String[] args) {
		//member�� �Ű����� ����
		Member ob1=new Member("�Ƿη�",22);
		ob1.view();
		
		//�Ű����� ���� ��ü�� �����Ϸ��� �ϸ� ����
		//�����ڰ� ���ٸ� ������ �߻� ����
		//�׷��� ����Ʈ �����ڸ� �������
		Member ob2=new Member();
		ob2.view();
	}

}
