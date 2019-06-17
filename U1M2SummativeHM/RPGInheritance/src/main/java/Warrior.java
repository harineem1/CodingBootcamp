public class Warrior extends base {

    private int shieldStrength;

    public void decreaseShieldStrength(){
        System.out.println("decreaseing ShieldStrength");
    }

    public Warrior() {
        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(100);
        this.setSpeed(50);
        this.setAttackPower(10);
        this.shieldStrength = 100;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }
}
