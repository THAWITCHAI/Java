import java.util.Scanner;

public class odd_number {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter Number >> ");
        int number = read.nextInt();
        int mod;
        mod = number%2;
        if(mod==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
}
