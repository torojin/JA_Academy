package switchex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*switch�� ���
 * ���ڸ� �Է��ϼ��� : 5
 * 
 * 5�� Ȧ���Դϴ�.
 */

public class SwitchEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int num;
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		num=Integer.parseInt(br.readLine());
		
		switch(num%2) {
		case 0: System.out.println(num+"�� ¦���Դϴ�"); 
			break;
		case 1: System.out.println(num+"�� Ȧ���Դϴ�"); 
			break;
		default: System.out.println("�Է¿� ������ �־��"); 
			break;
		}
			
	}

}
