package Part_04_Introduction_To_OOP.part_04_02_yourFirstBankTransfer;

public class yourFirstBankTransfer{
    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthewsAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0.0);
        
        matthewsAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}