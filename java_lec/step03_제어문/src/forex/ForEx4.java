package forex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * BufferedReader�� �̿��Ͽ� �ۼ�
 * 
 * 1. ���ڸ� �Է¹ޱ�(�빮��)
 * 2. �����ϰ� �빮�� 30���� �߻��Ͽ� ȭ�鿡 ���
 * 3. �߻��� ���� �� �Է��� ���ڰ� ����� ����ϱ�
 * 
 * --���
 * ���� �Է� : K
 * X H G D H I U D R ... K W E R
 * 
 * K�� ���� : 5
 * 
 */
//TIP
//�ƽ�Ű�ڵ� ���
//for���� ���ư��� �帧�� �ľ��ϸ� k�� ���� ���� �� �ִ�
public class ForEx4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		char cap; //�Է°� ����
		char x; //������ ����
		int test=0; //�񱳰� ������ ���� ����
		
		//1. ���� �Է� �ޱ� ���� �ڵ�
		System.out.print("���� �Է� : ");
		cap=br.readLine().charAt(0); //�Է� �ޱ� ���� ���
		
		//2. ���� ���ڸ� 30�� ����ϱ� ���� �ݺ���
		for(int i=1;i<30;i++) {
			x=(char)(Math.random()*26+65);//65~91 //�Ǽ����� ���������� ����ȯ/char�� ������ ����� ���� ���ڰ����� ����´�
			System.out.print(x+" ");
			//test�� char���� �ƴϴ�
			//3.�Է°� K�� ������ ������Ű�� ���� �� ����
			if(cap==x) {
				++test;
			}
		}
		//4.�Է¹��� ������ ����ϱ� ���� print��
		System.out.println("\n"+cap+"�� ���� : "+test);
		
	}

}
