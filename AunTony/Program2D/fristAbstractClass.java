abstract class GraphicObject {
    protected int x = 0;
    protected int y = 0;

    public abstract double calArea();
    public abstract void draw();

    public String getXY(){
        return String.format("Graphic Object as X: %d , Y: %d",this.x, this.y) ;
    }
}

class circle extends GraphicObject{
    private int radius;
    public circle(int radius, int x, int y){
        this.x = x;
        this.y = y;
        this.radius = radius;
        
    }
    @Override
    public double calArea() {
        return Math.PI * this.radius * this.radius;
    }
    @Override
    public void draw() {
        System.out.println("Draw");
        
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("Information of circle : [radius %d , X: %d , Y: %d]",this.radius,this.x, this.y);
    }
}

public class fristAbstractClass{
    public static void main(String[] args) {
        circle Circle = new circle(15, 2, 87);
        System.out.println(Circle);
        System.out.printf("%f\n",Circle.calArea());
        System.out.println(Circle.getXY());
    }
}