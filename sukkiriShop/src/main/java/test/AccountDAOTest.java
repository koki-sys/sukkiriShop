package test;

import dao.AccountDAO;
import model.Account;
import model.Login;

public class AccountDAOTest {
	public static void main(String[] args) {
		testFindAll();
		testPasswordMismatch();
		testRegister();
	}
	public static void testFindAll() {
		Login login = new Login("minato", "1234");
		AccountDAO dao = new AccountDAO();
		Account result = dao.findAll(login);

		if(result != null &&
			result.getUserId().equals("minato") &&
			result.getPass().equals("1234") &&
			result.getMail().equals("minato@sukkiri.com") &&
			result.getName().equals("湊　雄輔") &&
			result.getAge() == 23) {
			System.out.println("testFindAll:成功しました。");
		} else {
			System.out.println("testFindAll:失敗しました。");
		}
	}

	public static void testPasswordMismatch() {
		Login login = new Login("minato", "12345");
		AccountDAO dao = new AccountDAO();
		Account result = dao.findAll(login);
		if(result == null) {
			System.out.println("testPasswordMismatch:パスワードが違います。");
		} else {
			System.out.println("testPasswordMismatch:パスワードが一致しています。");
		}
	}

	public static void testRegister() {
		Account account = new Account("takahashi", "1223", "example@s.com", "たかはし", 23);
		AccountDAO dao = new AccountDAO();
		boolean canRegister = dao.register(account);
		if(canRegister) {
			System.out.println("testRegister:成功しました。");
		} else {
			System.out.println("testRegister:失敗しました。");
		}
	}
}
