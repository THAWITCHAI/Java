import java.util.ArrayList;

public class secondArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add(2);
        arrayList.add("thawitchai");
        arrayList.add(new simpleObject());
        for(Object obj:arrayList){
            System.out.println(obj);
        }
    }
}

class simpleObject{
    @Override
    public String toString() {
        return String.format("Fuck You");
    }
}
