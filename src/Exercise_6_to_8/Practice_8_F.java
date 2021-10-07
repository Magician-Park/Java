package Exercise_6_to_8;
	
	import java.util.*;
	
	public class Practice_8_F {
		public static void main (String arg[]) {
			System.out.println("실행하려면 1 ~ 9 중 아무 숫자나 눌러주세요.");
			
			Scanner z = new Scanner(System.in);
			int y = z.nextInt();
			
			while (y <= 9) {
			System.out.println("몆번을 선택하실건지 골라주십시오.");
			System.out.printf("1. 직각삼각형(왼쪽정렬)\n2. 역직각삼각형\n3. 피라미드\n4. 역피라미드\n");
			System.out.printf("5. 피라미드형 마름모\n6. 공백형 마름모\n7. 직각삼각형(오른쪽정렬)\n");
			
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			
				switch (a) {
				case 1:
					System.out.println("몆줄까지 출력하시겠습니까?");
					Scanner sc = new Scanner(System.in);
					int b = sc.nextInt();
					for(int i = 0; i < b; i++) {
						for(int j = 0; j <= i; j++) {
						// 정직각삼각형(왼쪽) 출력
							System.out.printf("*");
						}
							System.out.println();
					}
					continue;
				case 2:
					System.out.println("몆줄까지 출력하시겠습니까?");
					Scanner sca = new Scanner(System.in);
					int c = sca.nextInt();
					for(int i = 0; i < c; i++) {
						for(int j = 0; j < c-i; j++) {
						// 역직각삼각형 출력
							System.out.printf("*");
						}
							System.out.println();
					}
					continue;
				case 3:
					System.out.println("몆줄까지 출력하시겠습니까?");
					Scanner scan = new Scanner(System.in);
					int d = scan.nextInt();
					for(int i = 0; i < d; i++) {
						// 피라미드 출력
						for(int j=1; j < d-i; j++) {
							System.out.printf(" ");
						}
						for(int a1 = 0; a1 < i*2+1; a1++) {
							System.out.printf("*");
						}
						
						System.out.println();
					}
					continue;
				case 4:
					System.out.println("몆줄까지 출력하시겠습니까?");
					Scanner scann = new Scanner(System.in);
					int e = scann.nextInt();
					for(int i = e; i > 0; i--) {
						// 역피라미드 출력
						for(int j = e-i; j > 0; j--) {
							System.out.printf(" ");
						}
						for(int b1 = i*2-1; b1 > 0; b1--) {
							System.out.printf("*");
						}
						
						System.out.println();
					}
					continue;
				case 5:
					System.out.println("몆줄까지 출력하시겠습니까?");
					Scanner scanne = new Scanner(System.in);
					int f = scanne.nextInt();
					// 피라미드 형 마름모 출력
					for(int i = 1; i <= f; i++) {
						for(int j = 0; j < f-i; j++) {
							System.out.print(" ");
						}
						for(int k = 0; k < (2*i)-1; k++) {
							System.out.print("*");
						}
						System.out.println();
					}
					for(int i = f-1; i > 0; i--) {
						for(int j = 1; j < (f +1)-i; j++) {
							System.out.print(" ");
						}
						for(int k=0;k<(2*i)-1;k++) {
							System.out.print("*");
						}
						System.out.println();
					}
					continue;
				case 6:
					System.out.println("몆줄까지 출력하시겠습니까?");
					Scanner scanner = new Scanner(System.in);
					int g = scanner.nextInt();
					// 공백 + 마름모 출력
					for(int i=0;i<g;i++) {
						for(int j=0; j<g; j++)
						{
							if (i<=g/2) // 위쪽 영역
							{
								if (i+j<=g/2-1) // 왼쪽 위 공백찍기
									System.out.print(" ");
								else if (j-i>=g/2+1) // 오른쪽 위 공백찍기
									System.out.print(" ");
								else
									System.out.print("*"); // 남은 공간에 * 찍기
							}
							else if(i>g/2) // 아래쪽 영역
							{
								if (i-j>=g/2+1) // 왼쪽 밑 공백
									System.out.print(" ");
								else if (i+j>=g/2*3+1) // 오른쪽 밑 공백
									System.out.print(" ");
								else
									System.out.print("*"); // 남은 공간에 * 찍기
							}
						}
						System.out.println(); // 줄바꿈
					}
					continue;
				case 7:
					System.out.println("몆줄까지 출력하시겠습니까?");
					Scanner scanners = new Scanner(System.in);
					int h = scanners.nextInt();
					for(int i = 1; i <= h; i++) { // 정직각삼각형(오른쪽) 출력
						for(int j = h; j > 0; j--) {
							if(j > i) {
								System.out.print(" ");
							}
							else {
								System.out.print("*");
							}
						}
						System.out.println();
					}
					continue;
				}
				System.out.println("잘못 입력하셨습니다. 1 ~ 6까지 중에서 선택해 주십시오.");
			}
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
}
