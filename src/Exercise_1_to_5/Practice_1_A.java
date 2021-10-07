package Exercise_1_to_5;

	import java.util.Scanner;

	public class Practice_1_A {
		public static void main(String arg[]) {
			System.out.printf("안녕하세요 문제를 시작합니다\n하나의 정수를 입력 받으세요!\n");
			
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			
			System.out.println("입력하신 정수와 다른 정수를 받아 합산 합니다");
			System.out.println("하나의 정수를 더 입력 해주세요");
			
			int input1 = scan.nextInt();
			
			System.out.println("첫번째 입력 하신 정수 = "+input + "\n두번째 입력 하신 정수 = "+input1 + "\n둘의 합은? = " + input+input1);
			System.out.printf("%d + %d = %d\n", input, input1, input+input1);
			System.out.println(input+input1);
		}
	}