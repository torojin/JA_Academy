package constructor;

public class ConstructorEx8 {
	public static void main(String[] args) {
		//��ü ����?
		Book bk1=new Book();
		
		bk1.setTitle("�ڹ��� ����");
		bk1.setAuthor("���ڹ�");
		bk1.setPage(500);
		System.out.println(bk1.toString());
		
		Book bk2=new Book("jsp �����ϸ��ϸ� ��������ŭ�Ѵ�", "������", 200);
		System.out.println("å �̸� : "+bk2.getTitle());
		System.out.println("å ���� : "+bk2.getAuthor());
		System.out.println("������ : "+bk2.getPage());
		
	}

}
