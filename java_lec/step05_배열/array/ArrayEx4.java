package array;
//new는 연산자 기억공간에 할당해주는..
//class에서 파생된 객체 
//객체의 기억공간 할당?
//main은 운영체제로 실행
public class ArrayEx4 {

	public static void main(String[] args) {
		
		//int형 배열 선언
		int [] num=new int[3]; //3개의 기억공간을 할당하겠다.
		num[0]=Integer.parseInt(args[0]);
		num[1]=Integer.parseInt(args[1]);
		num[2]=Integer.parseInt(args[2]);
		
		//최대값 최소값 구하기
		//원리는 3 기억공간이 있으면  
		//임의의 기억공간 2개를 만든다.
		//임의의 기억공간 2개에 있는 최대값 최소값을 각각 비교..?
		int max=num[0];//0번째 있는 방의 값을 max에 넣음
		int min=num[0];
		
		//num변수가 0번째 배열이 자기 자신이여서 비교를 하는건 1번째 배열에서 시작
		//그래서 i값을 1부터 시작
		for(int i=1; i<num.length; i++) {
			//비교
			if(num[i]>max) max=num[i];
			if(num[i]<min) min=num[i];
			
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
	}

}
