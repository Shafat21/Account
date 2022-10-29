public class AccountNew
{
        private String name;
        private double balance;
        
        public AccountNew(String name, double balance)
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
        
}