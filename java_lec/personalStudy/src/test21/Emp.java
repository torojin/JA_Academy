package test21;
/*
(3)Ŭ������ : EmpEx
Emp em=new Emp();
em.setName("��ȣ��");
em.setDept("������");
em.setSalary(1200000);
System.out.println(em.toString());

System.out.println("�̸� : " + em.getName());
System.out.println("�μ� : " + em.getDept());
System.out.println("�޿� : " + em.getSalary() + "��");
*/
public class Emp {
	//�ʵ�(����)����
	private String name, dept;
	private int salary;
	//getter, setter ����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	//toString ����
	@Override
	public String toString() {
		return name + "�� " + dept + "����̸�" + salary + "���� �޿��� �޽��ϴ�";
	}
	
}
