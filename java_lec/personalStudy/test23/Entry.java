package test23;
/*
(2)클래스명 : Entry
-word:String
+Entry()                            ==> **  약어사전 **    출력
+Entry(word:String)
+toString()String               ==> 약어 : OOP   출력

(3) 출력화면

*****약어사전******
약어 : OOP
원어 : Object Oriented Programming
시기 : 1991년
 */
public class Entry {
	//filed 
	private String word;
	//default constructor
	public Entry() {
		super();
		System.out.println("*****약어사전*****");
	}
	//parameter constructor
	public Entry(String word) {
		this();
		this.word=word;
	}
	//toString
	@Override
	public String toString() {
		return "약어 : "+word;
	}
	
}
