package Exercise_6_to_8;

import java.util.Scanner;

public class Practice_8_E {
		public static void main (String arg[]) {
			System.out.println("�p�ٱ��� ����Ͻðڽ��ϱ�?");
			
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			// ���� + ������ ���
			for(int i=0;i<a;i++) {
				for(int j=0; j<a; j++)
				{
					if (i<=a/2) // ���� ����
					{
						if (i+j<=a/2-1) // ���� �� �������
							System.out.print(" ");
						else if (j-i>=a/2+1) // ������ �� �������
							System.out.print(" ");
						else
							System.out.print("*"); // ���� ������ * ���
					}
					else if(i>a/2) // �Ʒ��� ����
					{
						if (i-j>=a/2+1) // ���� �� ����
							System.out.print(" ");
						else if (i+j>=a/2*3+1) // ������ �� ����
							System.out.print(" ");
						else
							System.out.print("*"); // * ���
					}
				}
				System.out.println(); // �ٹٲ�
			}
		}
}
