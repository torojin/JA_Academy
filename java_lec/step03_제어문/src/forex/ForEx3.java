package forex;
/*
 * 1~100������ 7�� ����� ����ϼ��� : continue����ϱ�
 */
public class ForEx3 {

	public static void main(String[] args) {
		
		
		for(int i=1; i<100; i++) {
			if(i%7!=0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
