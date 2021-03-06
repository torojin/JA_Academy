package test19;
/*
[문제19] 클래스 2개를 만들고 setter & getter를 이용하여 다음을 완성하시오
(1) package명은 test19로 하고 BookShapEx.java파일을 만드시오
클래스명 : BookShop
-bname:String   (책이름)
-author:String   (저자) 
-price:int          (가격) 

+setBook(bname:String,  author:String, price:int):void
+viewBook():void
+setter & getter

클래스명:BookShopEx  -- main() 포함
BookShop ob=new BookShop();
ob.setBook("자바완성","황완성",25000);
//viewBook()메서드를 이용해서 나머지 완성하시오

ob.setBname("JSP잡기"),  
ob.setAuthor("송JP"), 
ob.setPrice(3500)
//getter를 이용해서 나머지 완성하시오

(3) 출력화면
책이름 : 자바완성
저  자 : 황완성
가  격 : 25000원

책이름 : JSP잡기
저  자 : 송JP
가  격 : 35000원
 */
class BookShop{
	//filed
	private String bname;
	private String author;
	private int price;
	
	public void setBook(String bname, String author, int price) {
		this.bname=bname;
		this.author=author;
		this.price=price;
	}
	public void viewBook() {
		System.out.println("책이름 : "+bname);
		System.out.println("저  자 : "+author);
		System.out.println("가  격 : "+price+"원");
	}
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
public class BookShapEx {

	public static void main(String[] args) {
		BookShop ob=new BookShop();
		//setData
		ob.setBook("자바완성","황완성",25000);
		//순서대로 배치해야 원하는 데이터가 출력됨
		ob.viewBook();
		
		ob.setBname("JSP잡기");
		ob.setAuthor("송JP");
		ob.setPrice(3500);
		
		
		//getter 출력
		System.out.println("책이름 : "+ob.getBname());
		System.out.println("저  자 : "+ob.getAuthor());
		System.out.println("가  격 : "+ob.getPrice()+"원");
		System.out.println();
		
		
	}

}
