package family;
//�ڽ�Ŭ���� / �θ� Ŭ���� Family /interface Job���
public class Mother extends Family implements Job{
	//default constructor
	public Mother() {
		super();
	}
	//parameter constructor
	public Mother(String name) {
		super(name);
	}
	//interface ��� / �������̵� /���ϰ� �ʿ�
	@Override
	public String work() {
		return "������ �������� �Ѵ�\n";
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+this.work();
	}
}
