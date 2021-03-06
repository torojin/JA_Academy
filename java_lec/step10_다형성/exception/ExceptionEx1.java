package exception;

/*
 * 예외처리
 * 
 */
public class ExceptionEx1 {

	public static void main(String[] args) {
		/* 오랜만에 argument 처리
		 * $ java ExceptionEx1 2 ==> 2
		 * $ java ExceptionEx1 0 ==> 0으로 나눌 수 없어요
		 * $ java ExceptionEx1 p ==> 숫자로 바꿀 수 없습니다
		 * $ java ExceptionEx1 공백 전달 ==> 입력된 값이 없습니다
		 * 
		 * 
		 * 
		 */
		
		//최상위꺼를 가지고 한번에 예외처리 하는 경우도 있다 
		int var=5;
		try {
			int n=Integer.parseInt(args[0]);
			System.out.println(var/n);
		}catch(Exception e) {
			System.out.println("입력된 값에 문제가 있어요");
		}
		//아래 코드와 같이 다른 문제의 에러들도 한번에 문제가 있다고 처리할 수 있다
		
		/*
		int var=5;
		try {
		int n=Integer.parseInt(args[0]);
		System.out.println(var/n);
		}catch(ArithmeticException e) {//객체를 잡겠다 
			System.out.println("0으로 나눌 수 없어요"+e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없습니다"+e.toString());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력된 값이 없습니다");
		}//try catch뒤 finally
//		finally ==> 무조건 실행
//		조건검사할 때 객체를 종료(닫는)하는 역할
		finally{
			System.out.println("무조건 실행");
		}
		
		*/
	}

}
