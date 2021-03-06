package collection1;
//모든 클래스는 object가 최상의 클래스이기 때문에 아무거나 들어갈 수 있다/ object의 단점은 자료형이 검증이 안된다..?
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//list : 서로 다른 자료형의 연속된 기억공간 / 속도가 느리긴하지만 데이터를 추가할 수 있는 기능이 있다. 
//동일한 자료형이 들어와도 문제없다 / 중복허용 o, 순서유지 o
//Set : 데이터베이스 연결할 때 잘 안쓴다.
public class ListEx2 {
	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		//java.util에 있는 list를 import해줘야함
		//제네릭 캐스팅
		List<Object> list=new ArrayList<>();
//		List<String> list=new ArrayList<>();//String 아닌것들은 에러 발생
		list.add("봄"); 
		list.add("여름");
		list.add("가을");
		list.add(new Integer(4));
		list.add("겨울"); 
		list.add(5.0f);
		list.add(4.0);
		
//		System.out.println(list);
		
		//for문 사용가능
		for(Object ob : list) {
			System.out.println(ob);
		}
		Iterator iter=list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
