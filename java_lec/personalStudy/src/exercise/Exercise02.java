package exercise;
/*
[����2] ���������� �����Ͽ� ����Ͻÿ�
����1) data�� ��ȿ��, ���ߺ�, �븮, 1500000�� ����
       �������� ����  name,dept,position,sal�� �Ұ�
����2)����� �Ʒ��� ���� �޼���(�Լ�)�� �̿��Ͻÿ�

[���ȭ��]
�̸� : ��ȿ��     ---> println
�μ� : ���ߺ�     ---> printf  
���� : �븮       ---> print 1�����Ἥ ����,�޿����
�޿� : 1500000��
*/
public class Exercise02 {

	public static void main(String[] args) {
		String name, dept, position;
		name="��ȿ��";
		dept="���ߺ�";
		position="�븮";
		int sal=1500000;
		
		System.out.println("�̸� : "+name);
		System.out.printf("�μ� : %s\n", dept);
		System.out.print("���� : "+position+"\n�޿� : "+sal+"��");
	}

}
