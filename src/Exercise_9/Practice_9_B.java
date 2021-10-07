package Exercise_9;
	public class Practice_9_B {
		public static void main (String arg[]) {
// 			4-3. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 값을 구해라.
			int sum = 0;
			int totalSum = 0;
			
			for(int i=1; i <=10; i++) {
				sum += i;
				totalSum += sum;
			}
			
			
			System.out.println("totalSum= "+totalSum);
		}	// main
}
