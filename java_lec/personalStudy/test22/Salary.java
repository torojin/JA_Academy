package test22;
/*
(2) ���ϸ� : Salary      
-name:String
-salary:int
+Salary()
+Salary(name:String, salary:int)
+toString():String         ==>  �̸�, �������
 
(5) ���ȭ��
�̸� : ��ö����
���� : 85000000
�μ� : ö���
 */
public class Salary {
	//filed(����)
	private String name;
	private int salary;
	
	//default ������
	public Salary(){
		super();
	}

	public Salary(String name, int salary) {
		super();
		this.name=name;
		this.salary=salary;
	}
	//toString
	@Override
	public String toString() {
		return "�̸� : "+name+"\n���� : "+salary;
	}

}