package Exercise_1_to_5;

	import java.util.*;

	public class Exercise_Book3 {
		public static void main (String arg[]) {
			int i = 5;
			System.out.println(++i+" "+i++);
			System.out.println(i);
			System.out.println(++i);
			String str = "¾È³ç";
			Tc t = new Tc();
			t.str(str);
			
			System.out.println(str.equals(t.str));
		}
}
	
	class Tc{
			String str ="¾È³ç";
			
			public void str(String str) {
				this.str = str;
				
				System.out.println("¾È³ç");
			}
		}