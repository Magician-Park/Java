package Exercise_6_to_8;

	import java.util.*;

	public class Practice_6 {
		public static void main (String arg[]) {
			
			int charge = 0;
			int bin = 0;
			int a, b, c, d = 0;
			
			Scanner scan = new Scanner (System.in);
			
			System.out.println("�Ž������� �� ��� �ɱ��??");
			System.out.println("���� > 500 �p�� / 100 �p�� / 50 �p�� / 10 �p��");
			
			charge = scan.nextInt();
			a = charge / 500;
			bin = charge % 500;
			b = bin / 100;
			bin = bin % 100;
			c = bin / 50;
			bin = bin % 50;
			d = bin / 10;
			bin = bin % 10;
			
			System.out.printf("500���� : "+a+"��\n100���� : "+b+"��\n50���� : "+c+"��\n10���� : "+d);
			
		}
}