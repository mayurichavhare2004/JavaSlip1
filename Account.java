package Slip3;


	import java.util.Arrays; 
	import java.util.Comparator; 
	class Account { 
	    int accno; 
	    String accname; 
	    double balance; 
	    public Account(int accno, String accname, double balance) { 
	        this.accno = accno; 
	        this.accname = accname; 
	        this.balance = balance;} 
	    public String toString() { 
	        return "Account Number: " + accno + ", Account Name: " + accname + ", Balance: " + balance;}} 
	public class Main { 
	    public static void sortAccount(Account[] accounts) { 
	        Arrays.sort(accounts, Comparator.comparingDouble(a -> a.balance));} 
	    public static void main(String[] args) { 
	        Account[] accounts = new Account[3]; 
	        accounts[0] = new Account(1, "Shreyas", 5000.0); 
	        accounts[1] = new Account(2, "Viraj", 3000.0); 
	        accounts[2] = new Account(3, "Niraj", 4000.0); 
	        sortAccount(accounts); 
	        for (Account account : accounts) { 
	            System.out.println(account);}}}


