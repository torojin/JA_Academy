package weekendstudy;
//�ڽ�Ŭ���� / �θ� Ŭ���� Family /interface Job���
public class Son extends Family implements Job{
	//default constructor
	public Son() {
		super();
	}
	//parameter constructor
	public Son(String name) {
		super(name);
	}
	//interface ��� / �������̵� /���ϰ� �ʿ�
	@Override
	public String work() {
		return "�Ƶ��� ���θ� �Ѵ�\n";
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+this.work();
	}
}
