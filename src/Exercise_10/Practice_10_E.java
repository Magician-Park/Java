package Exercise_10;
	public class Practice_10_E {
		public static void main(String arg[]) {
// 			5-4. 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
			int arr[][] = {
					{5, 5, 5, 5, 5},
					{10, 10, 10, 10, 10},
					{20, 20, 20, 20, 20},
					{30, 30, 30, 30, 30},
			};
			
			int total = 0;
			float average = 0;
			
			for(int i=0; i < arr.length; i++) {
				for(int j=0; j < arr[i].length; i++) {
					total += arr[i][j];
				}
			}
			// 평균 구하기
			/*									*/				
			System.out.println("total="+total);
			System.out.println("average="+average);
		}
}
