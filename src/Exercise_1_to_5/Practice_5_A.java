package Exercise_1_to_5;
	
	import java.util.*;

	public class Practice_5_A {
		public static void main (String arg[]) {
			System.out.printf("����Ǯ�̸� �����մϴ�.\n�κз��� ���ڸ� �Է� �Ͻʽÿ�.\n");
			
			Scanner scan = new Scanner(System.in);
			String input1 = scan.nextLine();
			String input2 = scan.nextLine();
			System.out.println(input1.equalsIgnoreCase(input2));
			System.out.println(input1.equals(input2));
		}
}
