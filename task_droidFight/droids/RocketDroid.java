package task_droidFight.droids;

public class RocketDroid extends Droid implements RangedDroid{



    public RocketDroid(){
        this.damageLevel=30;
        this.energyLevel=150;
        this.onboard="RocketDroid";
    }

    public RocketDroid(int damage, int energy){
        this.damageLevel=damage;
        this.energyLevel=energy;
        this.onboard="RocketDroid";
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
        return "Ranged Rocket Droid";
    }
    @Override
    public int compareTo(Droid o) {
        return this.damageLevel - o.damageLevel;
    }

    public String save(){
        return this.onboard+";"+this.damageLevel+";"+this.energyLevel;
    }


}
