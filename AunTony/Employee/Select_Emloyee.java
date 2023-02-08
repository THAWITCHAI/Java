import java.util.Scanner;

public class Select_Emloyee  {
     int size = 5,top=0;
    Scanner input = new Scanner(System.in);
     String[] name = new String[size];
     int[] age = new int[size];
     int[] id = new int[13];
     String[] position = new String[size];
     int[] salary = new int[size];

    public void Emloyee(){
        if(top!=size){
            System.out.print("NAME >> ");
            name[top] = input.next();
            System.out.print("AGE. >> ");
            age[top] = input.nextInt();
            System.out.print("ID EMPLOYEE >> ");
            id[top] = input.nextInt();
            System.out.print("POSITION >> ");
            position[top] = input.next();
            System.out.print("SALARY >> ");  
            salary[top] = input.nextInt();
            top++;
        }else{
            System.out.println("FULL DATA!");
        }
        
        
    }
    public void show_Data(){
        if(top!=0){
            for(int i=0; i<top; i++){
                System.out.printf("NAME[%d] IS >> %s\n",i,name[i]);
                System.out.printf("AGE.[%d] IS >> %d\n",i,age[i]);
                System.out.printf("ID EMPLOYEE[%d] IS >> %d\n",i,id[i]);
                System.out.printf("POSITION[%d] IS >> %s\n",i,position[i]);
                System.out.printf("SALARY[%d] IS >> %d\n",i,salary[i]);
            }
        }else{
            System.out.println("DATA EMTRY!!");
        }
    }
}

class cook extends Select_Emloyee{
    // private int size = 5,top= 0;
     String[] food = new String[size];
    @Override
    public void Emloyee() {
        super.Emloyee();
        if(top!=size){
            System.out.print("FOOD >> ");
            food[top] = input.next();
            top++;
        }else{
            System.out.println("FULL!");
        }
    }
    @Override
    public void show_Data() {
        // TODO Auto-generated method stub
        super.show_Data();
        if(top!=0){
            for(int i=0; i<top; i++){
                System.out.printf("FOOD[%d] IS >> %s\n",i,food[i]);
            }
        }else{
            System.out.println("FOOD EMTRY!!");
        }
    }
}

// class maina{
//     public static void main(String[] args) {
//         cook test = new cook();
//         test.Emloyee();
//         test.show_Data();
//     }
// }