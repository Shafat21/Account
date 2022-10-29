import java.util.Scanner;

public class AccountTest1 {
    public static void main(String[] args)
    {
        Account ac1 = new Account("Jane Green",50.00);
        Account ac2 = new Account("John Blue",-7.53);

        System.out.printf("%s balance :%.2f%n",
            ac1.getName(),ac1.getBalance());

        System.out.printf("%s balance :%.2f%n",
            ac2.getName(),ac2.getBalance());

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter deposit amount for AC1: ");
            double amount = input.nextDouble();
            System.out.printf("%nadding %.2f to AC1 balance%n%n",amount);
            ac1.deposit(amount);

            System.out.printf("%s balance: $%.2f%n",
                ac1.getName(),ac1.getBalance());

            System.out.printf("%s balance: $%.2f%n",
                ac2.getName(),ac2.getBalance());

            System.out.print("Enter deposit amoun t for AC2: ");
            amount = input.nextDouble();
            System.out.printf("%nadding %.2f to AC2 balance%n%n",
                amount);
            ac2.deposit(amount);
        }

        System.out.printf("%s balance: $%.2f%n",
        ac1.getName(),ac1.getBalance());

        System.out.printf("%s balance: $%.2f%n",
        ac2.getName(),ac2.getBalance());
        
    }    
}