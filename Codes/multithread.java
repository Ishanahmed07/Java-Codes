import java.util.Scanner;

class Account {
    private int balance = 6000;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}

class Customer implements Runnable {
    Scanner sc = new Scanner(System.in);
    private Account account;

    Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 4; i++) {
            int amt = 2000;
            if (amt < account.getBalance()) {
                makeWithdrawal(amt);
            } else if (account.getBalance() < 0) {
                System.out.println("\nOverdrawn");
            }
        }
    }

    void makeWithdrawal(int withdrawAmount) {
        if (account.getBalance() >= withdrawAmount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw $" + withdrawAmount);
            try {
                System.out.println("Wait.....");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
            account.withdraw(withdrawAmount);
            System.out.println();
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal of $" + withdrawAmount);
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw 2000.");
        }
    }
}

public class multithread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        Customer accountHolder = new Customer(account);
        Thread t1 = new Thread(accountHolder);
        System.out.println();
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        System.out.println("\tCash Withdraw!!!");
        System.out.println("::::::::::::::::::::::::::::::::::::::::");
        System.out.print("\nEnter Your Name : ");
        t1.setName(sc.nextLine());
        Thread t2 = new Thread(accountHolder);
        System.out.print("Enter Your Name : ");
        t2.setName(sc.nextLine());
        System.out.println();

        t1.start();
        t2.start();
        sc.close();
    }
}