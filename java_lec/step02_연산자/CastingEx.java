package step02_������;
//ĳ������ �� 
//�º��� �캯�� ���� �ؾ���
//�� ũ�� �� ������ �ڵ�����ȯ
//�� �۰� �� ũ�� �ڵ�����ȯ�� �ȵ�
public class CastingEx {

	public static void main(String[] args) {
		
		int pay=857650;
		double tax=0.033;
		//int tax=(int)0.033; //����ȯ�� �º��� �������� �캯�� ��ȯ
		//�º��� �캯�� ��ġ�ǵ��� ����� �ٰ�
		
		int rPay=pay-(int)(pay*tax);
		
		System.out.println("�� ���ɾ� : "+ rPay);
		
		/*
		int k=87, e=88, m=75;
		int tot=k+e+m;
		//double avg=tot/3; //(�Ǽ�/����) => ����
		//double avg=(double)tot/3; // �ڵ�����ȯ
		double avg=tot/3.0; // �ڵ�����ȯ / �Ź� ĳ�������� ���鶧 �̷������� �� 
		
		
		System.out.println("���� : "+tot);
		System.out.printf("��� : %.2f", avg);
		*/
		
		/*
		byte a=100;
		int b=a; //�ڵ� ����ȯ
		
		double c=73.45;
		int d=(int)c; // ���� ����ȯ
		
		//������ �ڷ������� ĳ�����Ѱ�
		System.out.println(a + " "+b);
		//�Ǽ� �ڷ����� ����ȭ������ ��ģ��.
		System.out.println(c + " "+d);
		*/
	}

}
