package exercise;
/*
 [����3] ���� ���� ���� �����Ͽ� ����Ͻÿ�
           (name : �ε鷡 / kor : 90  / eng : 70 / mat : 75)

[���ȭ��]
�̸� : �ε鷡
�հ����� : 235��
������� :  78.3   <-- �Ҽ� 1�ڸ���������Ͻÿ�

 */
public class Exercise03 {

	public static void main(String[] args) {
		String name;
		name="�ε鷡";
		int kor, eng, mat, tot;
		kor=90;
		eng=70;
		mat=75;
		tot=kor+eng+mat;
		double av=tot/3.0;
		
		System.out.println("�̸� : "+name);
		System.out.println("�հ����� : "+tot);
		System.out.println("������� : "+String.format("%.1f",av));
		//System.out.printf("������� : %.1f", av);
	}

}
