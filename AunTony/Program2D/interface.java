interface Myinterface{
    int CONST = 6;
    void MethodOne();
}
class Anoter implements Myinterface{
    @Override
    public void MethodOne() {
        System.out.println("thawitchai");
    }
}