package inputex;

public class InputTest7 {

	public static void main(String[] args) {
		//argument�� �� String�������� �ν��ؼ� ����ȯ�� ������Ѵ�.
		int eno=Integer.parseInt(args[0]);//���ڿ��� �����°� ������ ��ȯ����
		String ename=args[1];
		char dept=args[2].charAt(0);
		double score=Double.parseDouble(args[3]);
		
		System.out.printf("�����ȣ : %d\n����̸� : %s\n�μ��ڵ� : %c\n�Ի缺�� : %.1f\n",eno,ename,dept,score);
	}

}


