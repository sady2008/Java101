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
	private Date createdDate; //���ײ���������
	private String operation; //���׵Ĳ���
	private double money;     //����Ǯ��
	public Transaction(String opertaion, double money) {
	createdDate = new Date();
	this.operation = opertaion;
	this.money = money;
	}
}