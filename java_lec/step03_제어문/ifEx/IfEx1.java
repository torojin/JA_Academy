package ifEx;

public class IfEx1 {

	public static void main(String[] args) {
		
		//if~else~if��--------------------------------
		/*
		int score=95;
		char grade;
		
		if(score>=90)	grade='A';
		else if(score>=80) grade='B';
		else if(score>=70) grade='C';
		else if(score>=60) grade='D';
		else grade='F';
		
		System.out.println("������ "+score+"���̰� ������"+grade+"�Դϴ�");
		*/
		
		int score=95;
		char grade='\0';
		
		//�̰� java�������θ� ����� /�� �Ⱦ�?
		if(score>=90 && score<=100) grade='A';
		if(score>=80 && score<=90) grade='B';
		if(score>=70 && score<=80) grade='C';
		if(score>=60 && score<=70) grade='D';
		if(score>=0 && score<=60) grade='F';
		
		//grade�� ������ �� ��
		//char�� ������ �κ� ��ü �ʱ�ȭ�� �ȵǼ� 
		//char�� null�� ��� grade������ �ȳ�
		System.out.println("������ "+score+"���̰� ������"+grade+"�Դϴ�");
		
		/*
		//if~else��-----------------------------------
		
		int score=45;
		
		if(score>=60) {
			System.out.println("�հ�");
			System.out.println("������ " +score+"���Դϴ�.");
		}else {
			System.out.println("���հ�");
			System.out.println("������ " +score+"���̸� ���� ��ȸ��...");
		}
		*/
		
		//if�� -----------------------------------------
		
		
		String str="korea";
		
		//������ ����� ������ ����
		if(str=="korea") {
			System.out.println("���ѹα�");
		}
		
		//�� ���������� �� �ٱ�����
		System.out.println("******");
		
	}
	

}
