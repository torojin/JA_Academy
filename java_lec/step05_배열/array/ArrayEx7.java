package array;
// 가변배열 : 행이나 열이 가변적인 배열

public class ArrayEx7 {
	//3행 4열로 나오게 하는 것
	//마지막에 ,사용 안한다.
	public static void main(String[] args) {
		//비어 있는 공간에 크기만 설정
		//실제로 이걸 많이 사용한다.
		//객체 자료형이 올 수 있다..
		int [][] num=new int[3][4];
		num[0]=new int[] {10,20};
		num[1]=new int[] {30,40,50,60};
		num[2]=new int[] {70,80,90};
								 
	//결과 출력
	//중첩 for문
	for(int i=0; i<num.length; i++) { //외부의 for문이 행 / 행 순회
		for(int j=0; j<num[i].length; j++) { //내부의 for문은 열 / 열 순회
			System.out.print(num[i][j]+"\t");
		}
		System.out.println();
	}
	
	}

}
