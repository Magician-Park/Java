package Exercise_1_to_5;

import java.util.Scanner;

	public class Practice_3_A {
		public static void main (String arg[]) {
			Scanner scan = new Scanner(System.in);
			System.out.println("����ȯ �Ͻ� ���� �Է����ּ���.");
			double a = scan.nextDouble();
			System.out.printf("%.1f\n", a);		// �Ҽ��� ù°�ڸ����� ����ȯ
			System.out.println((int)a);			// Integer ����ȯ
		}
}