package exercise;
/*
[����1] �޿������� �ۼ��Ͻÿ�
  ����1) �⺻���� 1500000��,������ 55000��,������ �⺻���� 10%
            pay=1500000 / tpay=55000 / tax=0.1  
  ����2) �Ǽ��ɾ� = �⺻�� + �ð����� - ����
           
[���ȭ��] 
�Ǽ��ɾ� : 1405000��???

 */
public class Exercise01 {

	public static void main(String[] args) {
		int pay, tpay;
		double tax;
		pay=1500000;
		tpay=55000;
		tax=(pay+tpay)*0.1;
		
		System.out.println("�Ǽ��ɾ� : "+((pay+tpay)-(int)tax));
	}

}
