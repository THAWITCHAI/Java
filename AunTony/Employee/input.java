import java.util.Scanner;

class input{
    choice choice = new choice();
    private int  choic;
    public void menu(){
        do {
            System.out.println("SELECT");
            System.out.println("1.INPUT DATA EMPOYEE");
            System.out.println("2.DELETE DATA EMPOYEE");
            System.out.println("3.SHOW DATA EMPOYEE");
            System.out.println("4.EXIT PROGRAME!");
            Scanner input = new Scanner(System.in);
            System.out.print("CHOICE >> ");
            choic = input.nextInt();
            System.out.println(" ");
            switch (choic) {
                case 1:
                    System.out.println("-----------------------");
                    System.out.println("------ INPUT DATA ----");
                    System.out.println("--- SELECT EMPLOYEE ---");
                    choice.select();
                    System.out.println("--------------------");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("---------------------");
                    System.out.println("---- DELETE DATA ----");
                    System.out.println("---------------------");
                    
                    System.out.println("---------------------");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("-------------------");
                    System.out.println("---- SHOW DATA ----");
                    System.out.println("-------------------");
                    cook test = new cook();
                    test.show_Data();
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
        } while (choic!=4);
    }
}