package Exercise_6_to_8;
	
	import java.util.*;
	
	public class Practice_7_A {
		public static void main (String arg[]) {
			int money;
			System.out.println("�ݾ��� �־��ּ���");
			Scanner scan = new Scanner(System.in);
			money = scan.nextInt();
			while (0 < money) {
			System.out.println("1 : �ݶ�(800��) 2 : ���̴�(700��) 3 : ȯŸ(600��) 4 : ����ƾ��(1000��) 5 : ȯ��");
			int c = scan.nextInt();
			if ( 0 < c && c <= 5); {
				switch( c) {
				case 1:
					money -= 800;
					System.out.println("���� �ݾ��� = "+money);
					continue;
				case 2:
					money -= 700;
					System.out.println("���� �ݾ��� = "+money);
					continue;
				case 3:
					money -= 600;
					System.out.println("���� �ݾ��� = "+money);
					continue;
				case 4:
					money -= 1000;
					System.out.println("���� �ݾ��� = "+money);
					continue;
				case 5:
					System.out.println("ȯ�ҵǾ����ϴ�");
					break;
				}
			}
		}
	}
}
