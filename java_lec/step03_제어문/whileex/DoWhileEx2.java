package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* �ٽ� �ѹ� �����ұ��(y/Y)? Y
 * �ٽ� �ѹ� �����ұ��(y/Y)? y
 * �ٽ� �ѹ� �����ұ��(y/Y)? n  
 * 
 * *** ����� ***
 * * y�� �˻� ���� �׷��� ���� ��� ����
 * 
 */
public class DoWhileEx2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char ans;
		//char ans='\0'; //null���� ��� / ����ü�� ���� char�� �ʱ�ȭ�ϱ� ���� ��
		//String���� ó���ϸ� �ּҰ��� �ٸ� ��쿡 �ٸ��ٰ� ������.
		//\0���� ó���ϸ�... �ּҷ� ó��?
		//���ڿ� ó���� �Ϸ���... 
		do {
			System.out.print("�ٽ� �ѹ� �����ұ��(y/Y)?");
			ans=br.readLine().charAt(0);
		}while(ans=='y' || ans=='Y');
		System.out.println("*** ����� ***");
	}

}
