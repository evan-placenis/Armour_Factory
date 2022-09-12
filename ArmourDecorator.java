import java.util.Random;
public class ArmourDecorator implements Factory{

    String description;

    public ArmourDecorator(Armour armour) {

            }

    public void wrapArmour(Armour armour, Rarity rarity){
        description = "Slot " + armour.slot + " ";
        description += rarity.getDescription();
        description += armour.getDescription();


        int num = rarity.getNumOfAttributes();
        for(int i = 0; i < num; i++){

            Random rand = new Random();
            int random = rand.nextInt(2);

            if (random == 0) {
                Dexterity dex = new Dexterity(armour);
                description += dex.getDescription();


            } else if (random == 1){
                Strength str = new Strength(armour);
                description += str.getDescription();
            }

        }


    }
    public String getDescription(){
        return description;

    }



//    int num = rarity.getNumOfAttributes();
//        for(int i = 0; i < num; i++){
//        Random rand = new Random();
//        int random = rand.nextInt(10);
//        if (random <= 5) {
//            Dexterity dex = new Dexterity(armour);
//            if(i == 0){
//                System.out.print(armour.getDescription() + dex.getAttribute());
//            }else{
//                System.out.print(dex.getAttribute());
//            }
//
//        } else if (random > 5){
//            Strength str = new Strength(armour);
//            if(i == 0){
//                System.out.print(armour.getDescription() + str.getAttribute());
//            }else{
//                System.out.print(str.getAttribute());
//            }
//        }


    }


