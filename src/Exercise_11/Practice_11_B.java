package Exercise_11;
	public class Practice_11_B {
		public static void main (String arg[]) {
			people P = new people();
			P.A();
			P.B();
			System.out.println("³²Àº hp ="+P.hp);
		}
}
	class people {
		int a = 50;
		int b = 100;
		int hp = 1000;
		void A() {
			hp -= a;
		}
		void B() {
			hp -= b;
		}
	}
