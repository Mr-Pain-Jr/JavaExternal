package task_07_02_droidFight;

public class RepairDroid extends Droid {


    public RepairDroid(){
        this.damageLevel=5;
        this.energyLevel=55;
    }


    @Override
    public void walk() {
        System.out.println("I ride!");
    }

    public void shoot(Droid d) throws InterruptedException{
        Thread.sleep(100);
        d.energyLevel-=this.damageLevel;
    }

    public void repair(Droid d) throws InterruptedException {

        d.energyLevel+=30;
    }

}
