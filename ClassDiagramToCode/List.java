public class List {
    private String name;
    private int qty;

    public void pust(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }

    public void show() {
        System.out.println(name);
        System.out.println(qty);
    }
}
