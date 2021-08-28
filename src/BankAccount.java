import java.sql.SQLOutput;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;


    public int getAccountNumber(){
        return this.accountNumber;
    }

    public int getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return  this.email;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance){
        this.balance=balance;
    }

    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public int depositFunds(){
        int incrementedFund = getBalance();
        return incrementedFund++;
    }

    public int withdrawFunds(int amountForWidthdraw){
        int balanceAfterWidthdraw = getBalance()-amountForWidthdraw;
        if (amountForWidthdraw>getBalance()) {
            System.out.println("Widthdraw can NOT be performed");
            return -1;
        }
        System.out.println("Widthdraw can was be performed");
        return balanceAfterWidthdraw;
    }
}
