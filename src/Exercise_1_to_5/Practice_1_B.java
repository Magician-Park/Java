package Exercise_1_to_5;

	import java.util.Scanner;
	
	public class Practice_1_B {
		public static void main(String arg[]) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("�ȳ��ϼ��� ������ �����մϴ�");
			System.out.println("�ϳ��� ������ �Է� ��������!");
			int input1 = scanner.nextInt();
			
			System.out.println("�Է��Ͻ� ������ �ٸ� ������ �޾� �ջ� �մϴ�.");
			System.out.println("�ϳ��� ������ �� �Է� ���ּ���.");
			int input2 = scanner.nextInt();
			
			System.out.println("ù��° �Է��Ͻ� ���� = "+input1);
			System.out.println("�ι�° �Է��Ͻ� ���� = "+input2);
			System.out.println("���� ���� = "+input1 + input2);
			
			System.out.printf("%d + %d = %d\n", input1, input2, input1+input2);
			System.out.println(input1+input2);
		}
	}