package Tugas;

public class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public void heal() {

    }

    @Override
    public void destroyed() {

    }

    public String getZombieInfo() {
        String info = "Health = " + this.health;
        info += "\nLevel = " + this.level + "\n";
        return info;
    }
}