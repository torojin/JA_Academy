package temp;

import java.util.Random;

//���� : ��ǻ�Ͱ� ������ ���ڸ� �߻�, �ǻ糭��, pseudo random
public class RandomEx {

	public static void main(String[] args) {
//		���� ���� Ŭ���� ����
//		Math Ŭ���� ------
		System.out.println(Math.random());//0-1�̸��� �Ǽ�
		System.out.println((int)(Math.random()*10+1)); //1-11�̸� //������ �ٲٰ� ������ int ĳ����
		System.out.println((int)(Math.random()*31+50)); //50-80 (81�̸�)
		System.out.println((int)(Math.random()*30+51)); //51-80
		
//		RandomŬ���� �̿�
		Random rd=new Random();
		
		int n1=rd.nextInt(101)+0; //0-100
		int n2=rd.nextInt(31)+50; //50-80 (81�̸�)
		int n3=rd.nextInt(41)+30; //30-70 (71�̸�)
		
		System.out.println(n1+" "+n2+" "+n3);
	}

}
