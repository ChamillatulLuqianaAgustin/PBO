package Tugas;

public class Plant {
    public void doDestroy(Destroyable d) {
        if (d instanceof JumpingZombie) {
            JumpingZombie jz = (JumpingZombie) d;
            jz.heal();
            jz.destroyed();
        } else if (d instanceof WalkingZombie) {
            WalkingZombie wz = (WalkingZombie) d;
            wz.heal();
            wz.destroyed();
        } else {
            Barrier b = (Barrier) d;
            b.destroyed();
        }
    }
}