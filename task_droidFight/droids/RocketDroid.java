package task_droidFight.droids;

public class RocketDroid extends Droid {



    public RocketDroid(){
        this.damageLevel=30;
        this.energyLevel=150;
    }




    @Override
    public void walk() {
        System.out.println("I go but not fast!");
    }

    public void shoot(Droid d) {
        d.energyLevel-=this.damageLevel;
    }

    public void rocketShoot(Droid d) {
        d.energyLevel-=(this.damageLevel*2);
    }

    @Override
    public void fight(Droid d){
        shoot(d);
        if(this.energyLevel < 10){
            rocketShoot(d);
        }

    }

    @Override
    public String toString() {
        return "Rocket Droid";
    }


}
