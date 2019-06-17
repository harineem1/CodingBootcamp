public class Farmer extends base {
    public Farmer() {

        this.setStrength(75);
        this.setHealth(100);
        this.setStamina(75);
        this.setSpeed(10);
        this.setAttackPower(1);
    }

    public void plow() {
        System.out.println("Plowing");
    }
    public void harvest() {
        System.out.println("Harvesting");
    }

}