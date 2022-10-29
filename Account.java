public class Account {
    private String name;
    private String accountno;
    private double balance;

    public Account(String name, double balance)
    {
        this.name = name;
        
        if(balance > 0.0)
            this.balance = balance;
    }
    
    public void deposit(double amount){
            if( amount >0.0)
                balance = balance + amount;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    public void setAccountNo(String accountno)
    {
        this.accountno = accountno;
    }
    
    public String getAccountNo()
    {
        return accountno;
    }
    
    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }
    
    public void deposite(double amount)
    {
        this.balance = this.balance + amount;
    }
    
    public void withDraw(double amount)
    {
        this.balance = this.balance - amount;
    }
    public void Display()
    {

    }

}