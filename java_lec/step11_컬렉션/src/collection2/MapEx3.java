package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx3 {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		//Map�� ������ ����
		map.put(3, "��ī��");
		map.put(1, "�Ḹ��");
		map.put(4, "���̸�");
		map.put(2, "���α�");
		
		System.out.println(map);
		/* set ������� ���??
		Set<Integer> keys=map.keySet();
		for(Integer n:keys)
			System.out.println(map.get(n));
		*/
		
		//list�� �־ ���ĸ� �ϴ� ���
		Set<Integer> keys=map.keySet();
		List<Integer> list=new ArrayList<Integer>(keys);
		System.out.println(list);
		//���� �� �� ������ ����
		Collections.sort(list);
		for(Integer n:list)
			System.out.println(map.get(n));
	}
}
