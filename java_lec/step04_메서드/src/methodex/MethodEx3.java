package methodex;
//call by value : ���翡 ���� ����
public class MethodEx3 {
	//ȣ���ϴ� ������ ���� �����ϴ� ���
	//�Ű����� ����
	public static void show1(int a, char b, double c, float d) {
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	
	public static int show2(int a, int b, int c) {
		return a+b+c;
	}
	
	public static double show3(int a, int b, int c) {
		return (a+b+c)/3.0;//�ڵ�����ȯ���� �Ǽ���
	}
	
	public static String show4(int a, int b, int c) {
		double avg=(a+b+c)/3.0; //��� ���
		//����� �ڵ� / ��������
		String rs;
		if(avg >= 60) rs="�հ�";
		else rs="���հ�"; 
		return rs;
		/* return�� 2���� ����ϸ� ������ ����.
		 * �� �� ������ ���Ϲ��� �ϳ��� ó��
		if(avg >= 60) return "�հ�"; 
		else return "���հ�";
		*/
	}
	
//�ּҿ��� ���� ������ �ͼ�..

	public static void main(String[] args) {
		show1(10, 'A', 100.4, 90.4f);
		
		//�հ� ���� ����
		int sum=show2(95,85,73);
		
		System.out.println("�հ� : "+sum);
		System.out.println("�հ� : "+show2(95,85,73));
		
		double avg=show3(95,85,73);
		System.out.println("��� : "+String.format("%.2f", avg));
		System.out.printf("��� : %.2f\n",avg);
		
		//�հ� ���հ�
		String result=show4(95,85,73); 
		System.out.println("��� : "+result);
	}

}
