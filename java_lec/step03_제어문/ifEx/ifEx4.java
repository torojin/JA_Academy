package ifEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ��ø if�� ���
 * 3�� ������ ������ �Է� �޾� �հ� ���հ� ����ϱ�
 * 3�� ������ ���� 40 �̻��̾�� �ϰ� ����� 60�̻��̾�� "�հ�"
 * ����� 60�� ������ 1���� �����̶� 40�̸��̶�� �������� "���հ�"
 * ����� 60 �̸��̸� "���հ�" ���
 * 
 * --���
 * ���� ���� �Է� : 75
 * ���� ���� �Է� : 80
 * ���� ���� �Է� : 100
 * ��� = �հ�
 * ��� = �������� ���հ�
 */
public class ifEx4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		int kor, eng, mat, tot;
		double avg;
		
		//40���� or..?
		System.out.print("���� ���� �Է� : ");
		kor=Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		eng=Integer.parseInt(br.readLine());
		System.out.print("���� ���� �Է� : ");
		mat=Integer.parseInt(br.readLine());
		
		tot=kor+eng+mat;
		avg=tot/3.0;
		
		// || or, && and
		/*
		//�� �ڵ�
		if(kor>=40 && eng>=40 && mat>=40 || avg>=60) {
			System.out.println("�հ�");
			if(avg<=60) {
				System.out.println("���հ�");
			}else {
				
			}
		}else {
			System.out.println("�������� ���հ�");
		}
		*/
		
		//����� �ڵ�
		if(avg>=60) {
			if(kor<40 || eng<40 || mat<40) {
				System.out.println("�������� ���հ�");
			}else {
				System.out.println("�հ�");
			}
		}else {
			System.out.println("���հ�");
		}
		
		
	}

}
