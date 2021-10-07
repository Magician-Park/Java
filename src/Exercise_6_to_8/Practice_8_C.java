package Exercise_6_to_8;
	
	import java.util.Scanner;
	
	public class Practice_8_C {
		public static void main(String arg[]) {
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();		// 입력값대로 * 피라미드 생성 
			for(int i = 0; i < a; i++) {
				
				for(int j=1; j < a-i; j++) {
					System.out.printf(" ");
				}
				for(int a1 = 0; a1 < i*2+1; a1++) {
					System.out.printf("*");
				}
				
				System.out.println();
			}
		}
}
