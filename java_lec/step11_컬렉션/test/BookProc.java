package test;
//����Ͻ� ����
import java.util.ArrayList;

public class BookProc {
	
	public ArrayList<Book> getList() {
		//Object ����
		Book bk1=new Book("java", "kim", 100);
		Book bk2=new Book("c++", "lee", 100);
		Book bk3=new Book("jsp", "park", 100);
		
		//list�� bk1~bk3�� �߰����ּ���
		ArrayList<Book> list=new ArrayList<Book>(); 
		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
		
		return list;//ArrayList�� ���� �������.
	}

}
