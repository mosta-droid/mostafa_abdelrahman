package sec1_2;
import java.util.*;
public class account 
{

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated= new Date();

    public account() 
    {       
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public double getAnnualInterestRate() 
    {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) 
    
    {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() 
    {
        return dateCreated;
    }
    public double getMonthlyInterestRate()
    {
        return (annualInterestRate/12)* balance;
    }
    public void withdrow (double valueWithdrow)
    {
    if(valueWithdrow<=balance)
    {
    balance-=valueWithdrow;
    System.out.print("success");
    }
    else
    System.out.print("Enter a lower amount");
    }
    public void deposit (double valueDeposit)
    {
     balance+=valueDeposit;
    }
}


