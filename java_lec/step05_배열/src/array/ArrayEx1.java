package array;
//1���� �迭
//�迭 : ������ �ڷ����� ���ӵ� ������
//String name="ȫ�浿"
public class ArrayEx1 {

	//new = ������ �Ҵ�
	public static void main(String[] args) {
		int[] num=new int[5]; //�迭���� / 5���� ������ /new ������ : ��ü ���� --- ���� �ڷ��� : ���� �����Ϳ� �׼��� �� �� �ִ� ��쿡
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		//length�� 5�� �����ؼ� -1�ؼ� 4�迭�� ���
		//50 40 30 20 10
		for(int i=num.length-1; i>=0; i--) {
			System.out.println(num[i]);
		}
	
		//���� for���� �̿��Ͽ� ����ϼ���
		//10 20 30 40 50
		//int n : �������� ����� �ش� 
		for(int n: num) {
			System.out.print(n+" ");
		}

		
		
	}

}
