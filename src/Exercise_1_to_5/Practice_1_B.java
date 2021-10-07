package Exercise_1_to_5;

	import java.util.Scanner;
	
	public class Practice_1_B {
		public static void main(String arg[]) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("안녕하세요 문제를 시작합니다");
			System.out.println("하나의 정수를 입력 받으세요!");
			int input1 = scanner.nextInt();
			
			System.out.println("입력하신 정수와 다른 정수를 받아 합산 합니다.");
			System.out.println("하나의 정수를 더 입력 해주세요.");
			int input2 = scanner.nextInt();
			
			System.out.println("첫번째 입력하신 정수 = "+input1);
			System.out.println("두번째 입력하신 정수 = "+input2);
			System.out.println("둘의 합은 = "+input1 + input2);
			
			System.out.printf("%d + %d = %d\n", input1, input2, input1+input2);
			System.out.println(input1+input2);
		}
	}