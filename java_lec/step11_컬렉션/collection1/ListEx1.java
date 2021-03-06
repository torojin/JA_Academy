package collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//list : 서로 다른 자료형의 연속된 기억공간 / 속도가 느리긴하지만 데이터를 추가할 수 있는 기능이 있다. 
//동일한 자료형이 들어와도 문제없다 / 중복허용 o, 순서유지 o
//Set : 데이터베이스 연결할 때 잘 안쓴다.
public class ListEx1 {
	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		//java.util에 있는 list를 import해줘야함
		List list=new ArrayList();
		list.add("one"); //반드시 검사를 하진 않아도 됨..?
		list.add("second");
		list.add("3rd");
		list.add(4);
		list.add(new Integer(4));
		list.add("second");//중복되는 값 
		list.add(5.0f);
		
//		System.out.println(list);
		
		list.remove("second");//첫번째 있던 "second"삭제
		Iterator iter=list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
