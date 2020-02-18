package test;
//VO�뵵�� ��� field,constructor, getter,setter�� VO��� �Ҹ���
//�޸𸮻� �׳� �ִ°�
/*
 * -id:String
 * -pw:String
 * -name:String
 * -point:double
 * +constructor, getter, setter ����
 * 
 */
public class User {
	//field(variable) ����
	private String id;
	private String pw;
	private String name;
	private double point;
	//defalut constructor
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameter constructor
	public User(String id, String pw, String name, double point) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.point = point;
	}
	//getter, setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	
	
}
