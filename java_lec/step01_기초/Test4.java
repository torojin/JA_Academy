package step01_����;
/*
 * ���� ������ �����Ͽ� ����ϼ���.
 * --��� 
 * �̸� : �̼��� <--println()
 * ���� : 25�� <--print()
 * �μ� : ���ߺ�
 * ���� : 87.5�� <--printf() �μ� ���� �ѹ��� ���
 */
public class Test4 {

	public static void main(String[] args) {
		String name="�̼���";
		int age=25;
		String dp="���ߺ�";
		double score=87.5;
		System.out.println("�̸� : "+name);
		System.out.print("���� : "+age+"��\n");
		System.out.printf("�μ� : %s\n���� : %.1f��",dp,score);
	}

}
