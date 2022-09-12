import java.util.Random;

public class Enemy {
    public String getEnemy(){
        Random rand = new Random();
        int random = rand.nextInt(10);
        if (random <= 4){
            return "Minion";
        }else if (random <= 7 && random > 4 ){
            return "Elite";
        }else if (random > 7){
            return "Boss";
        }
        return "Minion";
    }
}
