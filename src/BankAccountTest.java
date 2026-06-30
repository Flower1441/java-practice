public class BankAccountTest {
    public static void main(String[] args){
          BankAccount testAccount = new BankAccount(1000);
          testAccount.deposit(500);
          System.out.println(testAccount.getBalance());
          testAccount.withdraw(200);
          System.out.println(testAccount.getBalance());
          testAccount.withdraw(2000);
          System.out.println(testAccount.getBalance());
    }
}
