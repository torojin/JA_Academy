package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����4] ������ �Է¹޾� ����Ͻÿ�

[�Է�ȭ��]
Input name : �ε鷡
kor : 90 
eng : 70 
mat : 75

[���ȭ��]
�̸� : �ε鷡
�հ����� : 235��
������� :  78.3   <-- �Ҽ� 1�ڸ���������Ͻÿ�
 */
public class Exercise04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		int kor, eng, mat;
		
		System.out.print("Input name : ");
		name=br.readLine();
		
		System.out.print("kor : ");
		kor=Integer.parseInt(br.readLine());
		
		System.out.println("eng : ");
		eng=Integer.parseInt(br.readLine());
		
		System.out.println("mat : ");
		mat=Integer.parseInt(br.readLine());
		
		int tot;
		tot=kor+eng+mat;
		double avg=tot/3.0;
		System.out.println("�̸� : "+name);
		System.out.println("�հ����� : "+tot+"��");
		System.out.println("������� : "+String.format("%.1f",avg));

	}

}
