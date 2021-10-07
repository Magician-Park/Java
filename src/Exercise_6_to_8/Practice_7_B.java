package Exercise_6_to_8;

	import java.util.*;

	public class Practice_7_B {
		public static void main(String arg[]) {
			Scanner scan = new Scanner(System.in);
			int money=0, pick=0, change = 0;

			int cheonWon, obaegWon, baegWon, osibWon, sibWon= 0;
			
			System.out.println("금액을 투입하세요");
			money = scan.nextInt();
			
			System.out.println("주문하실 메뉴를 선택해주세요");
			System.out.printf("1. 콜라(850원)\n2. 사이다(750원)\n3. 아이시스(1000원)\n4. 몬스터(800원)\n=> ");
				pick = scan.nextInt();
				if(pick==1 && money>100) {
					change = money - 100;

				}
				else if (pick==2 && money>200) {
					change = money - 200;

				}
				else if (pick==3 && money>300) {
					change = money - 300;

				}
				else if (pick==4 && money>400) {
					change = money - 400;

				}
				else {
					System.out.println("잔액 :"+change + "원");
					
					cheonWon = change/1000;
					obaegWon = change%1000/500;
					baegWon = change%1000%500/100;
					osibWon = change%1000%500%100/50;
					sibWon = change%1000%500%100%50/10;
					System.out.printf("천원 :"+cheonWon+ "개, ");
					System.out.printf("오백원 :"+obaegWon+ "개, ");
					System.out.printf("백원 :"+baegWon+ "개, ");
					System.out.printf("오십원 :"+osibWon+ "개, ");
					System.out.println("십원 :"+sibWon+ "개");

					}
				}	
		}