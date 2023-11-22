package Tugas;

public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    
    @Override
    public void heal() {
        switch (this.level) {
        case 1:
            this.health += (30 / 100 * this.health);
            break;
        case 2:
            this.health += (40 / 100 * this.health);
            break;
        case 3:
            this.health += (50 / 100 * this.health);
            break;
        }
    }
    
    @Override
    public void destroyed() {
        this.health -= (10 * this.health / 100);
    }
    
    @Override
    public String getZombieInfo() {
        String info = "Jumping Zombie Data = \n";
        info += super.getZombieInfo();
        return info;
    }
}