package Exercise_10;
	public class Practice_10_E {
		public static void main(String arg[]) {
// 			5-4. 2���� �迭 arr�� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷��� �ϼ��Ͻÿ�.
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
			// ��� ���ϱ�
			/*									*/				
			System.out.println("total="+total);
			System.out.println("average="+average);
		}
}
