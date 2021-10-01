package model;

import dao.AccountDAO;

public class RegisterLogic {
	public boolean execute(Account account) {
		AccountDAO dao = new AccountDAO();
		boolean isRegister = dao.register(account);
		return isRegister;
	}
}
