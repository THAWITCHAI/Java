public class Funtion {
    public static void main(String[] args) {
        System.out.print(">>");
        power(2,3);
        // saySomething("Hay Hay Hay",5);
    }

    public void saySomething(String massage) {
        System.out.println(massage);
    }

    public static void power(int n, int p) {
        int ans=1;
        for(int i = 0; i < p ;i++){
            ans = ans*n;
        }
        System.out.println(n);
    }

    public static void peple(){

    }


}