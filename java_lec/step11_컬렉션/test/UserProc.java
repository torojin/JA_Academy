package test;
//�Է°��� ���� �˻�
//����� ó��
//����Ͻ� ����(�����ͺ��̽� ���� ó��)
public class UserProc {

	public User getLoginUser(String id, String pw) {
		/* ����
		 * �Ű������� ���� pororo, 1234�� ���Ͽ�
		 * ������ entity ��ü�� ����(User�ڷ������� �����������)
		 * setter�� ���� id,pw, "�Ƿη�", 89.97�� �����ϼ���
		 * 
		 * entity�� �����ϼ���
		 * 
		 * .equals : ��ü ���ϴ� ��
		 * 
		 */
		//������ ���� null���� �־� �ʱ�ȭ�������??
		User entity = null; //������ �������� ������ null���� ���
		
		//�Ű������� ���� pororo, 1234�� ��
		if(id.equals("pororo") && pw.equals("1234")) {
			entity=new User(); //������ entity ��ü�� ����
			//setter�� ���� id,pw, "�Ƿη�", 89.97�� �����ϼ���
			//�����ͺ��̽��� ��� �����ͺ��̽� ��� �־��ִ� �� / Dao�ΰ� ó�� ������ذ�
			entity.setId(id);
			entity.setPw(pw);
			entity.setName("�Ƿη�");
			entity.setPoint(89.97);
		}
		return entity;
	}

}
