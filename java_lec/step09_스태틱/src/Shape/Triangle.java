package Shape;
/*
 * +Triangle()
 * +Triangle(x:int, y:int)
 * +getSize():double
 */
//Shape ���
public class Triangle extends Shape{
	//�θ� Ŭ�������� ������ �޾ƿ��� �Ǳ� ������
	//�ʵ�(����) ���� ���ص� �ȴ�.
	//����Ʈ ������ ����
	public Triangle() {
		super();
	}
	//�Ű����� ������ ����
	public Triangle(int x, int y) {
		super(x,y);
	}
	//���� �޼��� ��� ǥ��..?
	@Override
	public double getSize() {
		//�θ� Ŭ������ getter���� �޾ƿ�
//		return (getX()*getY())/2.0;
		//��Ȯ�ϰ� ǥ���Ϸ���
		return (super.getX()*super.getY())/2.0;
	}

}
