package object;
/* Ŭ���� ���̾�׷� ǥ��
 * -(private) +(public) #(protected)
 *  ���� �̸�
 *  �߰� ����
 *  ��ȣ�� �ִ°� �Լ�
 *  
 *  Ŭ���� �� : Person
 *  +name : String
 *  +age : int
 *  +score : float
 *  +setPerson(name:String, a:int, s:float) : void
 *  +viewPerson():void
 *
 */

//��ȣ�� ������ �Լ�
class Person{

//	3. ���⼭ ���� ���� �ް�?
	public String name;//��� ���� (float) ����
	public int age;
	public float score;
	
	//������ ���� �����ִ°� set?
	//set�� �پ� �ִ��� ���� ���Խ����ִ� ��
	public void setPerson(String n, int a, float s) { //2. "������",23,73.5f�� ������ ���� //���� ����
		//��� �Լ� ����, method
		//(String name, int age, float score)
		//������. �ڱ��ڽ��� ��ü�� �̸��� ��ġ��...?
		//this�� �ڱ��ڽ��� �ٶ󺸰� �ϴ�..
//		this.name=name;
//		this.age=age;
//		this.score=score;
		name=n;
		age=a;
		score=s;
		

	}
	//
	public void viewPerson() {
		//4.main�� ���� ��...
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("���� : "+score);
	}
}


public class ObjectEx1 {
//public : ���� ������
//public�� �ϴ� ����..
// �ü���� �����ϰ� �ϴ°�?
	public static void main(String[] args) {
		//����ϰ����ϴ� �Լ��� �ִ� Ŭ������ ����ؾ��Ѵ�.
		//Person class�� ������ pa��ü�� �����
		Person ps=new Person(); //new Person : �� ������ �޸𸮸� �Ҵ��ϴ� �ν��Ͻ� / �� ���� : ���α׷��� ������ �ϰ� ���� ��Ÿ��... / ���� : ������ ���Ͽ� �����Ǵ� ��/�������ε�
		ps.setPerson("������",23,73.5f);//1. setPerson�� �����͸� ���� / ps:��ü(�ʵ�� �޼����� �����̴�)
		ps.viewPerson();
		System.out.println(ps.hashCode()); 
		//haxh : �������� �ν��Ͻ��� ���� �������� �ִ� ���
		//hashCode ���� �ּ�
		
		ps=new Person(); 
		ps.setPerson("������",25,73.5f);
		ps.viewPerson();
		System.out.println(ps.hashCode());
		
	}

}
