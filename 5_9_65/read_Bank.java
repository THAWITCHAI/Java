import java.util.Scanner;
public class read_Bank {
    public static void main(String[] args) {

        BankAccount acc01 = new BankAccount(001,"thawitchai",5000,"mysecret");
        BankAccount acc02 = new BankAccount(840, "That", 100000, "mysecret");
        acc01.info();
        acc02.info();
    }

    // public static void input() {
    //     Scanner read = new Scanner(System.in);
    //     int id;
    //     float balance;
    //     String owner,signature;
    //     System.out.print("ID: ");
    //     id = read.nextInt();
    //     System.out.print("Owner: ");
    //     owner = read.nextLine();
    //     System.out.print("Balance: ");
    //     balance = read.nextFloat();
    //     System.out.print("Signature: ");
    //     signature = read.nextLine();

    // }
}