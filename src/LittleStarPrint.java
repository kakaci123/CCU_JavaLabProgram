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
		System.out.println("===== Hello! 大家準備好了嗎?=====");
		System.out.print("今天你想印哪種星星呢 1)正方形 2)第一種三角形 3)第二種三角形=");
		while (true) {
			try {
				UserChoice = cin.nextInt();
				if (UserChoice > 0 && UserChoice <= 3) {
					System.out.println("太棒了! 那我們開始吧!");
					break;
				} else {
					System.out.print("再輸入一次好嗎? 1)正方形 2)第一種三角形 3)第二種三角形=");
				}
			} catch (Exception e) {
				System.out.println("噢! 你輸入錯誤了,請重新執行!");
				System.exit(0);
			}
		}
		try {
			switch (UserChoice) {
			case 1:
				System.out.print("你想要產生 n x n 的正方形呢?");
				SquareStar(cin.nextInt());
				break;
			case 2:
				System.out.print("你想要產生幾行的三角形呢?");
				TriangleOne(cin.nextInt());
				break;
			case 3:
				System.out.print("你想要產生幾行的三角形呢?");
				TriangleTwo(cin.nextInt());
			}
		} catch (Exception e) {
			System.out.println("噢! 你輸入錯誤了,請重新執行!");
			System.exit(0);
		}
	}
}
