package methodex;
// call by name
public class MethodEx1 {

	//��� �Լ�(�޼���)
	//void�� ������ ���� ���� ����ϰ� ������.
	
	//public�� �پ��־�� �ܺο��� ������ �����ϴ�.
	//�̺�Ʈ ������? ���콺 Ŭ�� �̵� �� �׷� �͵��� �ϵ���� �ʿ��� �̺�Ʈ��� ǥ���Ѵ�. 
	//�Լ��� ���·�... ������..? 
	
	//���� ����
	//��Ģ������ �Լ��ȿ� �Լ��� �������� �ʴ´�.
	//Ŭ���� �ȿ� Ŭ������ �������� �ʴ´�.
	//��øŬ������ ���������� ������.
	
	
	public static void view() {
		System.out.println("Hello");
//		return; //��������, void�� ��, ������ �̵�
		
	}
	
	public static void star() {
		System.out.println("******");
	}
	
	//���� �Լ�(�޼���)
	
	public static void main(String[] args) {
		view();// call by name
		star();
		
		view();
		star();
	}

}
