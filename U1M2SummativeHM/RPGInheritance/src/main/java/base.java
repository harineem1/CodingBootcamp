public class base {

     private String name;
     private int strength;
     private int health;
     private int stamina;
     private int speed;
     private int attackPower;

    public base() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    public void run() {
        System.out.println("Running");
    }
    public void attack() {
        System.out.println("Attacking");
    }
    public void heal(){
        System.out.println("healing");
     }
    public void decreaseHealth() {
        System.out.println("decreasingHealth");
    }
    public void increaseStamina() {
        System.out.println("increasingStamina");
    }
    public void decreasestamina(){
        System.out.println("decreaseingStamina");
    }


}

