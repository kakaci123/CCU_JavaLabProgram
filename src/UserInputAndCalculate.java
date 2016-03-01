
/*
 * 這是程式是import java.util.Scanner，提供給使用者自行輸入資料，並加以運算
 * 此範例為計算BMI體重(身高^2/體重)，另外此部分加入例外處理的概念，同學可以自行測試若輸入非數值的狀況
 * 例外處理將在下次的Lab課時稍微說名給各位理解
 * 
 * [input]姓名、身高(以公分作為輸入，由程式轉換為公尺再進行運算)、體重(以公斤作為輸入)
 * [output]見下範例
 * 
 * ========BMI 計算範例=========
 * 請輸入您的姓名      : ChenWei
 * 請輸入您的身高      : 171.1   公分
 * 請輸入您的體重      : 51      公斤
 * ========開始執行運算=========
 * Hello, ChenWei!
 * 您所輸入的身高為 : 171.1   公分
 * 您所輸入的體重為 : 51      公斤
 * 您的BMI值為             :
 * ========  運算結束     =========
 * */

import java.util.Scanner;//this is IMPORTANT!!

public class UserInputAndCalculate {
	public static void main(String[] args) {
		// build the object
		Scanner cin = new Scanner(System.in);

		// Declare Variables
		double Height, Weight;
		String UserName;

		System.out.println("========BMI 計算範例=========");
		// String Input
		try {
			System.out.print("請輸入您的姓名\t: ");
			UserName = cin.nextLine();

			// Double Input
			System.out.print("請輸入您的身高\t: ");
			Height = cin.nextDouble();
			System.out.print("請輸入您的體重\t: ");
			Weight = cin.nextDouble();
			System.out.println("========開始執行運算=========");

			System.out.println("Hello, " + UserName + " !");
			System.out.println("您所輸入的身高為 \t: " + Height+"\t公分");
			System.out.println("您所輸入的體重為 \t: " + Weight+"\t公斤");
			System.out.printf("您的BMI值為\t: %.2f\n",(Weight/((Height/100)*(Height/100))));

		} catch (Exception e) {
			System.out.println("輸入資料有誤，請重新執行並確認");
			System.exit(0);
		}

		System.out.println("========  運算結束     =========");
	}
}
