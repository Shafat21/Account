public class AccountApp 
{
    public static void main(String[] args)
    {
        Account ac1 = new Account(null, 0);
        ac1.setName("Shafat Alam");
        ac1.setAccountNo("213-134-001");
        ac1.setBalance(1468435);
        System.out.println("Account Holder: " + ac1.getName());
        System.out.println("Account Number: " + ac1.getAccountNo());
        System.out.println("Account Balance: " + ac1.getBalance());
    }

}