package Exercise_1_to_5;

	import java.util.Scanner;

	public class Practice_1_A {
		public static void main(String arg[]) {
			System.out.printf("�ȳ��ϼ��� ������ �����մϴ�\n�ϳ��� ������ �Է� ��������!\n");
			
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			
			System.out.println("�Է��Ͻ� ������ �ٸ� ������ �޾� �ջ� �մϴ�");
			System.out.println("�ϳ��� ������ �� �Է� ���ּ���");
			
			int input1 = scan.nextInt();
			
			System.out.println("ù��° �Է� �Ͻ� ���� = "+input + "\n�ι�° �Է� �Ͻ� ���� = "+input1 + "\n���� ����? = " + input+input1);
			System.out.printf("%d + %d = %d\n", input, input1, input+input1);
			System.out.println(input+input1);
		}
	}