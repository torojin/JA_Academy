package methodex;

public class MethodEx2 {

	//���� Ÿ�� �Լ� ����
	public static int view1() {
		return 10;
	}
	//���� Ÿ���� char..?
	public static char view2() {
		return 'A';
	}
	
	public static float view3() {
		return 50.3f;
		//50.3���θ� ���� double������ �ν�
	}
	
	public static String view4() {
		return "Hello";
	}
	
	public static double view5() {
		return 100.4;
	}
	
	public static boolean view6() {
		return true; //or false
	}
	public static void main(String[] args) {
		int a=view1(); System.out.println(a);//������ �Լ��� ����
		char b=view2(); System.out.println(b);
		float c=view3(); System.out.println(c);
		
		System.out.println(view3()); //���°� ������ �̷� ������ ��µ� ������ ex.float=float, String=String
		System.out.println(view4());
		System.out.println(view5());
		System.out.println(view6());
		
	}

}
