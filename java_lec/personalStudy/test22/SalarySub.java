package test22;
/*
(3) ���ϸ� : SalarySub   ==> Salary���
-dept:String
+SalarySub()
+SalarySub(dept:String)
+SalarySub(name:String, salary:int, dept:String)   ==> name, salary�� �θ�����ڷ� �ѱ�
+toString():String         ==>  �μ����

(5) ���ȭ��
�̸� : ��ö����
���� : 85000000
�μ� : ö���
 */

//�ڽ�Ŭ���� / �θ�Ŭ���� Salary ���
public class SalarySub extends Salary{
	//filed
	private String dept;
	
	//default constructor
	public SalarySub() {
		super();
	}
	public SalarySub(String dept) {
		super();
	}
	public SalarySub(String name, int salary, String dept) {
		super(name, salary);
		this.dept=dept;
	}
	//toString
	@Override
	public String toString() {
		return super.toString()+"\n�μ� : "+dept;
	}
}