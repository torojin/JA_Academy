package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����6] 4���� ���� �ֿܼ��� �Է¹޾� ó���Ͻÿ�
        ����) ���� : M �̸� "����", ������ "����" 
                (if�� �̿�)

[�Է�ȭ��]
Input name: ��̶�
Input gender: F
Input age:  25
Input tall: 173.3 

[���ȭ��]
�̸� : ��̶�
���� : ���� 
���� : 25��
���� : 173.3cm  
 */
public class Exercise06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name;
		char gender;
		int age;
		double tall;
		
		System.out.print("Input name : ");
		name=br.readLine();
		
		System.out.print("Input gender : ");
		gender=br.readLine().charAt(0);//�� 0�� �����...
		
		System.out.print("Input age : ");
		age=Integer.parseInt(br.readLine());
		
		System.out.print("Input tall : ");
		tall=Double.parseDouble(br.readLine());
		
		System.out.println("�̸� : "+name);
		if(gender=='M'|| gender=='m') System.out.println("���� : ����");
		else if(gender=='F'||gender=='f') System.out.println("���� : ����");
		System.out.println("���� : "+age+"��");
		System.out.println("���� : "+String.format("%.1f",tall)+"cm");
	}

}
