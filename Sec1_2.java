package sec1_2;
public class Sec1_2 
{
    public static void main(String[] args) 
    {
    account a1 = new account();
    a1.setId(11);
    a1.setBalance(2222);
    a1.setAnnualInterestRate(0.045);
    a1.withdrow(33);
    a1.deposit(444);
    System.out.println("The balance = "+ a1.getBalance());
    System.out.println("The Monthly interest  = "+ a1.getMonthlyInterestRate());
    System.out.println("The Date When this Account Was Created is " +a1.getDateCreated());

    }
    
}
