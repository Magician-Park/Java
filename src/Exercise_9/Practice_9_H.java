package Exercise_9;
	public class Practice_9_H {
		public static void main (String arg[]) {
			int num = 12345;
			int sum = 0;
			
			while (num > 0) {
				sum += num%10;	// sum = sum + num%10
				num /= 10;
				// �� 10�� �Ǵ� ����: 2�� 5�� ������ 12345 �϶� 5�� ���������
			}
			
			System.out.println("sum="+sum);
		}
}
