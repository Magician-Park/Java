package Exercise_6_to_8;
	
	import java.util.*;
	
	public class Practice_7_A {
		public static void main (String arg[]) {
			int money;
			System.out.println("금액을 넣어주세요");
			Scanner scan = new Scanner(System.in);
			money = scan.nextInt();
			while (0 < money) {
			System.out.println("1 : 콜라(800원) 2 : 사이다(700원) 3 : 환타(600원) 4 : 마운틴듀(1000원) 5 : 환불");
			int c = scan.nextInt();
			if ( 0 < c && c <= 5); {
				switch( c) {
				case 1:
					money -= 800;
					System.out.println("남은 금액은 = "+money);
					continue;
				case 2:
					money -= 700;
					System.out.println("남은 금액은 = "+money);
					continue;
				case 3:
					money -= 600;
					System.out.println("남은 금액은 = "+money);
					continue;
				case 4:
					money -= 1000;
					System.out.println("남은 금액은 = "+money);
					continue;
				case 5:
					System.out.println("환불되었습니다");
					break;
				}
			}
		}
	}
}
