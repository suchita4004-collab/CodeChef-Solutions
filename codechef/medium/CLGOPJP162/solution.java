import java.util.Scanner;

class BankAccount {
    public static int totalBalance;
    

    public BankAccount(int balance) {
        totalBalance= totalBalance + balance;
    }
}


class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = scanner.nextInt();
        BankAccount account1 = new BankAccount(amount);

        amount = scanner.nextInt();
        BankAccount account2 = new BankAccount(amount);

        System.out.println(BankAccount.totalBalance);

        scanner.close();
    }
}
