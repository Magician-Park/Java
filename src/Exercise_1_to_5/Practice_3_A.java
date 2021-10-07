package Exercise_1_to_5;

import java.util.Scanner;

	public class Practice_3_A {
		public static void main (String arg[]) {
			Scanner scan = new Scanner(System.in);
			System.out.println("형변환 하실 수를 입력해주세요.");
			double a = scan.nextDouble();
			System.out.printf("%.1f\n", a);		// 소수점 첫째자리까지 형변환
			System.out.println((int)a);			// Integer 형변환
		}
}