import java.util.Scanner;

public class choice {
    public void select(){
        int choice;
        System.out.println("SELECT");
        System.out.println("1.COOK");
        System.out.println("2.DOCTOR");
        System.out.println("3.THEACHER");
        System.out.println("4.PILOT");
        System.out.println("5.EXIT PROGRAME!");
        Scanner input = new Scanner(System.in);
        System.out.print("CHOICE >> ");
        choice = input.nextInt();
        System.out.println(" ");
        switch (choice) {
            case 1:
                System.out.println("--------------------");
                System.out.println("---- COOK ----");
                System.out.println("--------------------");
                cook select = new cook();
                select.Emloyee();
                System.out.println("--------------------");
                System.out.println("");
                break;
            case 2:
                System.out.println("---------------------");
                System.out.println("---- DOCTOR ----");
                System.out.println("---------------------");
                
                System.out.println("---------------------");
                System.out.println("");
                break;
            case 3:
                System.out.println("-------------------");
                System.out.println("---- THEACHER ----");
                System.out.println("-------------------");

                System.out.println("-------------------");
                System.out.println("");
                break;
            case 4:
                System.out.println("-----------------------");
                System.out.println("---- PILOT ----");
                System.out.println("-----------------------");
                System.out.println("");
                break;
            case 5:
                System.out.println("-----------------------");
                System.out.println("---- EXIT CHOICE ----");
                System.out.println("-----------------------");
                System.out.println("");
                break;
            default:
                System.out.println("---------------------");
                System.out.println("---- 1-4! ----");
                System.out.println("---------------------");
                System.out.println("");
                break;
        }
    }
}
