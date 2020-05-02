package methodex;
/*
 * --���
 * ���� : 253��
 * ��� : 84.33��
 * ���� : B
 * ��� : �հ�
 * ---------------
 * ����
 * ���� : switch�� �̿��Ͽ� ���ϱ�
 * ������ ���������ϸ� a b c d f		F�� ���հ� �ƴϸ� �հ��� ����
 * ��� : if~else�� �̿�
 * 
 */
//���� �Լ�, ��� �Լ� ����� ������ ®���� ������ ���� ����
public class MethodEx4 {
	
	//������ �ϰ��� �ϴ� ���� ..
	public static int total(int k, int e, int m) {
		return k+e+m; //return�� ȣ���� ������ �ǵ��� ��..(���� ������)
	}
	
	//avg(total(k, e, m))�� ���� ���� �Լ��� �ȴ�.
	//���� ������ �Ǵ� ���� //tot�� 253�� ������� ��
	public static double avg(int tot) {
		return tot/3.0; //ȣ���� ������ ������ ���
	}
	
	//���⼭ switch�� ����ؾ� ��
	//84.33�� av�� ������� ��
	public static char grade(double av) {
		
		/*
		//���� �ϳ��� ����°� ����
		//���Ƿ� �ϳ��� 
		char ck;
		switch((int)av/10){ //av=>84.33 ==>84 --->
		case 10 :
		case 9: ck='A'; break;
		case 8: ck='B'; break;
		case 7: ck='C'; break;
		case 6: ck='D'; break;
		default: ck='F';
		}
		return ck;//return�� ���
		*/
		
		//�� ������� �����ϴ�.
		switch((int)av/10){
		case 10 :
		case 9: return 'A';
		case 8: return 'B'; 
		case 7: return 'C';
		case 6: return 'D'; 
		default: return 'F';
		}

	}
	
	//�հ� ���հ� �����ϱ�
	public static String result(char gr) {
		String res;
		if (gr=='F') res="���հ�";
		else res="�հ�";
		return res;
	}
	
	//�����
	public static void main(String[] args) {
		int k=95, e=85, m=73;
		System.out.println("���� : "+total(k, e, m)+"��");
		System.out.printf("��� : %.2f��\n", avg(total(95, 85, 73)));//avg�� tot �Լ��� �Է� �ȴ�
		System.out.println("���� : "+grade(avg(total(k, e, m))));//grade�� av �Լ��� �Է� �ȴ�.
		System.out.println("��� : "+result(grade(avg(total(k, e, m)))));//result�� gr �Լ��� �Էµȴ�.
	}

}
