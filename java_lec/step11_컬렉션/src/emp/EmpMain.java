package emp;

import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		EmpDao dao=new EmpDao();
		System.out.println("**** ��� ��� ����ϱ� ****");
		
		List<EmpVO> list=dao.getEmpList();
		for(EmpVO ob:list) {
			System.out.print("�̸� : "+ob.getEname()+"\t");
			System.out.print("�̸� : "+ob.getDept()+"\t");
			System.out.println("�̸� : "+ob.getSalary());
		}
	}

}
