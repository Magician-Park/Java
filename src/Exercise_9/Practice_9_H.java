package Exercise_9;
	public class Practice_9_H {
		public static void main (String arg[]) {
			int num = 12345;
			int sum = 0;
			
			while (num > 0) {
				sum += num%10;	// sum = sum + num%10
				num /= 10;
				// 꼭 10만 되는 이유: 2나 5로 나누면 12345 일때 5도 나뉘어버림
			}
			
			System.out.println("sum="+sum);
		}
}
