package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ���� �Է¹޾� �������� ����ϼ���
 * 
 * --���
 * ���� �Է��ϼ��� : 7
 * 7 * 1 = 7
 * 7 * 2 = 14
 *   :
 * 7 * 9 = 63
 * 
 */
public class WhileEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n, tmp=1;
		
		System.out.print("���� �Է��ϼ��� : ");
		n=Integer.parseInt(br.readLine());
		
		while(tmp<=9) {
			System.out.println(n+" * "+tmp+" = "+(n*tmp));
			++tmp;
		}
				
	}

}
