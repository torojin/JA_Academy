package test23;
/*
Ŭ������ : SubEntry  ==> Entry���
-definition:String
-year:int
+SubEntry()
+SubEntry(definition:String, year:int)
+SubEntry(word:String, definition:String, year:int)
+toString():String           ==> ����, �ñ� ���

(3) ���ȭ��

*****������******
��� : OOP
���� : Object Oriented Programming
�ñ� : 1991��
 */
//�ڽ�Ŭ���� / �θ�Ŭ���� Entry ���
public class SubEntry extends Entry{
	//filed
	private String definition;
	private int year;
	
	//default constructor
	public SubEntry() {
		super();
	}
	public SubEntry(String definition, int year) {
		super();
		this.definition=definition;
		this.year=year;
	}
	public SubEntry(String word, String definition, int year) {
		super(word);
		this.definition=definition;
		this.year=year;
	}
	//toString 
	@Override
	public String toString() {
		return super.toString()+"\n���� : " + definition + "\n�ñ� : " + year+"��";
	}

}