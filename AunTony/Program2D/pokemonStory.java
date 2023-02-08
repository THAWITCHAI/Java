public class pokemonStory {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu("Electric", 5000, 10000, 80);
        pikachu.setEggDistance("Not Egg");
        System.out.println(pikachu);
        pikachu.evolution();
        pikachu.sprcialAttacks();
    }
}

interface pokemoninterface{
    void evolution();
    void sprcialAttacks();
}

abstract class Pokemon{
    protected String Type;
    protected int hit;
    protected int attack;
    protected int defense;
}

class Pikachu extends Pokemon implements pokemoninterface{
    private String eggDistance;

    public Pikachu(String Type, int hit, int attack, int defense){
        this.Type = Type;
        this.hit = hit;
        this.attack = attack;
        this.defense = defense;
    }
    @Override
    public void evolution() {
        System.out.println("- Evolution: 50 Pikachu Candy");
    }
    @Override
    public void sprcialAttacks() {
        System.out.println("- SpecialAttacks: Discharge/"+
                             "Thunderbolt/Wile Charge");        
    }
    @Override
    public String toString() {
        return String.format("Pikachu: \n- Type: %s\n- Hit: %d\n- Attacks: %d\n- Defense: %d\n"+
                            "- Egg Distance: %s",Type,hit,attack,defense,eggDistance);
    }
    public void setEggDistance(String eggDistance){
        this.eggDistance = eggDistance;
    }
}