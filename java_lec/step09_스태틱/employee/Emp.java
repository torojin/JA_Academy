package employee;
/* -eno:int
 * -ename:String
 * -phone:String
 * 
 * +Emp()
 * +Emp(eno:int, ename:String, phone:String)
 * +getter
 * +setSalary(salary:long):void -- abstract //super class
 * +setBonus(bonus:long):void -- abstract //super class / 8byet 정수형 자료여서..? 
 * 
 */
abstract public class Emp {
	//field(변수)
	private int eno;
	private String ename;
	private String phone;
	
	//default constructor
	public Emp() {
		super();
	}
	public Emp(int eno, String ename, String phone) {
		super();
		this.eno=eno;
		this.ename=ename;
		this.phone=phone;
	}
	//getter / 자식 클래스에서 사용 가능하다
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public String getPhone() {
		return phone;
	}
	//super class??
	abstract public void setSalary(long salary);
	abstract public void setBonus(long bonus);

}
