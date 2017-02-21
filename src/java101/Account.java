package java101;
import java.util.Date;
import java.util.ArrayList;

public class Account {
	private String name;
	private double balance;
	private int id;
	private ArrayList<Transaction> transactions=new ArrayList<>(); 
	//Initialization
	
	public Account(String name, double balance, int id){
		this.name=name;
		this.balance=balance;
		this.id=id;
		
	}
	public void addTransaction(Transaction t){
		this.transactions.add(t);
	}

}

class Transaction {
	private Date createdDate; //交易产生的日期
	private String operation; //交易的操作
	private double money;     //交易钱款
	public Transaction(String opertaion, double money) {
	createdDate = new Date();
	this.operation = opertaion;
	this.money = money;
	}
}