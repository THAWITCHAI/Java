public class pokemon {
    String name;
    int armor;
    int hitPoint;
    int hp;
    int count_Actack=0;

    public void acttack(){
        System.out.println(name+":Ah Ah Ah!!");
        // System.out.println(hp);
        count_Actack++;
        if (count_Actack == 3) {
            System.out.println("Spacial attack!!");
            count_Actack = 0;
        }
        
    }

    public void defenf(){
        System.out.println("Jebjung!!!");
    }
}