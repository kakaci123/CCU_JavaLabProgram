import java.util.Scanner;

public class LittleStarPrint {

	static void SquareStar(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void TriangleOne(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void TriangleTwo(int num) {
		for (int i = num - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		// initial variable
		int UserChoice = -1;
		System.out.println("===== Hello! �j�a�ǳƦn�F��?=====");
		System.out.print("���ѧA�Q�L���جP�P�O 1)����� 2)�Ĥ@�ؤT���� 3)�ĤG�ؤT����=");
		while (true) {
			try {
				UserChoice = cin.nextInt();
				if (UserChoice > 0 && UserChoice <= 3) {
					System.out.println("�ӴΤF! ���ڭ̶}�l�a!");
					break;
				} else {
					System.out.print("�A��J�@���n��? 1)����� 2)�Ĥ@�ؤT���� 3)�ĤG�ؤT����=");
				}
			} catch (Exception e) {
				System.out.println("��! �A��J���~�F,�Э��s����!");
				System.exit(0);
			}
		}
		try {
			switch (UserChoice) {
			case 1:
				System.out.print("�A�Q�n���� n x n ������ΩO?");
				SquareStar(cin.nextInt());
				break;
			case 2:
				System.out.print("�A�Q�n���ʹX�檺�T���ΩO?");
				TriangleOne(cin.nextInt());
				break;
			case 3:
				System.out.print("�A�Q�n���ʹX�檺�T���ΩO?");
				TriangleTwo(cin.nextInt());
			}
		} catch (Exception e) {
			System.out.println("��! �A��J���~�F,�Э��s����!");
			System.exit(0);
		}
	}
}
