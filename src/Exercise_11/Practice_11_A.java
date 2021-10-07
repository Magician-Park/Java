package Exercise_11;
	
import java.awt.Color.*;

	public class Practice_11_A {
		public static void main(String arg[]) {
			Tv t = new Tv();
			t.channelDown();
			System.out.println(t.channel);
			t.channelUp();
			System.out.println(t.channel);
			t.power();
			System.out.println(t.power);
		}
}

	class Tv {
		int channel = 70;
		boolean power = true;
		int bool;
		
		void channelUp() {
			++ channel;
		}
		void channelDown() {
			-- channel;
			
		void power() { power = !power; }
		}
	}
