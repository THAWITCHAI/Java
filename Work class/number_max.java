import java.util.Scanner;

public class number_max {
    public static void main(String[] args) {
        int max=0, n=0;
        char count ='y';
        Scanner input = new Scanner(System.in);
        while (count == 'y'||count=='Y') {
            System.out.println("-------------------------");
            System.out.print("Enter Number Pleass >>");
            n = input.nextInt();
            System.out.println("-------------------------");
            if(n>max){
                max = n;
            }
            do {
                System.out.println("-------------------------------");
                System.out.print("You want next number Y or N >>");
                count = input.next().charAt(0);
                System.out.println("-------------------------------");
            } while (count!='y'&&count!='n'&&count!='Y'&&count!='N');
        }
        System.out.println("-------------------------------");
        System.out.println("Max Number is >> "+max);
        System.out.println("-------------------------------");
        int array[]={2,5,7,8,6,4,10,5,88};
        for(int i=0; array[i]!='\0';i++){
            System.out.print("-----------[Index "+i);
            System.out.println("]------------");
            System.out.println(">>"+array[i]);
        }
    }
}
