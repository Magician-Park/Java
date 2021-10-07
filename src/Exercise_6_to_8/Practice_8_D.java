package Exercise_6_to_8;
	
	import java.util.*;
	
	public class Practice_8_D {
		public static void main (String arg[]) {
			System.out.println("몆줄까지 출력하시겠습니까?");
			
			Scanner scanne = new Scanner(System.in);
			int f = scanne.nextInt();
			// 피라미드 형 마름모 출력
			for(int i=1; i <= f;i++) {
				for(int j=0; j<f-i;j++) {
					System.out.print(" ");
				}
				for(int k=0;k<(2*i)-1;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=f-1;i>0;i--) {
				for(int j=1;j<(f+1)-i;j++) {
					System.out.print(" ");
				}
				for(int k=0;k<(2*i)-1;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
