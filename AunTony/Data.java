import java.sql.Struct;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

class DataEmployee {
    private int top;
    private int size = 5;
    private String[] data = new String[size];
    Scanner input = new Scanner(System.in);

    public void PushData() {
        if (top != size) {
            System.out.print("INPUT DATA >> ");
            data[top] = input.nextLine();
            top++;
        } else {

            System.out.println("FULL DATA!");

        }
    }

    public void ShowData() {
        if (top == 0) {

            System.out.println("EMTRY DATA!");

        } else {
            for (int i = 0; i < top; i++) {
                System.out.printf("DATA[%d] IS >> %s\n", i, data[i]);
            }
        }
    }

    public void PopData() {
        if (top == 0) {

            System.out.printf("EMTRY DATA!\n");

        } else {
            top--;

            System.out.println("DATA[" + top + "]" + data[top]);

        }
    }
}
