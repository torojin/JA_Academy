package whileex;
//do~while�� �̿��Ͽ� 65~90 ������ ���� 10�� �����ϱ�

import java.util.Random;

//78 66 ... 88
public class DoWhileEx3 {

	public static void main(String[] args) {
		/* ����� �ڵ�
		int cnt=0; //�ʱⰪ ����
		int num; //���� ����
		do {
			num=(int)(Math.random()*26+65);//���� ����
			System.out.print(num+" "); //���
//			 System.out.print(cnt); //�ݺ��� ����
			++cnt;//������
		}while(cnt<10);
		*/
		
		int a=0;
		do {
			Random rd=new Random();
			int b=rd.nextInt(26)+65;
			System.out.print(b+" ");
			++a;
		}while(a<10);
		
		/*
		 * 
		int b;
		do {
			//������ ���� ����
			Random rd=new Random();
			int a=rd.nextInt(26)+65;
			//���� ���� �ݺ��ϱ�
			b = 10;
			//������ ������ ���
			System.out.println(a);
			//Ƚ���� �����ϴ� ������ ������ ��
			++a;
		}while(b>0);
		*/
	}

}
