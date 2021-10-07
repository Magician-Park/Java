package Exercise_1_to_5;

	import java.util.Scanner;

	public class Practice_2 {
		public static void main (String arg[]) {
			System.out.printf("문제풀이를 시작합니다.\n정수 두개를 입력 하십시오.\n");
			
			Scanner scan = new Scanner(System.in);
			int input1 = scan.nextInt();	 // 정수형 숫자만 계산할 수 있게끔 설계
			int input2 = scan.nextInt();	 // 이하 동문
			
			System.out.println("+, -, *, / 중 계산하실 연산자을 선택해주세요.");
			String operator = scan.next();
			
			if(operator.equals("+")) {
				System.out.println("답은" + input1 + "+" + input2 + "=" +(input1 + input2));
			} 
				else if (operator.equals("-")) {
					System.out.println("답은" + input1 + "-" + input2 + "=" +(input1 - input2));
				}	
				
				else if (operator.equals("*")) {
					System.out.println("답은" + input1 + "*" + input2 + "=" +(input1 * input2));
				}
				
				else if (operator.equals("/")) {
					System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", input1 / input2, input1 % input2);
				}
				
				else {
					System.out.println("오류입니다. +, -, *, / 중 하나를 선택해주세요.");
					System.out.println("프로그램을 종료합니다.");
					
					scan.close();  // 스케너 종료
				}
		}
}