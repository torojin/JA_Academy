package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 1.�簢�� 2.�ﰢ�� 3.�� 4.����
 * �����ϼ��� : 1
 * �簢���� ���õǾ����ϴ�.
 * 
 * 1.�簢�� 2.�ﰢ�� 3.�� 4.����
 * �����ϼ��� : 4
 * *** �����մϴ� ***
 * 
 */
public class WhileEx3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//while loop�ȿ� switch��
		int n;
		while(true) {
			System.out.print("1.�簢�� 2.�ﰢ�� 3.�� 4.����\n�����ϼ��� : ");
			n=Integer.parseInt(br.readLine());
			switch(n) {
			case 1: System.out.println("�簢���� �����Ͽ����ϴ�."); break;
			case 2: System.out.println("�ﰢ���� �����Ͽ����ϴ�."); break; 
			case 3: System.out.println("���� �����Ͽ����ϴ�."); break;
			case 4: System.out.println("*** �����մϴ� ***");
				System.exit(0);// ��������, ��������(�ý��� ����)
			}
			/*
			 * dowhile������ ����� ���
			 do {
				System.out.print("1.�簢�� 2.�ﰢ�� 3.�� 4.����\n�����ϼ��� : ");
				n=Integer.parseInt(br.readLine());
				switch(n) {
				case 1: System.out.println("�簢���� �����Ͽ����ϴ�."); break;
				case 2: System.out.println("�ﰢ���� �����Ͽ����ϴ�."); break; 
				case 3: System.out.println("���� �����Ͽ����ϴ�."); break;
				case 4: System.out.println("*** �����մϴ� ***");
					System.exit(0);// ��������, ��������(�ý��� ����)
				}while(true);
				
				*/
		}
	}

}
