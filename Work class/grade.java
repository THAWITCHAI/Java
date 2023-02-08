// นาย ธวิชชัย บุญส่ง 64122420210
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Score>> ");
        float number = input.nextFloat();
        if (number > 80) {
            System.out.println("Grad A");
        } else if (number >= 75 && number < 80) {
            System.out.println("Grad B+");
        } else if (number >= 70 && number < 75) {
            System.out.println("Grad B");
        } else if (number >= 65 && number < 70) {
            System.out.println("Grad C+");
        } else if (number >= 60 && number < 65) {
            System.out.println("Grad C");
        } else if (number >= 55 && number < 60) {
            System.out.println("Grad D+");
        } else if (number >= 50 && number < 55) {
            System.out.println("Grad D");
        } else {
            System.out.println("Grad F");
        }
    }
}