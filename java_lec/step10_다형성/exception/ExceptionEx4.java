package exception;
//사용자 정의 예외처리
//클래스 생성
class MyException extends Exception{
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L; //형상관리할 때 사용

	//생성자로 호출해서 생성자 생성
	public MyException() {
		System.out.println("애들은 가라~");
	}
	
}

public class ExceptionEx4 {

	public static void main(String[] args) { //사용자가 만들때 throw /자동으로 만들때 throws
		//변수 생성
		int age=Integer.parseInt(args[0]);
		
		if(age<19)
			try {
				throw new MyException();
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
			System.out.println("어서옵쇼");
	}

}
