import java.util.Scanner;

class select {

    DataEmployee data = new DataEmployee();
    private int count;

    public void menu() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("-------------- CHOICE SELECT --------------");
            System.out.println("-------------------------------------------");
            System.out.println("1.INPUT DATA");
            System.out.println("2.DELETE DATA");
            System.out.println("3.SHOW DATA");
            System.out.println("4.EXIT PROGRAM!");
            System.out.println("-------------------------------------------");
            System.out.println("-------------------------------------------");
            System.out.print("SELECT >> ");
            count = input.nextInt();
            System.out.println("");
            switch (count) {
                case 1:
                    System.out.println("--------------------");
                    System.out.println("---- INPUT DATA ----");
                    System.out.println("--------------------");
                    data.PushData();
                    System.out.println("--------------------");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("---------------------");
                    System.out.println("---- DELETE DATA ----");
                    System.out.println("---------------------");
                    data.PopData();
                    System.out.println("---------------------");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("-------------------");
                    System.out.println("---- SHOW DATA ----");
                    System.out.println("-------------------");
                    data.ShowData();
                    System.out.println("-------------------");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("-----------------------");
                    System.out.println("---- EXIT PROGRAME ----");
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
        } while (count != 4);
    }
}
