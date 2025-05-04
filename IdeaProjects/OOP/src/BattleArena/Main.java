package BattleArena;

public class Main {
    public static void main(String[] args) {
        Enemy zombie = new Enemy();
        zombie.enemyType = "zombie";
        System.out.println("enemy of type " + zombie.enemyType + " has " + zombie.healthPoints + " health points and has " + zombie.attackDamage + " attack damage");
        zombie.talk();

    }
}
