package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����25] �߻�Ŭ������ �̿��Ͽ� ���� ���α׷��� �ϼ��Ͻÿ�

(1)�߻�Ŭ����:  Height 
   �ʵ�� : INCH:double                      ==> final����, �ʱⰪ:2.54 
   �޼ҵ� : getInch(double cm):double  ==> �߻�޼���
            

(2)ó������
   Test42Ŭ�������� Height�� ��ӹ޾� getInch()�� ������ 

(3)��.���
�Է�(cm) : 5.08
��� : 2��ġ
 */

//abstract class
abstract class Height{
	//field
	final public double INCH=2.54;//���� �׻� �����Ǿ� �ִ°ſ��� �ʱ�ȭ �������..
	//abstract Method
	abstract public double getInch();
}

class Test42 extends Height{
	@Override
	public double getInch() {
		return INCH;
	}
}
public class Exercise25 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i;
		
		System.out.print("�Է�(cm) : ");
		i=Integer.parseInt(br.readLine());
		
		//��ü ����
		Height h=new Test42();
		System.out.println(h.getInch());
	}

}