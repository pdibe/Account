package PS3;

import java.util.*;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	public Account(int i, double b){
		this.id = i;
		this.balance = b;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}
	public void setid(int i){
		this.id = i;
	}
	public int getid(){
		return(id);
	}
	public void setBalance(double b){
		this.balance = b;
	}
	public double getBalance(){
		return(balance);
	}
	public void setAnnualInterestRate(double air){
		this.annualInterestRate = air;
	}
	public double getAnnualInterestRate(){
		return(annualInterestRate);
	}
	public Date getDateCreated(){
		return(dateCreated);
	}
	public double getMonthlyInterestRate(){
		return(annualInterestRate/12);
	}
	public void withdraw(double amount)throws InsufficientFundsException{
		if (amount<=balance){
			balance -= amount;
		}
		else{
			double difference = amount - balance;
			throw new InsufficientFundsException(difference);
		}
		
	}
	public void deposit(double amount){
		balance += amount;
	}
	}