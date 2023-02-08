public class Main {
    public static void main(String[] args) {
        airplane NokAir = new airplane(" NokAir",629);
        NokAir.takeOff();
        NokAir.speedUp(20);
        NokAir.landing();
        NokAir.speedDown(50);
        passengerAirplane JetPlane = new passengerAirplane(" X-59",833f);
        JetPlane.takeOff();
        JetPlane.speedUp(70);
        JetPlane.landing();
        JetPlane.speedDown(90);
        fighterAirplane F16 = new fighterAirplane(" General Dynamics F-16 Fighting Falcon F- 16", 4220);
        F16.takeOff();
        F16.speedUp(90);
        F16.landing();
        F16.shoot();
        F16.speedDown(50);
        F16.dropTheBomb();
        F16.eject();
    }
}
