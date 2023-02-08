public class Myword {
    public static void main(String[] args) {
        vehicle prawit = new vehicle(2, "Kubota", "E-Som");
        boat prareena = new boat(5 , "Admiral", "Admiral_Kuznetsov", 10000);
        bike prayut1 = new bike( 1, "Nissan", "Nissan GTR35", 50, 100);
        prawit.move();
        prawit.stop();
        prareena.move();
        prareena.stop();
        prareena.sail();
        prayut1.move();
        prayut1.stop();
        prayut1.ride();
    }
}
