package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 [문제13] 아래와 같이 12달의 날수를 배열를 만들어 기억시킨후 
원하는 month을 입력받아 그 달의 날수를 출력하시오

[참고]
int []month={31,28,31,30,31,30,31,31,30,31,30,31};

[입력화면/출력화면]

원하는 month을 입력하시오 : 3
3월은 31일입니다.
 */
public class Exercise13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int []month= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int n;
		System.out.print("원하는 month을 입력하세요 : ");
		n=Integer.parseInt(br.readLine());
		
		
		//System.out.println(n+"월은 "+month[n-1]+"일 입니다");
					
		//for문을 사용해서 해본다면
		//배열0~11
		for(int i=0; i<month.length; i++) {
			//비교 인덱스 번호와 같게해야함
			if(n==i+1) {
				System.out.println(n+"월은 "+month[i]+"일 입니다");
			}
		}
		
	}

}
