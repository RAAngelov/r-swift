package Homework_5;

public class Account {
	private String name;
	private String govid;
	private double balance;
	private Credentials crds;
	Account(String name,String govld,String username,String password){
		this.name = name;
		this.govid = govld;
		this.balance = 0.0;
		this.crds = new Credentials(username,password);
	}
	public void deposit(double amount){
		balance += amount;
	}
	public void withdraw(double amount){
		balance -= amount;
	}
	public double getBalance(){
		return balance;
	}
	boolean hasAccess(String password){
		return crds.passValidation(password);
	}
	public String getUsername(){
		return crds.getUsername();
	}
	public String getName(){
		return name;
	}
	public String getGovId(){
		return govid;
	}
	
	
	
	
}
