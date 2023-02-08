public class thirdMethod {
    public static void main(String[] args) {
        summationtwo acc1 = new summationtwo();
        summationone acc2 = new summationone();
        System.out.println("--SommationOne--");
        int num1 = acc2.sum1(15, 13);
        int num2 = acc2.sum2(5, 10, 15);
        System.out.println("Num1 => "+num1);
        System.out.println("Num2 => "+num2);
        System.out.println("--SommationTwo--");
        int num3 = acc1.sum(15,78,9,41,2);
        int num4 = acc1.sum(8,7,6,4);
        System.out.println("Num3 => "+num3);
        System.out.println("Num4 => "+num4);

    }
}

class summationone{
    public int sum1(int a, int b){
        return a+b;
    }

    public int sum2(int a, int b, int c){
        return a+b+c;
    }
}

class summationtwo{
    public int sum(int...values){
        int summ = 0;
        for(int x:values){
            summ +=x;
        }
        return summ;
    }
}