package Exercise_10;

import java.util.*;

public class Practice_10_A {
	public static void main (String arg[]) {
		int a[] = new int [5];
		double f = 0f;	// 0�̳� 0f�� ��� X (6��° ¥������ ������ִ� ��)
		
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
