package weekendstudy;
//부모 클래스 
public class Family {
	//field(variable) 생성
	private String name;
	
	//default constructor
	public Family() {
		super();
	}
	//parameter constructor
	public Family(String name) {
		super();
		this.name=name;
	}
	//toString
	public String toString() {
		return "이름 : "+name+"\n";
	}

}
