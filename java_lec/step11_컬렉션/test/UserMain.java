package test;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ID�� �Է��ϼ��� : pororo
 * PW�� �Է��ϼ��� : 1234
 * 
 * �Ƿηδ��� �����ϼ̽��ϴ�.
 * ���� ����Ʈ�� 89.97���Դϴ�
 * 
 * [[BOOK�� ��������]]
 * å�̸� : java	å���� : kim	å������ : 100
 * å�̸� : oracleå���� : lee	å������ : 200
 * å�̸� : html	å���� : shim	å������ : 300
 * 
 * ---------------------------------------
 * 
 * ID�� �Է��ϼ��� : pororo
 * PW�� �Է��ϼ��� : 1235
 * 
 * ID �Ǵ� PW�� Ʋ���ų� �������� �ʴ� ID�Դϴ�.
 */
public class UserMain {

	public static void main(String[] args) {
		//�Է��� �� �ִ� Scanner ����
		Scanner sc=new Scanner(System.in);
		
		//�޼��� �ȿ��� �����ϱ� ������ ���������ڰ� �ʿ����
		String id, pw;
		
		//�Է�ó��
		System.out.print("ID�� �Է��ϼ��� : ");
		id=sc.next();
		System.out.print("PW�� �Է��ϼ��� : ");
		pw=sc.next();
		
		//�Է°��� ���� �˻�
		//UserProc�� ���� ó�� / id,pw�� ������ �Ѿ��.
		//UserProc Object ����
		UserProc up=new UserProc();
		//UserProc�� ���� Method ���� / User�ڷ����� entity ��������...
		User entity=up.getLoginUser(id,pw); // =new UserProc().getLoginUser(id,pw)
		
		//��� ���
		if(entity !=null) {
			//�����Ͱ� �ִ� ���
			System.out.println(entity.getName()+"���� �����ϼ̽��ϴ�.");
			System.out.println("���� ����Ʈ�� "+entity.getPoint()+"�� �Դϴ�.");
			
			//BookProc���� for�� �Ѿ���� �� ó��
			BookProc book=new BookProc();
			
			long start=System.currentTimeMillis();//�޼ҵ� �ð� üũ
			ArrayList<Book> list=book.getList(); //ArrayList<Book> getList() ���� ����
			long end=System.currentTimeMillis();//�޼ҵ� �ð� üũ
			
			System.out.println(end-start);//�޼ҵ� �ð� üũ
			System.out.println("[[BOOK�� ��������]]");
			for(Book ob:list) {
				System.out.print("å�̸� : "+ob.getTitle()+"\t");
				System.out.print("å���� : "+ob.getAuthor()+"\t");
				System.out.print("������ : "+ob.getPage()+"\t");
			}
		}else {
			//�����Ͱ� ���� ���
			System.out.println("ID �Ǵ� PW�� Ʋ���ų� �������� �ʴ� ID�Դϴ�.");
		}
	}

}
