package array;
// 2차원 배열
// 2차원 배열 : 표를 나타내는 것
//데이터의 사이즈가 명확하게 정해져 있는 경우 2차원 배열을 쓴다
public class ArrayEx6 {
	//3행 4열로 나오게 하는 것
	//마지막에 ,사용 안한다.
	public static void main(String[] args) {
		//비어 있는 공간에 값 설정..?
		
		//num[1]를 호출한다고 하면 
		//num[1] {10, 40, 70, 100} 호출
		//num[2] {20, 50, 80, 110}
		int [][] num=new int[][] {
								 {10, 40, 70, 100},
								 {20, 50, 80, 110},
								 {30, 60, 90, 120}
								 };
								 
	//결과 출력
	//중첩 for문
	for(int i=0; i<num.length; i++) { //외부의 for문이 행 / 3행 순회 / num[0] {10, 40, 70, 100} 호출
		for(int j=0; j<num[i].length; j++) { //내부의 for문은 열 / 4열 순회 / num[0] {10}/num[1]{40}/ num[2]{70} / num[3]{100}
			System.out.print(num[i][j]+"\t");
		}
		System.out.println();
	}
	
	}

}
