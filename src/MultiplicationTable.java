import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int col;
		System.out.print("請輸入n,印出n x n的乘法表=");
		try {
			col = cin.nextInt();
			for (int i = 1; i <= col; i++) {
				System.out.print("\t" + i);
				if (i == col) {
					System.out.println();
				}
			}
			for (int i = 1; i <= col; i++) {
				sb.append(i).append("\t");
				for (int j = 1; j <= col; j++) {
					sb.append(i * j);
					if (j != col) {
						sb.append("\t");
					}
				}
				sb.append("\n");
			}
			System.out.print(sb.toString());
		} catch (Exception e) {
			System.out.println("噢! 出現問題囉!");
			System.exit(0);
		}
		cin.close();
	}
}
