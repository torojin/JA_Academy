package step02_������;

//java.io�� �ִ� ��Ű���� ����� �� �ְ� ����� ��
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//�ܼ� : ǥ�� ����� ��ġ
public class InputTest1 {
	//throws IOException ���ܻ�Ȳ �߻��� ������..?
	public static void main(String[] args) throws IOException {
		//Ctrl + space�� ������ import��
		InputStreamReader isr=new InputStreamReader(System.in);//Ű���忡�� ���� ������..??
		BufferedReader br=new BufferedReader(isr); //Ű���忡�� ���޹��� �����͸�...
		
		
		String name;//���ڿ� ����
		char gender;
		int age;
		Float weight;
		double tall;
		
		//.��� �ǹ� 
		//1.���� 
		//br�Ʒ� readLine�̶�� �Լ��� �ִٰ� ���� �ȴ�.
		//2.�Է� �Լ��� �Է����� ��´�

		System.out.print("�̸��� �Է��ϼ��� : ");
		name=br.readLine();
		
		System.out.print("������ �Է��ϼ��� : ");
		gender=br.readLine().charAt(0);//0��° �ڸ��� �ִ� char�� �̾Ƴ�...??
		// charAt(i) : ���� 1�� ����
		//i�� �����ϰ��� �ϴ� ���� �ε���
		//�Է��� charAt(i) �տ� ��� :
		
		//System.out.println("�ѱ۰� ��ǻ��".charAt(2));
		
		System.out.print("���̸� �Է��ϼ��� : ");
		age=Integer.parseInt(br.readLine());
		
		System.out.print("ü�߸� �Է��ϼ��� : ");
		weight=Float.parseFloat(br.readLine());
		
		System.out.print("���带 �Է��ϼ��� : ");
		tall=Double.parseDouble(br.readLine());
		
		//�̸� �Է� �� ��µ�
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+gender);
		System.out.println("���� : "+age);
		System.out.println("ü�� : "+weight);
		System.out.println("���� : "+tall);
	}

}


















