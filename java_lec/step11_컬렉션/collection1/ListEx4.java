package collection1;
//모든 클래스는 object가 최상의 클래스이기 때문에 아무거나 들어갈 수 있다/ object의 단점은 자료형이 검증이 안된다..?
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//리스트 에러 : 컴파일에는 이상 없으나 실행시에 형변환 문제 발생 
public class ListEx4 {
	@SuppressWarnings(value="unchecked")
	public static void main(String[] args) {
		//제네릭 캐스팅
		List<Object> list=new ArrayList<>();
		list.add("봄"); 
		list.add("여름");
		list.add("가을");
		list.add(new Integer(4));
		list.add("겨울"); 
		list.add(5.0f);
		list.add(4.0);
		
//		System.out.println(list);
		for(int i=0; i<list.size();i++) {
//			String season=(String)list.get(i);//String 자료형으로  캐스팅 시켜줌 //ClassCastException 발생
			Object season=list.get(i); //변수에 대입할 때는 부모에 있는걸로 / 프로모션 ..상위클래스에서.....
			System.out.println(season);
		}
		
		
		
	}
}
