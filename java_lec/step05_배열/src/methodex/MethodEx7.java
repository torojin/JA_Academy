package methodex;
//call by reference : ������ ���� ����, �ּ� ����
// ��ü �ڷ������� ���, Ŭ����, ������, �迭, �������̽�
// �Ű������� ������ �� ������ ���� ������ ����Ѵ�.
//���� �ڷ����� ��ü������ ������ ��ģ��.

public class MethodEx7 {
	
	//���������Ϳ� ������ �� �� �ִ�
	public static void view1(String str) {
		System.out.println("view1 ������ str : "+str);
		str="������";
		System.out.println("view1 ������ str : "+str);
	}
	
	public static void view2(int[] num) {
		for (int n:num) {
			System.out.println("������ view2�� num : "+n);
		}
//		System.out.println();//�ٹٲ�
		num[2]=300;
		for(int n:num) {
			System.out.println("������ view2�� num : "+n);
		}
	}
	//c��� �迭--> ������, ������ --> �迭
	// char* test[] --> �迭 ������
	// char** tset --> 2���� �迭
	public static void main(String[] args) {
		//str�̶�� �������� ������ happy��� ���ڿ��� ����Ű�� �ִ°�
		String str="happy";
		System.out.println("ȣ���� str : "+str);
		view1(str); //�Լ� ȣ��
		System.out.println("ȣ���� str : "+str);
		System.out.println("----------------------------");
		
		int [] num= {10,20,30,40,50};
		for(int i:num)
		System.out.println("ȣ���� ������ num : "+i);
		
		view2(num);
		for(int i:num)
		System.out.println("ȣ���� ������ num : "+i);
	}

}
