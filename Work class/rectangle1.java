import java.util.Scanner;
public class rectangle1 {
    int y;
    int x;
    public void area() {
        int ans1 = x*y;
        System.out.println("area square >> "+ans1);
    }

    public void around() {
        int ans2 = (x+y)*2;
        System.out.println("area around the square >> "+ans2);
    } 

    public void input() {
        Scanner Input = new Scanner(System.in);
        System.out.print("Y:>> ");
        y = Input.nextInt();
        System.out.print("X:>> ");
        x = Input.nextInt();
    }

    public void rectangle1() {
        System.out.println("=============================");
    }
}