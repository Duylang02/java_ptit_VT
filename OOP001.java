public class OOP001{
    public static void main(String[] args){
        BankAccount savings = new BankAccount("Jimmy");
        savings.deposit(10.00);
        savings.deposit(50.00);
        savings.deposit(10.00);
        savings.deposit(70.00);
        
        savings.transactionFee(5.00);
        savings.transactionFee(10.00);
        
    }
}
class BankAccount{
    private String id;
    private double balance;
    private int transaction;
    
    public BankAccount(String id){
        this.id = id;
        this.balance = 0;
        this.transaction = 0;
    }
    
    public double getBalance(){
        return this.balance;
    }
    public String getID(){
        return this.id;
    }
    public int getTransactions()
    {
        return this.transaction;
    }
    
    public void deposit(double amount){
        if (amount >= 0 && amount <= 500){
            this.transaction +=1;
            this.balance += amount;
        }
    }
    
    public void withdraw(double amount){
        if (this.balance - amount > 0)
        {
            this.balance = this.balance - amount;
        }
    }
    
    public void transactionFee(double amount){
        double fee = 0;
        fee = (this.transaction * (2*amount + amount*(this.transaction-1)))/2;
        this.balance = this.balance -  fee;
        System.out.println(this.balance >= 0);
    }
}