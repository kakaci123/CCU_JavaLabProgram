package bank;

public class BankTester {

	public static void main(String[] args) {
		Bank studentBank = new Bank();

		// �򥻴���
		studentBank.addAccount(1001, 0);
		studentBank.deposit(1001, 500);
		studentBank.deposit(1001, 300);
		studentBank.deposit(1001, 50);
		studentBank.withdraw(1001, 500);
		studentBank.withdraw(1001, 350);
		studentBank.closeAccount(1001);

		studentBank.addAccount(1002, 0);
		studentBank.deposit(1002, 2500);
		studentBank.deposit(1002, 1500);
		studentBank.withdraw(1002, 2000);
		studentBank.withdraw(1002, 500);
		studentBank.deposit(1002, 4000);
		studentBank.suspendAccount(1002);

		studentBank.addAccount(1003, 0);
		studentBank.deposit(1003, 1000);
		studentBank.deposit(1003, 100);
		studentBank.withdraw(1003, 250);
		studentBank.deposit(1003, 750);
		studentBank.withdraw(1003, 1600);
		studentBank.closeAccount(1003);

		// �}�߱b���@���s�ڧY�����A�᭱���ʧ@�N����q�L
		studentBank.addAccount(1004, 0);
		studentBank.deposit(1004, 2000);
		studentBank.closeAccount(1004);
		studentBank.deposit(1004, 200);
		studentBank.withdraw(1004, 300);
		studentBank.deposit(1004, 800);
		studentBank.withdraw(1004, 200);

		// �}�߱b���@���s�ڧY�ରSuspended�����g�LreOpen�~��i�����ʧ@
		studentBank.addAccount(1005, 0);
		studentBank.deposit(1005, 2000);
		studentBank.suspendAccount(1005);
		studentBank.deposit(1005, 200);
		studentBank.reOpenAccount(1005);
		studentBank.deposit(1005, 200);
		studentBank.withdraw(1005, 300);
		studentBank.deposit(1005, 800);
		studentBank.withdraw(1005, 200);

		// �Y�l�B����
		studentBank.addAccount(1006, 0);
		studentBank.deposit(1006, 2000);
		studentBank.withdraw(1006, 3000);

		System.out.println(studentBank.summarizeAccountTransacation(1001));
		System.out.println(studentBank.summarizeAccountTransacation(1002));
		System.out.println(studentBank.summarizeAccountTransacation(1003));
		System.out.println(studentBank.summarizeAccountTransacation(1004));
		System.out.println(studentBank.summarizeAccountTransacation(1005));
		System.out.println(studentBank.summarizeAccountTransacation(1006));

		System.out.println(studentBank.summarizeAllAccounts());
	}
}