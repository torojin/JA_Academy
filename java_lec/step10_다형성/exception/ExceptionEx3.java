package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//checked exception
public class ExceptionEx3 {
	//소스가 있을때..?
	
	String str;
	public ExceptionEx3() throws IOException {
		input();
	}
	public void input() throws IOException {
		//IOException??
		//input에서도 exception이 발생할 수도 있다
		//입력받을때 exception 처리
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열을 입력하세요 : ");
		try{
			str=br.readLine();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//output
	public void output() {
		System.out.println("결과 : "+str);
	}
	
	public static void main(String[] args) throws IOException {
		new ExceptionEx3().output();
	}

}
