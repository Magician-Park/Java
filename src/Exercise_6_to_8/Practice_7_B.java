package Exercise_6_to_8;

	import java.util.*;

	public class Practice_7_B {
		public static void main(String arg[]) {
			Scanner scan = new Scanner(System.in);
			int money=0, pick=0, change = 0;

			int cheonWon, obaegWon, baegWon, osibWon, sibWon= 0;
			
			System.out.println("�ݾ��� �����ϼ���");
			money = scan.nextInt();
			
			System.out.println("�ֹ��Ͻ� �޴��� �������ּ���");
			System.out.printf("1. �ݶ�(850��)\n2. ���̴�(750��)\n3. ���̽ý�(1000��)\n4. ����(800��)\n=> ");
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
					System.out.println("�ܾ� :"+change + "��");
					
					cheonWon = change/1000;
					obaegWon = change%1000/500;
					baegWon = change%1000%500/100;
					osibWon = change%1000%500%100/50;
					sibWon = change%1000%500%100%50/10;
					System.out.printf("õ�� :"+cheonWon+ "��, ");
					System.out.printf("����� :"+obaegWon+ "��, ");
					System.out.printf("��� :"+baegWon+ "��, ");
					System.out.printf("���ʿ� :"+osibWon+ "��, ");
					System.out.println("�ʿ� :"+sibWon+ "��");

					}
				}	
		}