public class TwoInterface {
    public static void main(String[] args) {
        Data data = new Data();
        data.AgeOne();
        data.AgeTwo();
        data.Age();
    }
}

interface OneName{
    String NameOne = "Thawitchai";
    void AgeOne();
}
interface TwoName{
    String NameTwo = "Boonsong";
    void AgeTwo();
}
interface ThreeName extends OneName, TwoName{
    String NameThree = "GTR";
    void Age();
}
// -------- test ---------

interface test1{
    void name();
}
abstract class test2{
    public void name(){
        System.out.println("test>>>");
    }
}

class test3 extends test2 implements test1{
    
}
// -------- test ---------

class Data implements ThreeName{
    @Override
    public void AgeOne() {
        System.out.println(NameOne);
        
    }

    @Override
    public void AgeTwo() {
        System.out.println(NameTwo);
    }

    @Override
    public void Age() {
        System.out.println(NameThree);

    }
}