package Shape;
/*
 * -x:int
 * -y:int
 * +Shape()
 * +Shape(x:int, y:int)
 * +setter&getter
 * +getSize():double
 * 
 */
public class Shape {
	//filed ����
	private int x,y;
	
	//����Ʈ ������ ����
	public Shape() {
		super();
	}

	//�Ű����� ������ ����
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	//setter&getter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//override ��Ŵ
	public double getSize() {
		return 0.0;
//		return x*y;
//		return 0.0 �� x*y���� �ص� ���������
//		�ڷ��� �ʱⰪ���� �������ָ� ���� ����
		
	}



}
