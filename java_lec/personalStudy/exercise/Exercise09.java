package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����9] for���� �̿��Ͽ� �������� ���Ͻÿ�

x�� ���� �Է��Ͻÿ� : 3
y�� ���� �Է��Ͻÿ� : 3
3�� 3���� 27
 */
public class Exercise09 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x,y;
		
		System.out.print("x�� ���� �Է��ϼ��� : ");
		x=Integer.parseInt(br.readLine());
		
		System.out.print("y�� ���� �Է��ϼ��� : ");
		y=Integer.parseInt(br.readLine());
		int z=x;
		for(int i=1; i<y; i++) {
			x*=z; //x=x*z
		}
		System.out.println(z+"�� "+y+"���� "+x);
	}

}