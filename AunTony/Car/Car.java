public class Car{
    private String NameCar;
    private String ColorCar;
    private int TurBro;
    private Float Boots;

    public Car(String NameCar, String ColorCar, int TurBro, Float Boots){
        this.NameCar = NameCar;
        this.ColorCar = ColorCar;
        this.TurBro = TurBro;
        this.Boots = Boots;
    }
    public void DataCar() {
        System.out.println("Name Car >> "+NameCar+"\nColor is >> "+ColorCar+"\nTurBro >> "+TurBro+" %"+"\nBoots >> "+Boots+" %");
    }
}

class plane extends Car{
    private String fly;
    public plane(String NameCar, String ColorCar, int TurBro, Float Boots){
        super(NameCar, ColorCar, TurBro, Boots);
    }
    @Override
    public void DataCar() {
        // TODO Auto-generated method stub
        super.DataCar();
        System.out.println("I'm Fly!!");
    }
    
}
class main{
    public static void main(String[] args) {
        Car driv1 = new Car("Audi", "Red", 50, 20.1f);
        plane driv2 = new plane("F15", "Blue", 300, 100.00f);
        driv1.DataCar();
        System.out.println("----------------------------------");
        driv2.DataCar();
    }
}