public class Account {
    private String fName;
    private String lName;
    private int acctNum = 0;
    private double currentBalance = 0;
    private double previousBalance = 0;

    //getters
    public Account(){
        this("default First Name", "default Last Name", 0, 0, 0); // default values
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public Account(String fName, String lName, int acctNum, double currentBalance, double previousBalance){    //full constructor
    this.fName = fName;
    this.lName = lName;
    this.acctNum = acctNum;
    this.currentBalance = currentBalance;
    this.previousBalance = previousBalance;
    previousBalance = currentBalance;


        }

        //------------------------------METHODS------------------------------------

    //Display Methods


    public void displayInfo(){
        printLines();
        System.out.printf("\nCURRENT ACCOUNT INFORMATION\n" + "Name: " + this.fName + " " +  this.lName + "\nAccount number: " + this.acctNum +
                "\nCurrent balance: %.2f\n", this.currentBalance);
        printLines();


    }

    public void displayPCBalance(){

        printLines();
        System.out.printf("\nACCOUNT BALANCES");
        System.out.printf("\nPrevious Balance: %.2f", this.previousBalance);
        System.out.printf("\nCurrent Balance: %.2f\n", this.currentBalance);
        printLines();
    }



    //deposit
   public void deposit(int depAmt){
        this.currentBalance += depAmt;
   }
    //withdraw
    public void withdraw(int wAmt){
        if(this.currentBalance > wAmt){
        this.currentBalance -= wAmt;
        }
        else{
            System.out.println("Insufficient funds. Transaction not processed.");
        }
    }
    public static void printLines() {
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
        }


    }
    }
