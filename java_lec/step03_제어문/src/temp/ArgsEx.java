package temp;
/*
 * $ java ArgsEx 10 20 30
 * 
 * �� ���� �� : 60
 * 
 */
public class ArgsEx {
	//args�� ���� �ʱ�ȭ�ϴ� �Ͱ� ����
	public static void main(String[] args) {
//		System.out.println(args);//��ü ���
		int a, b, c;
		//���ڿ��� �޾ƿ��� ���̿��� ���ڷ� ����������
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		
		System.out.println("�� ���� �� : "+(a+b+c));
		
	}

}
