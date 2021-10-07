package Exercise_10;
	
import java.util.*;

	public class Practice_10_B {
		public static void main(String arg[]) {
			// Scanner를 이용한 최대값과 최솟값 출력
			int s[] = new int[5];
			int min = s[0];
			int max = s[0];

			Scanner sc = new Scanner(System.in);
			for(int i = 0; i < s.length; i++) {
				s[i] = sc.nextInt();
				min = s[0];
				if(min > s[i]) {
					min = s[i];
				}
				else if(s[i] > max) {
					max = s[i];
				}
			}
			System.out.println(min);
			System.out.println(max);
		}
}
