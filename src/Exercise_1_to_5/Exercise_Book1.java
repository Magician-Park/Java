package Exercise_1_to_5;

	import java.util.*;

	public class Exercise_Book1 {
		public static void main (String arg[]) {
			int money = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("금액을 입력해주세요.");
			money = scan.nextInt();
			while (money > 0) {
			System.out.println("1번 콜라/100 2번 사이다/200 3번 제로콜라/400 4번 제로사이다/500 5번 환불");
			int i = scan.nextInt();
			if(i == 1) {
				money -= 100;
				System.out.println("남은 가격은 : "+money);
				continue;
			}
			else if(i == 2) {
				money -= 200;
				System.out.println("남은 가격은 : "+money);
				continue;
			}
			else if(i == 3) {
				money -= 300;
				System.out.println("남은 가격은 : "+money);
				continue;
			}
			else if(i == 4) {
				money -= 400;
				System.out.println("남은 가격은 : "+money);
				continue;
			}
			else if(i == 5) {
				System.out.println("환불");
				System.out.println("남은 가격은 : "+money);
				break;
			}
			
			else {
				System.out.println("1번부터 5번까지만 선택 가능.");
				break;
			}
		}
	}		
}