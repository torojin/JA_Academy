package objectArray;
//object Array(������Ʈ�迭) -2 
public class UserEx3 {

	public static void main(String[] args) {
		//�迭����� ��ü�� ����
		//�Ʒ� int �迭 ���� �ϴ� �Ͱ� �Ȱ���
		//��ü �ڷ����̿��� User��� �ڷ����� �����
		User[] ob=new User[] {new User("kim", "010-123-4567"),
							new User("lee", "010-456-4207"),
							new User("park", "010-777-8080")
				
		};
//		int [] num=new int[]{1,2,3,4,5};
		
		//���� for��
		//�ڷ��� Ȯ��
		for(User m :ob) {
			System.out.println(m.getName()+"\t"+m.getPhone());
		}

	}

}
