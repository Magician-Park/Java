package Exercise_9;
	public class Practice_9_G {
		public static void main (String arg[]) {
			/*	
			4-8. Math.random()�� �̿��ؼ� 1���� 6������ ������ ������ 
			���� value�� �����ϴ� �ڵ带 �ϼ��϶�.
		 	*/
			int value = (int)(Math.random() * 6) + 1;
			/* 
			1. �� ���� 6�� ���Ѵ�.
			0.0 * 6 <= Math.random() * 6 < 1.0 * 6
			    0.0 <= Math.random() * 6 < 6.0
			    
			2. �� ���� int������ ��ȯ�Ѵ�.
			(int)0.0 <= (int)(Math.random() * 6) < (int)6.0
				   0 <= (int)(Math.random() * 6  < 6.0
			���ݱ����� 0�� 6������ ���� �� �ϳ��� ���� �� �ִ�. 0�� ���Եǰ�
			6�� ���Ե��� �ʴ´�.
				   
			3. �� ���� 1�� ���Ѵ�.
			0 + 1 <= (int)(Math.random() * 6) + 1 < 6 + 1
				1 <= (int)(Math.random() * 6) + 1 < 7
			������ 1�� 7������ ���� �� �ϳ��� ���� �� �ִ�. ��, 1��
			������ ���Եǰ� 7�� ���Ե��� �ʴ´�.
			*/
			System.out.println("value:"+value);
		}
}
