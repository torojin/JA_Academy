package weekendstudy;

/*
 * 문제 주말에 풀어보기
 * 
 * interface 상속받아서..
 * family 부모클래스
 * 오버라이드는 클래스에서 interface는 상속만
 * 
 * 어렵게 하려면 object array로 해볼것 
 * 
 * --출력
 * 
 * 이름 : 홍길동
 * 아빠는 나가서 일을 한다
 * 
 * 이름 : 소청
 * 엄마는 집안일을 한다
 * 
 * 이름 : 홍준표
 * 아들은 공부를 한다
 * 
 */
public class MainEx {
	public static void main(String[] args) {
		//Object(Instance) 생성
		
		Father ob1=new Father("홍길동");
		Mother ob2=new Mother("소청");
		Son ob3=new Son("홍준표");
		
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
		System.out.println(ob3.toString());
		
		
		System.out.println("-------------ArrayType---------------");
		
		//Object(Instance) 생성
		//ArrayType1 생성
		/*
		Family[] fam=new Family[3];
		fam[0]=new Father("홍길동");//상속받은 클래스를 객체 연결??
		fam[1]=new Mother("소청");
		fam[2]=new Son("홍준표");
		*/
		
		//ArrayType2 생성
		Family[] fam=new Family[] {new Father("홍길동"),
								new Mother("소청"),
								new Son("홍준표")
		};
		
		//출력을 위한 for문
		for(int i=0; i<fam.length; i++) {
			System.out.println(fam[i].toString());
		}
		
		/*
		//출력을 위한 향상된 for문
		for(Family ob : fam) {
			System.out.println(ob.toString());
		}
		*/
		
	}
}
