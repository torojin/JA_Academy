package employee;
/*
 * --Emp ���
 * -salary:long
 * -bonus:long
 * +Developer()
 * +Developer(eno, ename, phone)
 * +toString():String
 */
//���⼭ override�� �ǹ�? /������ ���� �������ְڴ�

//�ڽ� Ŭ���� / Emp ���
public class Developer extends Emp{
	//field 
	private long salary; 
	private long bonus;
	
	//default constructor
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameter constructor
	public Developer(int eno, String ename, String phone) {
		//�θ�Ŭ������ ����
		super(eno, ename, phone);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setSalary(long salary) {
		this.salary=salary;
	}
	@Override
	public void setBonus(long bonus) {
		this.bonus=bonus+100000;
		//this.bonus+=bonus; or this.bonus+=100000�̷��� �ۼ��ϸ� �ȵȴ�.
	}
	//toString 
	@Override
	public String toString() {
		return "�����ȣ : "+getEno()
				+"\n����̸� : "+getEname()
				+"\n������ȣ : "+getPhone()
				+"\n�⺻�޿� : "+salary
				+"\n���ʽ�+���� : "+bonus
				+"\n���ޱݾ� : "+(salary+bonus)+"��\n"
				;
	}
	
}
