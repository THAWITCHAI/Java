public class vehicle{
    private int color;
    private String brand;
    private String name;
    //
    public vehicle (int color,String brand,String name) {
        this.color = color;
        this.brand = brand;
        this.name = name;

    }
    //
    public void move() {
        System.out.println("------------------------------------------");
        System.out.println("Name:"+name+" Brand:"+brand+" Color:"+color+"  Go Forward");
        System.out.println("------------------------------------------");
        
    }
    //
    public void stop() {
        System.out.println("------------------------------------------");
        System.out.println("Name:"+name+" Brand:"+brand+" Color:"+color+" Stop");
        System.out.println("------------------------------------------");
    }
}
//
class bike extends vehicle{
    int wheel;
    int seat;
    //
    public bike(int color,String brand,String name, int seat, int wheel){
        super(color, brand, name);
        this.wheel = wheel;
        this.seat = seat;
    }
    //
    public void ride() {
        System.out.println("----------------------------");
        System.out.println(">> Prayut <<");
        System.out.println("----------------------------");
    }
}
//
class boat extends vehicle{
     int seat;
     //
    public boat(int color,String brand,String name, int seat){
        super(color, brand, name);
        this.seat = seat;
    }
    //
    public void sail() {
        System.out.println("----------------------------");
        System.out.println(">> Sail Forward 3000 km/h <<");
        System.out.println("----------------------------");
    }
}
