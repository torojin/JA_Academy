package forex;

public class ForEx2 {

	public static void main(String[] args) {
		
		/*
		//������ �迭
		//�迭 : ������ �ڷ����� ���ӵ� ������
		//�Ʒ� �迭�� ÷�� 5 �ε���5?
		//length �迭�� ���̸� �˰��� �� �� ���
		//length() ���ڿ��� ���̸� �˰��� �� �� ���
		int [] num = {101, 102, 103, 104, 105};
		
		//0���� 4���� 
		//num.length : num�� �迭�� ���� 
		//for���� 2���� ������ �ִ�
		//������ for��
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		//���� for��
		//������ �������� ������ش�.
		//���������� �ڷᰡ �����µ�..
		//ó������ ������ ������ �۵�, �������δ� �۵� ����
		//������ �Ϻκи� ����ϸ� ���� for���� ���ϴ�.
		for(int n : num) {
			System.out.println(n);
		}
		*/
		
//		-----------------------------------------------
		
		//���ڿ��� �迭
		/*
		String[] color= {"red", "green", "blue"};
		
		for(int i=0; i<color.length; i++ ) {
			System.out.println(color[i]);
		}
		
		//���� for��
		//�ڿ� ������ ������ �迭�̿����Ѵ�.
		for(String a : color) {
			System.out.println(a);
		}
		*/
//		continue, break;
		
		for(int a=1; a<=10; a++) {
			if(a==5) {
				continue; //5�� ����� �ȵ� / �������� ���� ����� 
				//�ݺ��������� ��� ������ �Ŵ� ��� ���ǿ� �ش��ϴ� ��� �ǳʶٰ� �ʹ��Ҷ� ����ϴ°�
//				break; //������ �ִ� ������ ���� 
			}
			System.out.print(a+" ");
		}
	}

}
