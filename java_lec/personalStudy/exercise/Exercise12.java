package exercise;
/*
 [����12]���θ޼��忡�� ���� �Է¹ް�  compute�޼��带 ȣ���Ͽ� ó���Ͻÿ�
(1)�Է¹��� ����  compute(item, qty, price)�޼����� ó���Ұ�
(2)�������  �ݾ� = ���� * �ܰ� �� �Ͻÿ�

[�Է�ȭ��]
ǰ���� �Է��Ͻÿ� : apple
������ �Է��Ͻÿ� : 10
�ܰ��� �Է��Ͻÿ� : 1200

[���ȭ��]
ǰ�� : apple
�ݾ� : 12000��
 */

import java.util.Scanner;

public class Exercise12 {
	
	//public void�� public static void�� ����?
	//public void�� setter���� ��� / ���� ������?
	//public void ��ü�� ���� ����ؾ� �Ѵ�.
	//public static void �׳� Ŭ���� �޼��� ��ü �ȸ��� ��� ����
	//MethodEx8.java ������ ��
	
	public void compute(String item, int qty, int price) {
		System.out.println("ǰ��  : "+item);
		System.out.println("�ݾ� : "+(qty*price)+"��");
	}

	public static void main(String[] args) {
		Exercise12 ex=new Exercise12();
		//scanner 
		Scanner sc=new Scanner(System.in);
		//�Է�
		String item;
		int qty,price;
		System.out.print("ǰ���� �Է��ϼ��� : ");
		item=sc.nextLine();
		
		System.out.println("������ �Է��ϼ��� : ");
		qty=sc.nextInt();
		
		System.out.println("�ܰ��� �Է��ϼ��� : ");
		price=sc.nextInt();
		
		ex.compute(item, qty, price);
		sc.close();
	}

}