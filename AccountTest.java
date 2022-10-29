import java.util.Scanner;

public class AccountTest
{
public static void main(String[] args)
{ 
    try (Scanner input = new Scanner(System.in)) {
        Account ac1 = new Account(null, 0);
        System.out.printf("Initial name is: %s%n%n",ac1.getName() );

        ac1.getName();

        System.out.println("Please enter the name:");

        String theName = input.nextLine();

        ac1.setName(theName);
        
        System.out.println(); 

        System.out.printf("Name in ac1 is:%n%s%n",ac1.getName());
    }
    } 
 } 