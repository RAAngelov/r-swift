package Homework_5;

public class Bank {
	private final int maxAccountNumber = 5;
	private static int accountCount = 0;
	private double assets;
	private Account[] accounts;

	public Bank() {
		accounts = new Account[maxAccountNumber];
	}

	public boolean openAccount(String username, String password, String name, String govId) {
		if (accountCount == maxAccountNumber) {
			return false;
		}
		Credentials credentials = new Credentials(username, password);
		Account account = new Account(name, govId, username, password);
		accounts[accountCount++] = account;
		return true;
	}

	public boolean closeAccount(String username, String password) {
		int accountIdx = findAccountIdx(username);
		if (!accounts[accountIdx].hasAccess(password)) {
			return false;
		}
		assets -= accounts[accountIdx].getBalance();
		accountCount--;
		accounts[accountIdx] = accounts[accountCount];
		return true;
	}

	public boolean deposit(String username, double amount) {
		int accountIdx = findAccountIdx(username);
		if (amount < 0)
			return false;
		assets += amount;
		accounts[accountIdx].deposit(amount);
		return true;
	}

	public boolean withdraw(String username, String password, double amount) {
		int accountIdx = findAccountIdx(username);
		if (!accounts[accountIdx].hasAccess(password)) {
			return false;
		}
		if (amount < 0)
			return false;
		if (amount > accounts[accountIdx].getBalance())
			return false;
		assets -= amount;
		accounts[accountIdx].withdraw(amount);
		return true;
	}

	public boolean transfer(String username, String password, double amount, String recipientUsername) {
		int accountIdx = findAccountIdx(username);
		int recipientAccountIdx = findAccountIdx(recipientUsername);
		if (!accounts[accountIdx].hasAccess(password)) {
			return false;
		}
		if (amount < 0)
			return false;
		if (amount > accounts[accountIdx].getBalance())
			return false;
		accounts[accountIdx].withdraw(amount);
		accounts[recipientAccountIdx].deposit(amount);
		return true;
	}

	public void printBankAccounts() {
		for (int i = 0; i < accountCount; i++) {
			System.out.printf("%s, %s, %.2f%n", accounts[i].getName(), accounts[i].getGovId(),
					accounts[i].getBalance());

		}

	}

	private int findAccountIdx(String username) {
		for (int i = 0; i < accountCount; i++) {
			if (accounts[i].getUsername().equalsIgnoreCase(username)) {
				return i;
			}
		}
		System.out.println("Account not found.");
		return -1;
	}

	public double getAssets() {
		return assets;
	}
}
