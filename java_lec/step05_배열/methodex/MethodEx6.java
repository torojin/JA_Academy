package methodex;

public class MethodEx6 {
	
	public static int total (int toeic, int it) { //함수 정의
		return toeic+it;
	}
	
	public static String rs (int total) { //total=815의 값이 넘어옴
		String result;
		if(total >=800) result="합격";
		else result="불합격";
		return result;
	}

	public static void main(String[] args) {
		int toeic=750, it=65;
		
		System.out.println("입사총점 : "+total(toeic, it)+"점");
		System.out.println("입사결과 : "+rs(total(toeic, it))+"입니다");
		//입사총점: 815점
		//입사결과 : 합격입니다 --> 800이상 합격, 미만 불합격
	}

}
