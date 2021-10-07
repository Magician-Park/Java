package Exercise_6_to_8;

	import java.util.*;

	public class Practice_6 {
		public static void main (String arg[]) {
			
			int charge = 0;
			int bin = 0;
			int a, b, c, d = 0;
			
			Scanner scan = new Scanner (System.in);
			
			System.out.println("거스름돈을 얼마 줘야 될까요??");
			System.out.println("예시 > 500 몆개 / 100 몆개 / 50 몆개 / 10 몆개");
			
			charge = scan.nextInt();
			a = charge / 500;
			bin = charge % 500;
			b = bin / 100;
			bin = bin % 100;
			c = bin / 50;
			bin = bin % 50;
			d = bin / 10;
			bin = bin % 10;
			
			System.out.printf("500원은 : "+a+"개\n100원은 : "+b+"개\n50원은 : "+c+"개\n10원은 : "+d);
			
		}
}