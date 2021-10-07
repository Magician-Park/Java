package Exercise_1_to_5;

	import java.util.Scanner;

	public class Practice_4 {
		public static void main (String arg[]) {
			System.out.printf("문제풀이를 시작합니다.\n문자 두개를 입력 하십시오.\n");
			
			Scanner scan = new Scanner(System.in);
			char input1 = scan.next().charAt(0);	// charAt(0)을 사용함으로서 알파벳을 ASCII코드로 변환 가능
			char input2 = scan.next().charAt(0);	// 이하 동문
			
			System.out.println("+, -, *, / 중 계산하실 연산자을 선택해주세요.");
			String operator = scan.next();
			
			if(operator.equals("+")) {
				System.out.println("답은 " + input1 + " + " + input2 + " = " +(input1 +""+ input2));	// ASCII코드로 변환하지 않고 문자열 그대로 더해지게 구하는 방식
			} 
				else if (operator.equals("-")) {
					System.out.println("답은 " + input1 + " - " + input2 + " = " +(input1 - input2));		// 나머지는 ASCII코드로 변환하여 계산
				}	
				
				else if (operator.equals("*")) {
					System.out.println("답은 " + input1 + " * " + input2 + " = " +(input1 * input2));	// 이하 동문.
				}
				
				else if (operator.equals("/")) {
					System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", input1 / input2, input1 % input2);		// 이하 동문.
				}
				
				else {
					System.out.println("오류입니다. +, -, *, / 중 하나를 선택해주세요.");
					System.out.println("프로그램을 종료합니다.");
					
					scan.close();  // 스케너 종료
				}
		}
}