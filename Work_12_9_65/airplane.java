public class airplane{
    public airplane(String name,float maxspeed){
        name(name);
        maxSpeed(maxspeed);
    }
    //
    private void name(String name){
        System.out.println("----------------------------------------");
        System.out.println("Name Plane is>>"+name);
    }
    //
    private void maxSpeed(float maxspeed){
        System.out.println("MaxSpeed is>> "+maxspeed+"Km/h");
    }
    //
    public void speedUp(float speedUp) {
        System.out.println("SpeedUping >> "+speedUp+"%");
    }
    //
    public void speedDown(float speedDown) {
        System.out.println("SpeedDowning >> "+speedDown+"%");
    }
    //
    public void takeOff() {
        System.out.println("plane flying into the sky");
    }
    //
    public void landing(){
        System.out.println("plane landing on the ground");
    }
}
//
class passengerAirplane extends airplane{
    public  passengerAirplane(String name,float maxspeed){
        super(name, maxspeed);
        seats();
        
    }
    //
    private void seats(){
        System.out.println("There are 8 seats");
    }
}
//
class fighterAirplane extends airplane{
    public  fighterAirplane(String name,float maxspeed){
        super(name, maxspeed);
        
    }

    public void shoot(){
        System.out.println(">> Shoot..Uranina!");
    }
    public void dropTheBomb(){
        System.out.println(">> Drop the Bomb Tank!");
    }
    public void eject(){
        System.out.println(">> General Dynamics F-16 Fighting Falcon F- 16 Ejected From Ammunition");
        System.out.println(">> Finish");
        System.out.println("----------------------------------------");
        System.out.println("---------- Thawitchai Boonsong ---------");
        System.out.println("----------------------------------------");
    }
    
}

