package test23;
/*
클래스명 : SubEntry  ==> Entry상속
-definition:String
-year:int
+SubEntry()
+SubEntry(definition:String, year:int)
+SubEntry(word:String, definition:String, year:int)
+toString():String           ==> 원어, 시기 출력

(3) 출력화면

*****약어사전******
약어 : OOP
원어 : Object Oriented Programming
시기 : 1991년
 */
//자식클래스 / 부모클래스 Entry 상속
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
		return super.toString()+"\n원어 : " + definition + "\n시기 : " + year+"년";
	}

}
