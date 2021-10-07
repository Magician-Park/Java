package Exercise_9;
	public class Practice_9_G {
		public static void main (String arg[]) {
			/*	
			4-8. Math.random()을 이용해서 1부터 6사이의 임의의 정수를 
			변수 value에 저장하는 코드를 완성하라.
		 	*/
			int value = (int)(Math.random() * 6) + 1;
			/* 
			1. 각 변에 6을 곱한다.
			0.0 * 6 <= Math.random() * 6 < 1.0 * 6
			    0.0 <= Math.random() * 6 < 6.0
			    
			2. 각 변을 int형으로 변환한다.
			(int)0.0 <= (int)(Math.random() * 6) < (int)6.0
				   0 <= (int)(Math.random() * 6  < 6.0
			지금까지는 0과 6사이의 정수 중 하나를 가질 수 있다. 0은 포함되고
			6은 포함되지 않는다.
				   
			3. 각 변에 1을 더한다.
			0 + 1 <= (int)(Math.random() * 6) + 1 < 6 + 1
				1 <= (int)(Math.random() * 6) + 1 < 7
			지금은 1과 7사이의 정수 중 하나를 얻을 수 있다. 단, 1은
			범위에 포함되고 7은 포함되지 않는다.
			*/
			System.out.println("value:"+value);
		}
}
