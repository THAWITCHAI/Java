public class Polymorphism {
    public static void main(String[] args) {
        Shapeopject[] shape = {new Triangle(15, 18),new Ractangle(12, 5)};
        for(Shapeopject obj:shape){
            System.out.println("The Area of "+obj.getName()+" is "+obj.calAria());
            // System.out.println(obj);
        }
    }
}

abstract class Shapeopject{
    protected String name;
    protected int hight;
    protected int lenght;
    public abstract String getName();
    public abstract double calAria();
}
class Triangle extends Shapeopject{
    public Triangle(int lenght, int hight){
        this.name = "Triangle";
        this.hight = hight;
        this.lenght = lenght;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public double calAria() {
        return 0.5*lenght*hight;
    }
}
class Ractangle extends Shapeopject{
    public Ractangle(int lenght, int hight){
        this.name = "Ractangle";
        this.lenght = lenght;
        this.hight = hight;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public double calAria() {
        return this.hight*this.lenght;
    }
}