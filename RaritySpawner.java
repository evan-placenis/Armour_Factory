import java.util.Random;
public class RaritySpawner implements RarityFactory{

    public Rarity spawnRarity(String enemy){
        int random = levelOfEnemy(enemy);
        if(random <= 3){
            return new Common();
        } else if (random > 3 && random <=6){
            return new UnCommon();
        }else if (random > 6){
            return new Rare();
        }
        return new Common();
    }

    public int levelOfEnemy(String enemy){
        Random rand = new Random();
        int random = 0;
        if (enemy == "Minion"){
            random = rand.nextInt(3);
            return random;
        }else if (enemy == "Elite"){
            random = rand.nextInt(7);
            return random;
        }else if (enemy == "Boss"){
            random = rand.nextInt(10);
            return random;
        }
        return random;
    }
}
