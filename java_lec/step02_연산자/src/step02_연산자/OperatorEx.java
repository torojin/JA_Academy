package step02_������;

public class OperatorEx {

	public static void main(String[] args) {

		//������ �ʱ�ȭ
		//���� ����ϱ� ���� ����ϴ� ��찡 �ִµ� �׶� ���
		//� �Լ��� ����ؼ� ���� �ʱ�ȭ�� �ϴµ� ....
		String a=null; //����Ʈ �ʱ�ȭ // String a=""; �����͸� ���� ���� ����
		int b=0; //���� �����ʹ� 0���� �ʱ�ȭ 
		float c=0.0f;
		//double z=0.0;//?
		char d='\0'; // �ι��� / null�̶��� �ٸ���..?���� char�� �ʱ�ȭ �� �� ���
		
		System.out.println(a+" "+b+" "+c+" "+d);
				
		
		//--------------------------------------------
		
		//������ �����ε� : ������ ���� ����ϴ°�?? 
		/*
		//���׿����� : ���� 3���ΰ� / �����ڰ� 3��
		//if���� ���
		char code='��';
		String gender;
		
		//�º��� ��ġ�ϴ� �ڷ����� �;��Ѵ�.
		gender=(code=='M' || code=='��')?"man":"woman";
		System.out.println("���� : "+gender);
		
		//��������
		//�÷���ó�� ���
		//�÷��׶�..... ������ ���¸� ��Ÿ���� ��? ��ǥ���ΰ� ���� ����ġ
		boolean ck=true;
		System.out.println(!ck);
		*/
		
		
		//--------------------------------------------
		/* ���׿�����
		int k=5;
		
		//�տ� ��ġ�ϸ� ���� ������
		//����������				
								// ȭ�� 	�޸�
		System.out.println(k++);// 5 	 6
		System.out.println(++k);// 7	 7
		System.out.println(k);	// 7	 7
		System.out.println(--k);// 6	 6
		System.out.println(k--);// 6	 5
		
		int p=3;
		p+=2; // p=p+2 //5
		p*=3; // p=p*3 //15
		p-=2; // 13
		p%=3; // ������ 1 //������ ����
		
		System.out.println(p);
		*/
		
		//-----------------------------------------------
		
		/*
		//boolean ������ �ڷ���
		//�÷���(?)�� ������ ���ϱ� ������ �� ��� ����
		int score=57;
		boolean sw=(score>=70 && score<90);
		
		System.out.println(sw);
		*/
		
		//------------------------------------------------
		
		/*
		//�����ڸ� ��¹����� Ȯ��
		System.out.println(5/3); //1 ��
		System.out.println(5%3); //2 ������
		
		//���迬��?
		int a=5;
		
		System.out.println(a==5); // a�� 5�ΰ�? ������? true
		
		System.out.println(a>=5); // a�� 5���� ũ�ų� ������? true
		
		System.out.println(a!=5); // (����) a�� 5�� �ƴѰ�? �� true �ƴϿ� false
		
		//And ������ ��ġ�� �κ��� �˻��� �� ��� / �Ѵ� ���̸� ��, ���� �ϳ��� ���̸� ����
		//Or ������ �������ִ°�? / ���� �ϳ��� ���̶�� ��
		String str="korea";
		System.out.println(str=="korea" || str=="KOREA"); // str�� korea�ΰ�?
		System.out.println(str=="korea" && str=="KOREA"); // and ������
		
		int score=57;
		System.out.println(score>=70 && score<90); 
		*/
		
	}

}









