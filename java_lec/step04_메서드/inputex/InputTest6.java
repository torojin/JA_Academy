package inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//BufferedReader �о�帮�� �뵵
//InputStreamReader 
//java io class�� �����͸� ó���ϰԲ� ����  ä���� �� �ְ� ������� �ְ�..
public class InputTest6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//��ü ������ �����δ� / ��ü�� : ����� ����..?
		
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);//InputStreamReader�� �ӵ��� ������ ����..?
		
		int eno;
		String ename;
		char dept;
		double score;
		
		System.out.print("�����ȣ�� �Է��ϼ��� : ");// print �ٹٲ޾��°� //println �ٹٲ� �ִ°�
		eno=Integer.parseInt(br.readLine()); //���ڿ��� ���ڷ� ��ȯ���ִ� ĳ�̽�..?����
		
		System.out.print("����̸��� �Է��ϼ��� : ");
		ename=br.readLine();//���ڿ� �޴°� 
		
		System.out.print("�μ��ڵ带 �Է��ϼ��� : ");
		dept=br.readLine().charAt(0);
		
		System.out.print("�Ի缺���� �Է��ϼ��� : ");
		score=Double.parseDouble(br.readLine());
		
		System.out.println("�����ȣ : "+ eno);
		System.out.println("����̸� : "+ ename);
		System.out.println("�μ��ڵ� : "+ dept);
		System.out.println("�Ի缺�� : "+ String.format("%.2f",score)+"��");
		System.out.printf("�Ի缺�� : %.2f��\n",score);		
		
	}

}
