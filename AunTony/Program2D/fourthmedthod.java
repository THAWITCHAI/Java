class Grandparent{
    public void callmedthodof(){
        System.out.println("Call MedThod of Grandparent Class");
    }
}

class parent extends Grandparent{
    @Override
    public void callmedthodof() {
        System.out.println("Call Medthod of Parent Class");
    }
}

class number{
    public void number(){
        int[] a={15,8,23,6,4};
        for(int x:a){
            System.out.println(">> "+x);
        }
    }
}

public class fourthmedthod {
    public static void main(String[] args) {
        Grandparent[] object = {new Grandparent(),new parent(), new Grandparent(), new parent()};
        for(Grandparent obj:object){
            obj.callmedthodof();
        }
        number a = new number();
        a.number();
    }
}
