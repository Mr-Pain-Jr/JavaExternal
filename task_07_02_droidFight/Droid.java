package task_07_02_droidFight;

public abstract class Droid {

    int damageLevel;
    int energyLevel;
    public void walk(){
        System.out.println("I go.");
    }

    public void shoot(Droid d)throws InterruptedException{

    }
}
