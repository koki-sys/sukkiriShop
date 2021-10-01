package test;

import model.Account;
import model.RegisterLogic;

public class RegisterLogicTest {
	public static void main(String[] args) {
		testRegister();
	}

	public static void testRegister() {
		Account account = new Account("takaha", "1223", "example@s.com", "たかはし", 23);
		RegisterLogic bo = new RegisterLogic();
		boolean result = bo.execute(account);
		if(result) {
			System.out.println("testRegister:成功しました。");
		} else {
			System.out.println("testRegister:失敗しました。");
		}
	}
}
