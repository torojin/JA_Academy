package object;

public class ObjectEx4 {

	public static void main(String[] args) {
		//��ü ����
		Employee em=new Employee();
		//setter�� ������ �Է�
		em.setName("�̼���");
		em.setDept("���ߺ�");
		em.setPay(1500000);
		em.setScore(85.75);
		System.out.println(em.toString());
		//setter ������ ����?
		em.setEmployee("���޷�", "�ѹ���", 1200000, 75.34);
		
		//getter
		System.out.println("����̸� : "+em.getName());
		System.out.println("�ٹ��μ� : "+em.getDept());
		System.out.println("�����޿� : "+em.getPay());
		System.out.println("�Ի����� : "+em.getScore());
		
		
	}

}
