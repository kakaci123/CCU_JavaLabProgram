
/*
 * �o�O�{���Oimport java.util.Scanner�A���ѵ��ϥΪ̦ۦ��J��ơA�å[�H�B��
 * ���d�Ҭ��p��BMI�魫(����^2/�魫)�A�t�~�������[�J�ҥ~�B�z�������A�P�ǥi�H�ۦ���խY��J�D�ƭȪ����p
 * �ҥ~�B�z�N�b�U����Lab�Үɵy�L���W���U��z��
 * 
 * [input]�m�W�B����(�H�����@����J�A�ѵ{���ഫ�����ئA�i��B��)�B�魫(�H����@����J)
 * [output]���U�d��
 * 
 * ========BMI �p��d��=========
 * �п�J�z���m�W      : ChenWei
 * �п�J�z������      : 171.1   ����
 * �п�J�z���魫      : 51      ����
 * ========�}�l����B��=========
 * Hello, ChenWei!
 * �z�ҿ�J�������� : 171.1   ����
 * �z�ҿ�J���魫�� : 51      ����
 * �z��BMI�Ȭ�             :
 * ========  �B�⵲��     =========
 * */

import java.util.Scanner;//this is IMPORTANT!!

public class UserInputAndCalculate {
	public static void main(String[] args) {
		// build the object
		Scanner cin = new Scanner(System.in);

		// Declare Variables
		double Height, Weight;
		String UserName;

		System.out.println("========BMI �p��d��=========");
		// String Input
		try {
			System.out.print("�п�J�z���m�W\t: ");
			UserName = cin.nextLine();

			// Double Input
			System.out.print("�п�J�z������\t: ");
			Height = cin.nextDouble();
			System.out.print("�п�J�z���魫\t: ");
			Weight = cin.nextDouble();
			System.out.println("========�}�l����B��=========");

			System.out.println("Hello, " + UserName + " !");
			System.out.println("�z�ҿ�J�������� \t: " + Height+"\t����");
			System.out.println("�z�ҿ�J���魫�� \t: " + Weight+"\t����");
			System.out.printf("�z��BMI�Ȭ�\t: %.2f\n",(Weight/((Height/100)*(Height/100))));

		} catch (Exception e) {
			System.out.println("��J��Ʀ��~�A�Э��s����ýT�{");
			System.exit(0);
		}

		System.out.println("========  �B�⵲��     =========");
	}
}
