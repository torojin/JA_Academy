package ifEx;
/* �Է� �׽�Ʈ
 *  �̸� : ��ȣ��
 *  ���� : ��
 *  ���� : 23
 *  
 *  �̸��� ��ȣ���Դϴ�.
 *  ������ �����Դϴ�
 *  ���̴� 23�� �Դϴ�.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest3 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		String name;
		char gender;
		int age;
		
		System.out.print("�̸� : ");
		name=br.readLine();
		System.out.print("���� : ");
		gender=br.readLine().charAt(0);
		System.out.print("���� : ");
		age=Integer.parseInt(br.readLine());
		
		System.out.println("�̸��� "+name+"�Դϴ�.");
		System.out.println("������ "+gender+"�� �Դϴ�.");
		System.out.println("���̴� "+age+"�� �Դϴ�.");
		
		System.out.printf("�̸��� %s�Դϴ�.\n", name);
		System.out.printf("������ %c���Դϴ�.\n", gender);
		System.out.printf("���̴� %d�Դϴ�.", age);
		
		
	}

}
