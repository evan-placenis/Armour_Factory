public class Rare extends Rarity{
    public Rare(){
        super();
        numOfAttributes = 3;

    }
    public String getDescription(){
        return "Rare ";
    }

    public int getNumOfAttributes(){
        return numOfAttributes;
    }
}
