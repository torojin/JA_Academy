package emp;

import java.util.ArrayList;
import java.util.List;

//DAO (Data Access Object) : �����ͺ��̽����� �ڿ��� ������ �뵵�� ����ϴ� Ŭ����
//�����͸� �������� �����ϴ� �뵵�� ��� / �����ͺ��̽��� ���������� �����ϴ� ��
public class EmpDao {
	List<EmpVO> list=null;
	
	//�����ڿ� �����͸�... �����ϴ°�?
	public EmpDao() {
		list=new ArrayList<EmpVO>();
		list.add(new EmpVO("kim", "������", 1000000));
		list.add(new EmpVO("lee", "���ߺ�", 1500000));
		list.add(new EmpVO("park", "������", 2000000));
	}

	//�޼��� ����
	public List<EmpVO> getEmpList() {
		return list; //�����Ͱ� �ִ� list�� �°�
	}
	

}
