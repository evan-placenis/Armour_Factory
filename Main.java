import java.util.Random;
import java.util.Scanner;
public class Main {



    public static void main (String[] args){
        //String play;
        Scanner myScanner = new Scanner (System.in);

//        System.out.println("Are you sure you want to start this game? Enter yes, or no");
//        play = myScanner.nextLine();

        while(true){
            String ArmourDescription;
            Enemy e = new Enemy();
            String enemy = e.getEnemy();
            if(enemy.equals("Minion")){
                System.out.println("Defeated a minion");
            } else if (enemy.equals("Elite")){
                System.out.println("Defeated an Elite");
            } else if (enemy.equals("Boss")){
                System.out.println("Defeated a Boss, Good loot is coming");
            }

            //spawn rarity
            Rarity currentRarity;
            RarityFactory raritySpawner = new RaritySpawner();
            currentRarity = raritySpawner.spawnRarity(enemy);

            //Spawn armour
            Armour currentArmour;
            ArmourFactory armourSpawner = new ArmourSpawner();
            currentArmour = armourSpawner.spawnArmour();

            //Wrap armour in attributes depending on rarity of armour
            ArmourDecorator armour = new ArmourDecorator(currentArmour);
            armour.wrapArmour(currentArmour,currentRarity);

            System.out.println(armour.getDescription());

            System.out.println("Do you want to continue? Enter yes, or no");
            String play = myScanner.nextLine();
            if(play.equals("no")){
                break;
            }
            ArmourDescription = "";
        }






    }
}

