package collection2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx5 {

	public static void main(String[] args) {
		//���׸�����
		Map<String, String> map=new HashMap<String, String>();//Map<String, Book> map=new HashMap<>();�Ȱ���.
		//�������� ����
		/*
		map.put("�Ѹ�", "����1");
		map.put("��ġ", "����2");
		map.put("������", "����3");
		map.put("�����", "����4");
		map.put("��浿", "����5");
		*/
		//�ߺ��Ǵ� ������ ������ 
		map.put("�Ѹ�", "����1");
		map.put("��ġ", "����2");
		map.put("������", "����3");
		map.put("�����", "����2");
		map.put("��浿", "����3");
		
		Scanner sc=new Scanner(System.in);
		System.out.print("�� �̸��� �Է��ϼ��� (����1~5) : ");
		String room=sc.next();
		//������ �����ϴ� ���
		Set<String> keys=map.keySet();// keySet() : key���� �ʿ��� ��� ���
		for(String key:keys) {
			//�����Ͱ� ������ �˻�
			String rom=map.get(key);
			
			if(rom.equals(room)) {
				System.out.println(room+"�� �ִ� ����ڴ� "+key+"�Դϴ�.");
			}
		}
	}

}
