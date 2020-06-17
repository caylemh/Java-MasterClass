import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//
//        player.name = "caylem";
//        player.health = 20;
//        player.weapon = "Scythe";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining Player health: " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining Player health: " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Angel", 50, "Scythe");
        System.out.println("Initial Player health: " + player.getHealth());
        player.loseHealth(51);
    }
}
