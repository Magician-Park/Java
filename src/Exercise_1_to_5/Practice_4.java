package Exercise_1_to_5;

	import java.util.Scanner;

	public class Practice_4 {
		public static void main (String arg[]) {
			System.out.printf("����Ǯ�̸� �����մϴ�.\n���� �ΰ��� �Է� �Ͻʽÿ�.\n");
			
			Scanner scan = new Scanner(System.in);
			char input1 = scan.next().charAt(0);	// charAt(0)�� ��������μ� ���ĺ��� ASCII�ڵ�� ��ȯ ����
			char input2 = scan.next().charAt(0);	// ���� ����
			
			System.out.println("+, -, *, / �� ����Ͻ� �������� �������ּ���.");
			String operator = scan.next();
			
			if(operator.equals("+")) {
				System.out.println("���� " + input1 + " + " + input2 + " = " +(input1 +""+ input2));	// ASCII�ڵ�� ��ȯ���� �ʰ� ���ڿ� �״�� �������� ���ϴ� ���
			} 
				else if (operator.equals("-")) {
					System.out.println("���� " + input1 + " - " + input2 + " = " +(input1 - input2));		// �������� ASCII�ڵ�� ��ȯ�Ͽ� ���
				}	
				
				else if (operator.equals("*")) {
					System.out.println("���� " + input1 + " * " + input2 + " = " +(input1 * input2));	// ���� ����.
				}
				
				else if (operator.equals("/")) {
					System.out.printf("���� %d�̰�, �������� %d�Դϴ�.%n", input1 / input2, input1 % input2);		// ���� ����.
				}
				
				else {
					System.out.println("�����Դϴ�. +, -, *, / �� �ϳ��� �������ּ���.");
					System.out.println("���α׷��� �����մϴ�.");
					
					scan.close();  // ���ɳ� ����
				}
		}
}