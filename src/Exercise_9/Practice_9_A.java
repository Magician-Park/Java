package Exercise_9;
	public class Practice_9_A {
		public static void main(String arg[]) {
			// 4-2. 1~20������ ���� �� 2 �Ǵ� 3�� ����� �ƴ� ���� �� ���� ���ض�.
			int sum = 0;
			
			for(int i = 1; i <=20; i++) {
				if(i%2!=0 && i%3!=0)
					sum += i;
				
			}
			
			System.out.println("sum= "+sum);
		}	// main
}