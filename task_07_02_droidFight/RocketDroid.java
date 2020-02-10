package task_07_02_droidFight;

public class RocketDroid extends Droid {



    public RocketDroid(){
        this.damageLevel=30;
        this.energyLevel=150;
    }




    @Override
    public void walk() {
        System.out.println("I go but not fast!");
    }

    public void shoot(Droid d) throws InterruptedException{
        Thread.sleep(700);
        d.energyLevel-=this.damageLevel;
        System.out.println(d.toString()+" has "+d.energyLevel+" health!");
    }

    public void rocketShoot(Droid d) throws InterruptedException {
        Thread.sleep(1000);
        d.energyLevel-=(this.damageLevel*2);
    }

    @Override
    public String toString() {
        return "Rocket Droid";
    }


}
