package object;
//��ü ����
/*
 * Ŭ������ : Emp
 * -name : String
 * -dept : String
 * -salary : int
 * 
 * +setEmp(name:String, dept:String, salary:int):void
 * +printEmp():void
 * --ȫ�浿 ����� ���ߺο� �ٹ��ϸ� 1520000���� �޿��� �޾ƿ�
 */
class Emp{
	//filed
	private String name;
	private String dept;
	private int salary;
	
	//setter
	public void setEmp(String name, String dept, int salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	
	//���
	public void printEmp() {
		System.out.println(name+" ����� "+dept+"�� �ٹ��ϸ� "+salary+"���� �޿��� �޾ƿ�");
	}
}

public class ObjectTest1 {
	
	public static void main(String[] args) {
		//��ü����
		Emp ob=new Emp();
		ob.setEmp("ȫ�浿","���ߺ�",1520000); //�� �Է�
		ob.printEmp(); //���
	
	}

}
