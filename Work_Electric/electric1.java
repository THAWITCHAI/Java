import java.util.Scanner;

public class electric1 {
    public static void main(String[] args) {
        int electric_bill;
        // float price;
        Scanner read = new Scanner(System.in);
        System.out.print("Electric >> ");
        electric_bill = read.nextInt(); //input
        if(electric_bill<=150){
            float price;
            //1
            if(electric_bill<=15&&electric_bill>0){
                price = electric_bill*2.3488f; //เก็บค่าไว้ใน price
                electric_bill = 0;
                // System.out.println("price[1]"+price);
                // System.out.println("electric[1]"+electric_bill);
            }else{
                electric_bill = electric_bill-15; //ลบค่าไฟออก15หน่วย แล้วไว้electric_bill
                price = (15*2.3488f);
                // System.out.println("price[1]"+price);
                // System.out.println("electric[1]"+electric_bill);
            }
            //2
            if(electric_bill<=25){
                price = electric_bill*2.9882f; //เก็บค่าไว้ใน price
                electric_bill = 0;
                // System.out.println("price[2]"+price);
                // System.out.println("electric[2]"+electric_bill);
            }else{
                electric_bill = electric_bill-10; //ลบค่าไฟออก15หน่วย แล้วไว้electric_bill
                price = 10*2.9882f;
                // System.out.println("price[2]"+price);
                // System.out.println("electric[2]"+electric_bill);
            }
            //3
            if(electric_bill<=35){
                price = electric_bill*3.2405f; //เก็บค่าไว้ใน price
                electric_bill = 0;
                // System.out.println("price[3]"+price);
                // System.out.println("electric[3]"+electric_bill);
            }else{
                electric_bill = electric_bill-10; //ลบค่าไฟออก15หน่วย แล้วไว้electric_bill
                price = 10*3.2405f;
                // System.out.println("price[3]"+price);
                // System.out.println("electric[3]"+electric_bill);
            }
            //4
            if(electric_bill<=100){
                price = electric_bill*3.2405f; //เก็บค่าไว้ใน price
                electric_bill = 0;
                // System.out.println("price[4]"+price);
                // System.out.println("electric[4]"+electric_bill);
            }else{
                electric_bill = electric_bill-65; //ลบค่าไฟออก15หน่วย แล้วไว้electric_bill
                price = 65*3.2405f;
                // System.out.println("price[4]"+price);
                // System.out.println("electric[4]"+electric_bill);
            }
            //5
            if(electric_bill<=150){
                price = electric_bill*3.7171f; //เก็บค่าไว้ใน price
                electric_bill = 0;
                // System.out.println("price[5]"+price);
                // System.out.println("electric[5]"+electric_bill);
            }else{
                electric_bill = electric_bill-50; //ลบค่าไฟออก15หน่วย แล้วไว้electric_bill
                price = 50*3.71715f;
                // System.out.println("price[5]"+price);
                // System.out.println("electric[5]"+electric_bill);
            }
            //6
            if(electric_bill<=400){
                price = electric_bill*4.2218f; //เก็บค่าไว้ใน price
                electric_bill = 0;
                // System.out.println("price[6]"+price);
                // System.out.println("electric[6]"+electric_bill);
            }else{
                electric_bill = electric_bill-250; //ลบค่าไฟออก15หน่วย แล้วไว้electric_bill
                price = 250*4.2218f;
                // System.out.println("price[6]"+price);
                // System.out.println("electric[6]"+electric_bill);
            }
            //7
            if(electric_bill>400){
                price = electric_bill*4.4217f;
                // System.out.println("price[7]"+price);
                // System.out.println("electric[7]"+electric_bill);
            }
        }
    }
}
