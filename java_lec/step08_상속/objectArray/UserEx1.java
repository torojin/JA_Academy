package objectArray;
//배열 사용안하고 객체 생성
public class UserEx1 {

	public static void main(String[] args) {
		//배열을 안만들고 객체를 생성
		User ob1=new User("kim", "010-123-4567");
		User ob2=new User("lee", "010-456-4207");
		User ob3=new User("park", "010-777-8080");
		//getter를 만들었으니 getter로 출력
		System.out.println(ob1.getName()+"\t"+ob1.getPhone());
		System.out.println(ob2.getName()+"\t"+ob2.getPhone());
		System.out.println(ob3.getName()+"\t"+ob3.getPhone());
	}

}
