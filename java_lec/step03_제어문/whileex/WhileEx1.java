package whileex;

public class WhileEx1 {

	public static void main(String[] args) {
		
		//10 9 8 7 6 5 4 3 2 1
		//�ܼ��ϰ� ��������..
		int n=10;
		while(n>=0){
			System.out.print(n+" ");
			--n;
		}
		
//		--------------------------------------
		/*
		int n=0;
		while(n<5) {
			++n; //������
			System.out.println("hello java");			
		}
		*/
		
//		----------------------------------------
		/*
		int n=0;
		
		//������ ����ϸ� ���� ���� / Ż�Ⱚ�� �������� �������ü� ����
		//while(true or false){}
		while(true) {
			++n;
			//n�� ���� 5���� ������
			if(n<=5) {
				System.out.println("hello java");
		}else {
			break;
		}
		}
		*/
	}

}
