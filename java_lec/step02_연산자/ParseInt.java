package step02_������;

public class ParseInt {

	public static void main(String[] args) {
		String a="100"; // ���ڿ� 100
		String b="200"; // ���ڿ� 200
		
		int a1=Integer.parseInt(a); //���ڿ� 100�� ���ڿ� 100���� ��ȯ "100" --> 100
		int b1=Integer.parseInt(b);
		
		System.out.println(a+b); //������ �ǹ�
		System.out.println(a1+b1);//���ϱ� �ǹ�			
	}
}