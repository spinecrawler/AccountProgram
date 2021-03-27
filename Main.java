import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Welcome to JSG Bank");
        System.out.print("Please enter your first name: ");
        Scanner input = new Scanner(System.in);                    //Scanner
        String fName = input.next();
        System.out.print("Last name: ");
        String lName = input.next();
        System.out.println("Thank you! Your current account information is displayed below.\n");

        //Generating acctNum
        Random num = new Random();
        int acctNum = num.nextInt(1000);
        //Generating current balance
        double currentBalance = Math.random() * 1000;  // creates a double up to 1000
        double previousBalance = currentBalance;

        //Creation of Account object
        Account person = new Account(fName, lName, acctNum, currentBalance, previousBalance);

        //display current account information

        person.displayInfo();


        //main process
        int selection = 0;
        int count = 0;


        while(selection !=4){
            //-----------------Prompting features----------------------------
            if(count == 0){
                System.out.println("\nWhat would you like to do today?");
            }
            else {
                System.out.println("\n\nIs there anything I can do for you?");
            }
//---------------------------------Display menu---------------------------
            System.out.println("\nMENU" + "\n1.Display current account information" + "\n2.Deposit" +
                    "\n3.Withdraw" + "\n4.Exit");

            //Make selections

            System.out.print("Make selection: ");
                           //saved for use in display for
                                                                    // deposit and withdraw calls
             selection = input.nextInt();
            if(selection == 1){
                //display current balance
                person.displayInfo();
            }
            else if(selection == 2){
                                                      //deposit call
                System.out.print("Deposit amount(Integer): ");

                int depositAmount = input.nextInt();
                person.deposit(depositAmount);
                person.displayPCBalance();
            }
            else if(selection == 3){
                                                     //withdraw call
                System.out.print("Withdraw amount(Integer): ");
                int withAmount = input.nextInt();
                person.withdraw(withAmount);
                person.displayPCBalance();

            }
            else if(selection == 4){
                System.out.println("Have a nice day!");
            }

            count++;

        }



    }
}
