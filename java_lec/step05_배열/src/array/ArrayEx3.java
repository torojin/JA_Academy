package array;
// $ java ArrayEx3 abcd ������ 123 12345
//������ �������� �����Ѵ�
//2���� �迭 0,0/0,1/0,2/0,3 = a,b,c,d 1,0/1,1/1,2 =��,��,��
public class ArrayEx3 {

	public static void main(String[] args) {
		System.out.println("args�� ���� : "+args.length);
		
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"] : "+args[i]);
			System.out.println("args["+i+"]�� ũ�� : "+args[i].length());
			System.out.println();
		}
		//------ ���� for������ ����غ�����
		//ã�� ������ ã�Ƽ� ����Ҽ� ����
		//������θ� ����ϴ� ������ ���
		//class�� ������ �ڷ����� ������ ��
		for(String n : args) {
			System.out.println("args : "+n);
			System.out.println("args�� ũ��  : "+n.length());
			System.out.println();
		}
		//�迭.. ���ڿ��� ���ؼ� �����Ҷ� �̷������� �����ϴ�
		//�ٸ� �ڷ����� �Ұ���
//		String n= new String();
//		String n1="";
	}

}
