package Exercise_9;
	public class Practice_9_C {
		public static void main (String arg[]) {
//			4-4. 1+(-2)+3+(-4)..., 총합 100이상 될때는 언제?
			int sum = 0;	// 총합 지정 변수.
			int b = 1;		// 부호 변경 변수.
			int num = 0;	
			
			for (int i = 1; sum < 100; i++, b=-b) {	// 1+(-2)+3+(-4)...
				num = b * i;	// i * 부호 설정 b = 총합 값 구하기.
				sum += num;		// sum = sum + num.
			}
			
			System.out.println("num="+num);
			System.out.println("sum="+sum);
		}	// main
}
