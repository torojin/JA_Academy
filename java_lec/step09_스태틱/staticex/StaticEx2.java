package staticex;
//기준 값이 되는 경우도 static변수로 만들기도 한다

//static = 전역변수
//최초의 한번..?
public class StaticEx2 {

	public static void main(String[] args) {
		System.out.println("*** 입금 당시의 금리 ***");
		//객체 생성
		BankAccount ba1=new BankAccount(1994, "kim", 1000, 0.07);
		ba1.view();
		BankAccount ba2=new BankAccount(1998, "kim", 1000, 0.12);
		ba2.view();
		BankAccount ba3=new BankAccount(2005, "kim", 1000, 0.05);
		ba3.view();
		
		System.out.println("\n\n*** 2005년 현재의 금리 ***");
		//static은 자기 자신을 기억하지 못한다??
		//최종의 값을 기억하고 있다
		//바뀐다? 그 전의 값은 
		//static은 전역 변수로..		
		//ba1에서 선언된 객체여도 ba3의 객체가 선언되면서 그 전의 값들을 초기화 시켜 0.05가 나온다..?
		//객체가 3개가 생성된다고 해도  static은 기억공간을 하나만 써서? 최초의 1번 하나의 변수의 값을 쓰는것으로 됨
		ba1.view();
		ba2.view();
		ba3.view();
		
		//static은 class.Method 이름으로 구현해야한다.?
		
		System.out.println("\\n\\n*** 0.04로 변동된 금리 ***");
		BankAccount.setRate(0.13); //static Method 
		ba1.view();
		ba2.view();
		ba3.view();
//		BankAccount.rate=0.04; //이렇게 하는걸 권장하지 않는다?
		
	}

}
