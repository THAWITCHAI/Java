import java.util.ArrayList;

public class FristArrayList{
    public static void main(String[] args) {
        ArrayList<String> series = new ArrayList<String>();
        series.add("A");
        series.add("B");
        series.add("C");
        series.add("D");
        series.add("E");
        System.out.println("Size >> "+series.size());
        for (int i = 0; i < series.size(); i++) {
            System.out.println(">> "+series.get(i));
        }
        int index = 3;
        String get = series.get(index);
        series.remove(index);
        System.out.println("Remove index 3 is "+get+" >> "+ series);
        series.remove("A");
        System.out.println(series);
        String a = series.get(1);
        System.out.println(a);
        series.add(1, "AddString");
        System.out.println(series);
        series.set(1, "SetOner");
        System.out.println(series);

    }
}