package Exercise_6_to_8;
	
	import java.util.*;
	
	public class Practice_8_F {
		public static void main (String arg[]) {
			System.out.println("�����Ϸ��� 1 ~ 9 �� �ƹ� ���ڳ� �����ּ���.");
			
			Scanner z = new Scanner(System.in);
			int y = z.nextInt();
			
			while (y <= 9) {
			System.out.println("�p���� �����Ͻǰ��� ����ֽʽÿ�.");
			System.out.printf("1. �����ﰢ��(��������)\n2. �������ﰢ��\n3. �Ƕ�̵�\n4. ���Ƕ�̵�\n");
			System.out.printf("5. �Ƕ�̵��� ������\n6. ������ ������\n7. �����ﰢ��(����������)\n");
			
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();
			
				switch (a) {
				case 1:
					System.out.println("�p�ٱ��� ����Ͻðڽ��ϱ�?");
					Scanner sc = new Scanner(System.in);
					int b = sc.nextInt();
					for(int i = 0; i < b; i++) {
						for(int j = 0; j <= i; j++) {
						// �������ﰢ��(����) ���
							System.out.printf("*");
						}
							System.out.println();
					}
					continue;
				case 2:
					System.out.println("�p�ٱ��� ����Ͻðڽ��ϱ�?");
					Scanner sca = new Scanner(System.in);
					int c = sca.nextInt();
					for(int i = 0; i < c; i++) {
						for(int j = 0; j < c-i; j++) {
						// �������ﰢ�� ���
							System.out.printf("*");
						}
							System.out.println();
					}
					continue;
				case 3:
					System.out.println("�p�ٱ��� ����Ͻðڽ��ϱ�?");
					Scanner scan = new Scanner(System.in);
					int d = scan.nextInt();
					for(int i = 0; i < d; i++) {
						// �Ƕ�̵� ���
						for(int j=1; j < d-i; j++) {
							System.out.printf(" ");
						}
						for(int a1 = 0; a1 < i*2+1; a1++) {
							System.out.printf("*");
						}
						
						System.out.println();
					}
					continue;
				case 4:
					System.out.println("�p�ٱ��� ����Ͻðڽ��ϱ�?");
					Scanner scann = new Scanner(System.in);
					int e = scann.nextInt();
					for(int i = e; i > 0; i--) {
						// ���Ƕ�̵� ���
						for(int j = e-i; j > 0; j--) {
							System.out.printf(" ");
						}
						for(int b1 = i*2-1; b1 > 0; b1--) {
							System.out.printf("*");
						}
						
						System.out.println();
					}
					continue;
				case 5:
					System.out.println("�p�ٱ��� ����Ͻðڽ��ϱ�?");
					Scanner scanne = new Scanner(System.in);
					int f = scanne.nextInt();
					// �Ƕ�̵� �� ������ ���
					for(int i = 1; i <= f; i++) {
						for(int j = 0; j < f-i; j++) {
							System.out.print(" ");
						}
						for(int k = 0; k < (2*i)-1; k++) {
							System.out.print("*");
						}
						System.out.println();
					}
					for(int i = f-1; i > 0; i--) {
						for(int j = 1; j < (f +1)-i; j++) {
							System.out.print(" ");
						}
						for(int k=0;k<(2*i)-1;k++) {
							System.out.print("*");
						}
						System.out.println();
					}
					continue;
				case 6:
					System.out.println("�p�ٱ��� ����Ͻðڽ��ϱ�?");
					Scanner scanner = new Scanner(System.in);
					int g = scanner.nextInt();
					// ���� + ������ ���
					for(int i=0;i<g;i++) {
						for(int j=0; j<g; j++)
						{
							if (i<=g/2) // ���� ����
							{
								if (i+j<=g/2-1) // ���� �� �������
									System.out.print(" ");
								else if (j-i>=g/2+1) // ������ �� �������
									System.out.print(" ");
								else
									System.out.print("*"); // ���� ������ * ���
							}
							else if(i>g/2) // �Ʒ��� ����
							{
								if (i-j>=g/2+1) // ���� �� ����
									System.out.print(" ");
								else if (i+j>=g/2*3+1) // ������ �� ����
									System.out.print(" ");
								else
									System.out.print("*"); // ���� ������ * ���
							}
						}
						System.out.println(); // �ٹٲ�
					}
					continue;
				case 7:
					System.out.println("�p�ٱ��� ����Ͻðڽ��ϱ�?");
					Scanner scanners = new Scanner(System.in);
					int h = scanners.nextInt();
					for(int i = 1; i <= h; i++) { // �������ﰢ��(������) ���
						for(int j = h; j > 0; j--) {
							if(j > i) {
								System.out.print(" ");
							}
							else {
								System.out.print("*");
							}
						}
						System.out.println();
					}
					continue;
				}
				System.out.println("�߸� �Է��ϼ̽��ϴ�. 1 ~ 6���� �߿��� ������ �ֽʽÿ�.");
			}
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
}
