import java.util.Random;
public class ArmourSpawner implements ArmourFactory{

    protected Armour armour;
    public Armour spawnArmour() {
        Random rand = new Random();
        int gearSlot = rand.nextInt(3);
        if (gearSlot == 0) {
            armour = new Helmet();
        } else if (gearSlot == 1) {
            armour = new ChestPlate();
        }else if (gearSlot == 2){
            armour =  new Ring();
        }
        return armour;
    }
}