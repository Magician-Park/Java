package Exercise_10;
	public class Practice_10_D {
		public static void main(String arg[]) {
			int arr[] = { 10, 20, 30, 40, 50 };
			int sum = 0;
			
			for(int i=0; i < arr.length; i++) {		// <= ��
				sum += arr[i];						// <= ��
			}
			
			System.out.println("sum="+sum);
		}
}
