package employee;
/*
 * --Emp 상속
 * -salary:long
 * -bonus:long
 * +Engineer()
 * +Engineer(eno, ename, phone)
 * +toString():String
 */

//자식 클래스 / Emp 상속
public class Engineer extends Emp{
	//field 
	private long salary; 
	private long bonus;
	
	//default constructor
	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameter constructor
	public Engineer(int eno, String ename, String phone) {
		super(eno, ename, phone);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void setSalary(long salary) {
		this.salary=salary;
	}
	@Override
	public void setBonus(long bonus) {
		this.bonus=bonus+150000;
		//this.bonus+=bonus; or this.bonus+=150000이렇게 작성하면 안된다.
	}
	//toString 
	@Override
	public String toString() {
		return "사원번호 : "+getEno()
				+"\n사원이름 : "+getEname()
				+"\n내선번호 : "+getPhone()
				+"\n기본급여 : "+salary
				+"\n보너스+수당 : "+bonus
				+"\n지급금액 : "+(salary+bonus)+"원\n"
				;
	}
	
	
}
