package emp;
//VO(Value Object), entity(��), DTO(data transfer object), bean
//		: �����͸� �ϳ��� ��� ������ �������� ���� Ŭ����
//field / consctructor/ getter,setter���� ����� VO��� �Ҹ���.

//������ �Ҷ�(�����ͺ��̽� ���鶧?) VO�� ���� �����.
//VO ���·� �ִ� �� ���������� �ִٰ� ���� �ȴ�
public class EmpVO {
	//field
	private String ename;
	private String dept;
	private int salary;
	//default constructor
	public EmpVO() {
		super();
	}
	//parameter constructor
	public EmpVO(String ename, String dept, int salary) {
		super();
		this.ename = ename;
		this.dept = dept;
		this.salary = salary;
	}
	//getter, setter
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
