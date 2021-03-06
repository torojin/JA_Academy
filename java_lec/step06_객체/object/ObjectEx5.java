package object;
/*
 * 클래스명 : Sales
 * -item : String
 * -qty : int
 * -cost : int
 * +getter & setter
 * 
 * +toString():String 	==> 출력문장 만들기
 * +getPrice():int		==> 수량 * 단가를 리턴
 * 
 * --결과
 * (아래 문장을 toString으로)
 * 품목 : apple
 * 수량 : 5
 * 단가 : 1200 
 * 금액 : 6000원(getter로 처리)
 * 
 * apple 1200원 짜리 5개 구입하려면 6000원이 필요함 ==> main에서 출력 getter이용
 */

//class 생성
class Sales {
	//field 
	private String item;
	private int qty;
	private int cost;
	
	//setter 다른 방식으로 출력
	public void setSales(String item, int qty, int cost) {
		this.item=item;
		this.qty=qty;
		this.cost=cost;
	}/*
	//setter
	public void setItem(String item) {
		this.item = item;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}*/
	
	//toString
	@Override
	public String toString() {
		return "품목 : " + item + "\n수량 : " + qty + "\n단가 : " + cost + "\n금액 : "+getPrice();
	}
	
	//getter
	public String getItem() {
		return item;
	}
	public int getQty() {
		return qty;
	}
	public int getCost() {
		return cost;
	}
	public int getPrice() {
		return qty*cost;
	}
	public String getFinal() {
		return item+" "+cost+"원 짜리 "+qty+"개 구입하려면 "+getPrice()+"원이 필요함";
	}
	
	
}


public class ObjectEx5 {

	public static void main(String[] args) {
		//객체 생성
		Sales sal=new Sales();
		//setter 다른 방식으로 data삽입
		sal.setSales("apple",5,1200);
		//setter data
//		sal.setItem("apple");
//		sal.setQty(5);
//		sal.setCost(1200);
		
		System.out.println(sal.toString());//toString 출력
		System.out.println(); //공백
//		System.out.println(sal.getFinal()); //getter데이터 출력
		//강사님 코드
		System.out.println(sal.getItem()+" "+sal.getCost()+"원 짜리 "
				+sal.getQty()+"개 구입하려면"+sal.getPrice()+"원이 필요함");
	}

}
