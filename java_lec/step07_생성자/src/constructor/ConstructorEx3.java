package constructor;
//Ŭ������ : UserInfo
//-name : String
//-addr : String
//+UserInfo()//����Ÿ���� ���� ������ �������ǹ�
//+UserInfo(name:String, addr:String)
//+getter
//--���
//**** �ּҷ� **** <-- ����Ʈ �����ڿ��� ���
//�̸� : ���󿡸�  <-- main()���� getter�� �̿��ؼ� ���
//�ּ� : ����� ������ <-- main()���� getter�� �̿��ؼ� ���
class UserInfo{
	//filed
	private String name;
	private String addr;
	//������
	public UserInfo() {
		System.out.println("****�ּҷ�****");
	}
	//�����ڿ� �Ű����� �Է�
	public UserInfo(String name, String addr) {
		this();
		this.name=name; 
		this.addr=name;
	}
	//getter�� ���
	//getter�� setter�� ��� ������ ������ ȣ�� �����ϴ�
	//�������ʿ� ����Ǹ� getter�� setter�� ���� ����ؼ� �ϴ� ��찡 �ִ�
	//�̺κ��� JDBC����
	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	
}

public class ConstructorEx3 {

	public static void main(String[] args) {
		UserInfo ob=new UserInfo("���󿡸�","����� ������");//1
		System.out.println("�̸� : "+ob.getName());
		System.out.println("�ּ� : "+ob.getAddr());
	}

}
