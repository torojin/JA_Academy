package Shape;
/*
 * +Rectangle()
 * +Rectangle(x:int, y:int)
 * +getSize():double
 */
public class Rectangle extends Shape{
	//����Ʈ ������ ����
	public Rectangle() {
		super();
	}
	//�Ű����� ������ ����
	public Rectangle(int x, int y) {
		super(x,y);
	}
	
	@Override
	public double getSize() {
		//�θ� Ŭ������ getter���� �޾ƿ�
//		return (getX()*getY());
		//��Ȯ�ϰ� ǥ���Ϸ���
		return (super.getX()*super.getY());
	}
}
