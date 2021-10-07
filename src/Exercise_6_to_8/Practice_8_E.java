package Exercise_6_to_8;

import java.util.Scanner;

public class Practice_8_E {
		public static void main (String arg[]) {
			System.out.println("몆줄까지 출력하시겠습니까?");
			
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			// 공백 + 마름모 출력
			for(int i=0;i<a;i++) {
				for(int j=0; j<a; j++)
				{
					if (i<=a/2) // 위쪽 영역
					{
						if (i+j<=a/2-1) // 왼쪽 위 공백찍기
							System.out.print(" ");
						else if (j-i>=a/2+1) // 오른쪽 위 공백찍기
							System.out.print(" ");
						else
							System.out.print("*"); // 남은 공간에 * 찍기
					}
					else if(i>a/2) // 아래쪽 영역
					{
						if (i-j>=a/2+1) // 왼쪽 밑 공백
							System.out.print(" ");
						else if (i+j>=a/2*3+1) // 오른쪽 밑 공백
							System.out.print(" ");
						else
							System.out.print("*"); // * 찍기
					}
				}
				System.out.println(); // 줄바꿈
			}
		}
}
