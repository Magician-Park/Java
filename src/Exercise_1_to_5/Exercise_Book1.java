package Exercise_1_to_5;

	import java.util.*;

	public class Exercise_Book1 {
		public static void main (String arg[]) {
			int money = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("�ݾ��� �Է����ּ���.");
			money = scan.nextInt();
			while (money > 0) {
			System.out.println("1�� �ݶ�/100 2�� ���̴�/200 3�� �����ݶ�/400 4�� ���λ��̴�/500 5�� ȯ��");
			int i = scan.nextInt();
			if(i == 1) {
				money -= 100;
				System.out.println("���� ������ : "+money);
				continue;
			}
			else if(i == 2) {
				money -= 200;
				System.out.println("���� ������ : "+money);
				continue;
			}
			else if(i == 3) {
				money -= 300;
				System.out.println("���� ������ : "+money);
				continue;
			}
			else if(i == 4) {
				money -= 400;
				System.out.println("���� ������ : "+money);
				continue;
			}
			else if(i == 5) {
				System.out.println("ȯ��");
				System.out.println("���� ������ : "+money);
				break;
			}
			
			else {
				System.out.println("1������ 5�������� ���� ����.");
				break;
			}
		}
	}		
}