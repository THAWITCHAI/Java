import java.util.Scanner;

public class helloword{
    public static void main(String[] args) {
        System.out.print("Enter Number>> ");
            Scanner read = new Scanner(System.in);
            int[] score = {read.nextInt()};
            System.out.println(">> "+score);
    }
}