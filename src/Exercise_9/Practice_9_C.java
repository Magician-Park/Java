package Exercise_9;
	public class Practice_9_C {
		public static void main (String arg[]) {
//			4-4. 1+(-2)+3+(-4)..., ���� 100�̻� �ɶ��� ����?
			int sum = 0;	// ���� ���� ����.
			int b = 1;		// ��ȣ ���� ����.
			int num = 0;	
			
			for (int i = 1; sum < 100; i++, b=-b) {	// 1+(-2)+3+(-4)...
				num = b * i;	// i * ��ȣ ���� b = ���� �� ���ϱ�.
				sum += num;		// sum = sum + num.
			}
			
			System.out.println("num="+num);
			System.out.println("sum="+sum);
		}	// main
}
