package Exercise_9;
	public class Practice_9_F {
		public static void main (String arg[]) {
//			4-7. ����
			String str = "12345";
			int sum = 0;
			
			for(int i = 0; i < str.length(); i++) {
				sum += str.charAt(i) - '0';		// ��
			}
			
			System.out.println("sum="+sum);
		}
}