package inheritance;

//변수로 받을수 있다라는 정도로 알고 있으면 될듯
//부모클래스 생성
class Branch{
	//디폴트 생성자
	public Branch() {
		System.out.println("Branch default constructor");//5
	}
	//매개변수 생성자
	public Branch(String str) {
		this();//4
		System.out.println(str+"Branch constructor");//6
	}
}
//자식클래스 / 부모클래스 Branch 상속
class Leaf extends Branch{
	//디폴트 생성자
	public Leaf() {
		super("hi~");//3
		System.out.println("Leaf default constructor");//7
	}
	//매개변수 생성자 추가
	public Leaf(String str, int n) {
		this();//2
		System.out.println(str+" "+n+" Leaf constructor");//8
	}
}
public class InheritanceEx3 {

	public static void main(String[] args) {
		//매개변수 값 입력
		new Leaf("가나다",10);//1
		System.out.println("ooo");//9
	}

}


/*
//부모클래스 생성
class Branch{
	//디폴트 생성자
	public Branch() {
		System.out.println("Branch default constructor");//4
	}
	public Branch(String str) {
		this();//3
		System.out.println(str+"Branch constructor");//5
	}
}
//자식클래스 Branch 상속
class Leaf extends Branch{
	//디폴트 생성자
	public Leaf() {
		super("hi~");//2
		System.out.println("Leaf default constructor");//6
	}
}
public class InheritanceEx3 {

	public static void main(String[] args) {
		new Leaf();//1, 
		System.out.println("ooo");//7
	}

}
*/
