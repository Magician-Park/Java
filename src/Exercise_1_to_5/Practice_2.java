package Exercise_1_to_5;

	import java.util.Scanner;

	public class Practice_2 {
		public static void main (String arg[]) {
			System.out.printf("����Ǯ�̸� �����մϴ�.\n���� �ΰ��� �Է� �Ͻʽÿ�.\n");
			
			Scanner scan = new Scanner(System.in);
			int input1 = scan.nextInt();	 // ������ ���ڸ� ����� �� �ְԲ� ����
			int input2 = scan.nextInt();	 // ���� ����
			
			System.out.println("+, -, *, / �� ����Ͻ� �������� �������ּ���.");
			String operator = scan.next();
			
			if(operator.equals("+")) {
				System.out.println("����" + input1 + "+" + input2 + "=" +(input1 + input2));
			} 
				else if (operator.equals("-")) {
					System.out.println("����" + input1 + "-" + input2 + "=" +(input1 - input2));
				}	
				
				else if (operator.equals("*")) {
					System.out.println("����" + input1 + "*" + input2 + "=" +(input1 * input2));
				}
				
				else if (operator.equals("/")) {
					System.out.printf("���� %d�̰�, �������� %d�Դϴ�.%n", input1 / input2, input1 % input2);
				}
				
				else {
					System.out.println("�����Դϴ�. +, -, *, / �� �ϳ��� �������ּ���.");
					System.out.println("���α׷��� �����մϴ�.");
					
					scan.close();  // ���ɳ� ����
				}
		}
}