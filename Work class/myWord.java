public class myWord {
    public static void main(String[] args) {
        pokemon mon1 = new pokemon();
        pokemon mon2 = new pokemon();

        mon1.hp = 999999;
        mon2.hp = 90;
        mon1.name = "pikaju";
        mon2.name = "snorlack";
        /*mon1.armor = 100;
        mon1.hitPoint = 10000;*/
        mon1.acttack();
        mon2.acttack();
        mon1.acttack();
        mon1.acttack();
        mon1.acttack();
    }
}