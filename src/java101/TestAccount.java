package java101;
import java101.Account;
public class TestAccount {
	public static void main(String[] args){
	Account a = new Account("abc",1,1);	
	Transaction t = new Transaction("dd", 1);
	a.addTransaction(t);
	}
}
