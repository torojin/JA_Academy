package test17;
/*
(2)Ŭ������ : Student
-name:String
-kor:int
-eng:int
-mat:int
+setStudent(name:String, kor:int, eng:int, mat:int):void
+getTotal():int        ==> �������ϱ�
+getAvg():double    ==> ��ձ��ϱ�
+getGrade():char     ==> �������ϱ� (switch�̿�)
+getResult():String   ==> ��� ���ϱ� (if�̿�)
+getView():String    ==> ��¹� �����
 */
public class Student {
	//filed ����
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public void setStudent(String name, int kor, int eng, int mat) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	public int getTotal() {
		return kor+eng+mat;
	}
	public double getAve() {
		return getTotal()/3.0;
	}
	public char getGrade() {
		switch((int)getAve()/10) {
		case 10:
		case 9: return 'A';
		case 8: return 'B';
		case 7: return 'C';
		case 6: return 'D';
		default: return 'F';
		}
		
	}
	public String getResult() {
		
		if(getGrade()=='F') return"���հ�";
		else return "�հ�";
		
	}
	public String getView() {
		return "���� �̸��� "+name+"�̰� ������ "+getTotal()+"���̰� ����� "+getAve()+"�̰� ������ "+getGrade()+"�����̸� ����� "+getResult()+"�Դϴ�";
		
	}
}