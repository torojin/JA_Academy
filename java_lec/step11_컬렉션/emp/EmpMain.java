package emp;
//�����ͺ��̽��� �����ϴ� ���� ���鶧 ���� �� ������ ����Ѵ�.
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		//������ ���̽��� �ִٴ� �����Ͽ� dao �����
		//EmpDao Object ����
		EmpDao dao=new EmpDao();
		System.out.println("**** ��� ��� ����ϱ� ****");
		
		List<EmpVO> list=dao.getEmpList();//4  List<EmpVO> list �̰� ���ٸ� ������
		//���� for������ ��� ����Ʈ ���
		for(EmpVO ob:list) {
			System.out.print("�̸� : "+ob.getEname()+"\t");
			System.out.print("�̸� : "+ob.getDept()+"\t");
			System.out.println("�̸� : "+ob.getSalary());
		}
		//--------------------------------------------------------
		System.out.println("**** lee ��� ��� ****");
		EmpVO vo=dao.getEmp("lee");
		
		if(vo==null) {
			System.out.println("ã�� ����� �����...");
		}else {
			System.out.println(vo.getEname()+" "+vo.getDept()+" "+vo.getSalary());
		}
	}

}
