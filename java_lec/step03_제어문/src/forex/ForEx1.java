package forex;
//for(�ʱⰪ; ���ǽ�; ������) {}==> for(int i=0; i<10; i++){}
//for(�ʱⰪ; ���ǽ�; ������) {}==> for(char i='A'; i<'Z'; i++){}
//�����ڷ����̸� ������ ������ �Ǽ� �ڷ����̶�� �� �ٸ��� �����ؾ���..? ������ �ȵǴ°ǰ�?
public class ForEx1 {

	public static void main(String[] args) {
		
		//3���� ���°�
		for(int i=100; i>=80; i-=3) {
			System.out.println(i+" ");
		}
		
		//A B C ...Y Z
		//for���� �̿��ؼ� Ǯ���
		//�ʱⰪ�� �ִµ� �������� ��� char
		//������ ���ڷ� ����� �� �ִ�
		//char�� int�� �ڵ� ��ȯ�Ѵ�.
		//char+int=int // char+char=int
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i+" ");
		}
		
		/*
		//Ȧ�� ���� ����ϼ���
		int sum=0, odd=0, even=0;		
		for(int i=1;i<=10; i++) {
			sum+=i; //sum=sum+i
			//�ڵ��ۼ� switch�� ���
			//if����ص� ��
			switch (i%2) {
			case 1 : odd+=i; break; //odd=odd+i
			case 0 : even+=i;break;
			//3�� ��� �հ��3���� ����� �������� 0���� ����� �Ǹ� ��
			}
		}
		
		System.out.println("�հ� : "+sum);
		System.out.println("Ȧ�� �� : "+odd);
		System.out.println("¦�� �� : "+even);
		*/
	}

}
