package Exercise_6_to_8;
	
	import java.util.*;
	
	public class Practice_8_D {
		public static void main (String arg[]) {
			System.out.println("�p�ٱ��� ����Ͻðڽ��ϱ�?");
			
			Scanner scanne = new Scanner(System.in);
			int f = scanne.nextInt();
			// �Ƕ�̵� �� ������ ���
			for(int i=1; i <= f;i++) {
				for(int j=0; j<f-i;j++) {
					System.out.print(" ");
				}
				for(int k=0;k<(2*i)-1;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=f-1;i>0;i--) {
				for(int j=1;j<(f+1)-i;j++) {
					System.out.print(" ");
				}
				for(int k=0;k<(2*i)-1;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
