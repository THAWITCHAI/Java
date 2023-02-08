import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        int y,x;
        Scanner Input = new Scanner(System.in);
        System.out.print("Y:>> ");
        y = Input.nextInt();
        System.out.print("X:>> ");
        x = Input.nextInt();
        // หาพื้นที่สี่เหลี่ยม
        int ans1 = x*y;
        System.out.println("area square >> "+ans1);
        //หาพื้ที่รอบสี่เหลี่ยม
        int ans2 = (x+y)*2;
        System.out.println("area around the square >> "+ans2);
    }
}