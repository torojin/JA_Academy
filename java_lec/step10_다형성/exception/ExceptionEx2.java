package exception;
//unchecked exception
public class ExceptionEx2 {

	public static void main(String[] args) {
		//변수 선언
		int[] num = {10,20,30};
		//런타임 exception 실행타임에 적용 
		try {
			for(int i=0; i<5; i++) {
				System.out.println(num[i]);
			}
		}//소스 코드를 사용하지 않는다고해서....
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 개수가 맞지 않음");
		}
		

	}

}
