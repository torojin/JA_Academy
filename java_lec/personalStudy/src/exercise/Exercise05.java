package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����5] ������ �Է¹޾� ����Ͻÿ�
        (�ﰢ������ = (�غ� * ����)/2)  

[�Է�ȭ��]
**** �ﰢ���� ���� ���ϱ�  ****
�غ� :  10  
���� :   3
   

[���ȭ��]
���� :   15.00  <--- �Ҽ� 2�ڸ���������Ͻÿ�
 */
public class Exercise05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int bot, hei;
		
		System.out.println("*** �ﰢ���� ���� ���ϱ� ***");
		System.out.print("�غ� : ");
		bot=Integer.parseInt(br.readLine());
		
		System.out.print("���� : ");
		hei=Integer.parseInt(br.readLine());
		
		int tot=(bot*hei);
		double area=tot/2.0;
		System.out.println("���� :"+String.format("%.2f",area));
		
	}

}
