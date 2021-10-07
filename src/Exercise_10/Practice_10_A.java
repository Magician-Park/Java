package Exercise_10;

import java.util.*;

public class Practice_10_A {
	public static void main (String arg[]) {
		int a[] = new int [5];
		double f = 0f;	// 0이나 0f나 상관 X (6번째 짜리까지 만들어주는 거)
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i =0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		f = (double)sum/a.length;
		System.out.println(sum);
		System.out.println(f);
	}
}
