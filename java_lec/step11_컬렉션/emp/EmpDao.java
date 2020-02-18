package emp;

import java.util.ArrayList;
import java.util.List;

//DAO (Data Access Object) : �����ͺ��̽����� �ڿ��� ������ �뵵�� ����ϴ� Ŭ����
//�����͸� �������� �����ϴ� �뵵�� ��� / �����ͺ��̽��� ���������� �����ϴ� ��
public class EmpDao {
	//1 �ʱ�ȭ ����Ʈ��� �̸��� �־�� ��ü ��������
	List<EmpVO> list=null;
	
	//�����ڿ� �����͸�... �����ϴ°�?
	public EmpDao() {
		//2 ��ü ����
		//������ �����ֱ� ���� ���Ƿ� ���
		//�����ͺ��̽��� ���� ���� �ߴٰ� �����ϸ� �� ��
		list=new ArrayList<EmpVO>(); //ArrayList Ŭ������ �ڷ����� EmpVO��� / EmpVO ������ ȣ��
		list.add(new EmpVO("kim", "������", 1000000)); //list �ȿ� ����ֱ� ������ ã�Ƽ� �����ִ�..?
		list.add(new EmpVO("lee", "���ߺ�", 1500000));
		list.add(new EmpVO("park", "������", 2000000));
	}

	//�޼��� ����
	public List<EmpVO> getEmpList() {
		//3
		return list; //�����Ͱ� �ִ� list�� �°� 
	}
	//getEmp ����
	//�ϳ��� �����͸� �ϳ��� �����ϴ� �� ����?
	public EmpVO getEmp(String name) {
		for(EmpVO vo:list) {
			if(vo.getEname().equals(name))
				return vo;
		}
			
		return null;
	}
	

}
