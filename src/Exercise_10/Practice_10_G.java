package Exercise_10;
	
import java.util.Scanner;

public class Practice_10_G {
		public static void main (String arg[]) {
			String[] words = { "television", "computer", "mouse", "phone", "encyclopedia", 
							   "thermometer", "government", "abnormal"};
			
			Scanner scanner = new Scanner(System.in);
		
			for(int i = 0; i < words.length; i++) {
				char[] question = words[i].toCharArray();	// String�� char[]�� ��ȯ
				
				for(int j = 0; j < question.length; j++) {
					int d = (int)(Math.random() * question.length);
					char tmp = question[i];
					question[i] = question[d];
					question[d] = tmp;
				}
				
				System.out.printf("Q%d. %s�� ������ �Է��ϼ���.>",
													i + 1, new String(question));
				String answer = scanner.nextLine();
				
				// trim()���� answer�� �¿� ������ ������ ��, equals�� word[i]�� ��
				if (words[i].equals(answer.trim()))
					System.out.printf("�¾ҽ��ϴ�.%n%n");
				else
					System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
		}
	} // main�� �� 
}
