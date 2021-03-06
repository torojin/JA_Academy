package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		//Object 생성
		Book bk1=new Book("java", "kim", 100);
		Book bk2=new Book("oracle", "lee", 200);
		Book bk3=new Book("html", "shim", 300);
		
		//아래같이 제네릭을 사용하면 / book 클래스의 자료형이 온다.
		List<Book> list=new ArrayList<Book>(); 
		list.add(bk1);
		list.add(bk2);
		list.add(bk3);
		
		for(Book ob:list) {
			System.out.print("책이름 : "+ob.getTitle()+"\t");
			System.out.print("책저자 : "+ob.getAuthor()+"\t");
			System.out.println("책페이지 : "+ob.getPage());
		}
		System.out.println("---------------------------------------");
		//Itertator를 이용하여 출력해 주세요
		//제네릭 사용
		//이런게 있구나...
		Iterator<Book> iter=list.iterator();
		while(iter.hasNext()) {
			Book ob=iter.next();
			//객체 주소로 받아오는..
			System.out.print("책이름 : "+ob.getTitle()+"\t");
			System.out.print("책저자 : "+ob.getAuthor()+"\t");
			System.out.println("책페이지 : "+ob.getPage());
		}
		System.out.println("---------------------------------------");
//		System.out.println(list.size());
//		리스트의 특성을 가지고 값을 뽑아내는 형식
		System.out.print("책이름 : "+list.get(0).getTitle()+"\t");//객체의 참조값 
		System.out.print("책저자 :"+list.get(0).getAuthor()+"\t");
		System.out.println("책페이지 : "+list.get(0).getPage());
		
		System.out.println("---------------------------------------");
		for(int i=0; i<list.size();i++) {
			System.out.print("책이름 : "+list.get(i).getTitle()+"\t");
			System.out.print("책저자 : "+list.get(i).getAuthor()+"\t");
			System.out.println("책페이지 : "+list.get(i).getPage());
		}
	}

}
