package test14;
/*
 (2) ���ϸ� : Emp  --main()���� X
+name:String
+age:int
+tall:double
+setEmp(name:String, age:int, tall:double):void
+viewEmp():void
          
 */
public class Emp {
	//filed
	public String name;
	public int age;
	public double tall;
	
	//setter
	public void setEmp(String name, int age, double tall) {
		this.name=name;
		this.age=age;
		this.tall=tall;
	}
	
	//getter?
	public void viewEmp() {
		System.out.println("���� �̸��� "+name+"�̸�, "+age+"���̰� Ű�� "+tall+"cm�Դϴ�");
	}
}
