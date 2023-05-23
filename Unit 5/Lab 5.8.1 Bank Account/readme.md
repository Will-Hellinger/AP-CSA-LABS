# 5.8.1 Bank Account
## <b>Write a class named Account that will describe a checking account for a customer of a bank.</b>
- - -
### <b>The class should meet the following specifications:</b>

* Include the following private instance variables:
  * first – a String that represents the first name of the account holder.
  * last – a String that represents the last name of the account holder.
  * acctNum – an int for the account number.
  * balance – a double that stores the current balance in the account.
  * num - Also include a static variable called num which is used to generate sequential account numbers. It’s initial value is set to 99, and each time a constructor is called this value is incremented and the result is assigned as the new account number. The code to accomplish this is provided in the default constructor.
* There should be three constructors.
  * The default no argument constructor should set both name fields to an empty string. The account number is assigned as the next value in the sequence based on the static variable `num`. Leave the balance as the default value.
  * The second constructor should have a formal parameter for first, last and balance. The account number is assigned in the same way as shown in the default constructor. <b>You are required to name the formal parameters first, last, and balance</b>. Use the keyword `this` to ensure the correct values are assigned to the instance variables.
  * The third constructor should have one formal parameter for an Account object. This constructor makes a duplicate account EXCEPT for the account number. The account number is assigned in the same way as shown in the default constructor.
* Implement accessor and mutator methods for both the first and last fields. <b>The formal parameters for the mutator methods must be the same names as the instance variables.</b>
* Implement accessor methods for the acctNum and balance fields.
Add a void deposit method that will add the designated amount to the account.
* Include a withdrawal method that returns a boolean value that will subtract the designated amount from the account. This method should complete the withdrawal and return true if there is enough money in the account to cover the withdrawal. The method should not withdraw any funds and return false if the account would become overdrawn with this transaction. (i.e. You can’t take out more money than you have in the account.)
* Write a toString method for the class that will print the information for an Account object as shown in the sample output below. <b>Within the toString method you must declare a local String variable named temp and use that variable to build and then return the appropriate String value.</b> You must also use the correct escape sequence to add the line breaks to the output.
```
//This is the driver class for this lab
import java.util.Scanner;
public class Driver
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("NEW ACCOUNT:");
        Account acct1 = new Account();
        acct1.setFirst("James");
        acct1.setLast("Bossert");
        acct1.deposit(155.25);
        System.out.println(acct1);
        System.out.print("Enter withdrawal amount for " + acct1.getFirst() + " " + acct1.getLast() + ": ");
        double wd = kb.nextDouble();
        if(!acct1.withdrawal(wd))
            System.out.println(acct1.getFirst() + " has insufficient funds for this withdrawal.");
        else
          System.out.println(acct1.getFirst() + " now has a balance of: " + acct1.getBalance());
        System.out.println(acct1);
        System.out.println();
        System.out.println("NEW ACCOUNT:");
        Account acct2 = new Account("Sara","Sanchez",60.00);
        System.out.println(acct2);
        acct2.deposit(20.00);
        System.out.println(acct2);
        System.out.print("Enter withdrawal amount for " + acct2.getFirst() + " " + acct2.getLast() + ": ");
        wd = kb.nextDouble();
        if(!acct2.withdrawal(wd))
            System.out.println(acct2.getFirst() + " has insufficient funds for this withdrawal.");
        else
          System.out.println(acct2.getFirst() + " now has a balance of: " + acct2.getBalance());
        System.out.println(acct2);

        System.out.println();
        System.out.println("NEW ACCOUNT:");
        Account acct3 = new Account(acct2);
        System.out.println(acct3);
        acct3.setLast("Wilson");
        acct3.deposit(15.00);
        System.out.println(acct3);
        
        System.out.println();
        System.out.println("NEW ACCOUNT:");
                System.out.print("Enter customer first name: ");
        String first = kb.next();
        System.out.print("Enter customer last name: ");
        String last = kb.next();
        System.out.print("Enter initial deposit amount: ");
        double deposit = kb.nextDouble();
        Account acct4 = new Account(first, last, deposit);
        System.out.println();
        System.out.println("The name of this customer is: " + acct4.getFirst() + " " + acct4.getLast());
        System.out.println("The account number is: " + acct4.getAcctNum());
        System.out.println("The current balance in the account is: " + acct4.getBalance());
        System.out.println();
        System.out.println("List of all customers:");
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
        System.out.println(acct4);
    }
}
```

## <b>Compile and Run your program.</b>
### <b>Your output should match exactly the output shown here.</b>
```
NEW ACCOUNT:
Customer Name: James Bossert
Account #: 100
Current Balance: 155.25

Enter withdrawal amount for James Bossert: 55.25
James now has a balance of: 100.0
Customer Name: James Bossert
Account #: 100
Current Balance: 100.0


NEW ACCOUNT:
Customer Name: Sara Sanchez
Account #: 101
Current Balance: 60.0

Customer Name: Sara Sanchez
Account #: 101
Current Balance: 80.0

Enter withdrawal amount for Sara Sanchez: 85
Sara has insufficient funds for this withdrawal.
Customer Name: Sara Sanchez
Account #: 101
Current Balance: 80.0


NEW ACCOUNT:
Customer Name: Sara Sanchez
Account #: 102
Current Balance: 80.0

Customer Name: Sara Wilson
Account #: 102
Current Balance: 95.0


NEW ACCOUNT:
Enter customer first name: Olivia
Enter customer last name: Rodrigo
Enter initial deposit amount: 564.23

The name of this customer is: Olivia Rodrigo
The account number is: 103
The current balance in the account is: 564.23

List of all customers:
Customer Name: James Bossert
Account #: 100
Current Balance: 100.0

Customer Name: Sara Sanchez
Account #: 101
Current Balance: 80.0

Customer Name: Sara Wilson
Account #: 102
Current Balance: 95.0

Customer Name: Olivia Rodrigo
Account #: 103
Current Balance: 564.23
```