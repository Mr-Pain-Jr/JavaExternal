package task_droidFight.droids;

public class BattleDroid extends Droid implements RangedDroid{



    public BattleDroid(){
        this.damageLevel=25;
        this.energyLevel=100;
        this.onboard="BattleDroid";
    }

    public BattleDroid(int damage, int energy){
        this.damageLevel=damage;
        this.energyLevel=energy;
        this.onboard="BattleDroid";
    }


    @Override
    public void walk() {
        System.out.println("I run!");
    }

    public void shoot(Droid d){
        d.energyLevel-=this.damageLevel;
    }

    @Override
    public void fight(Droid d){
        shoot(d);
    }

    @Override
    public String toString() {
        return "Ranged Battle Droid";
    }

    @Override
    public int compareTo(Droid o) {
        return this.damageLevel - o.damageLevel;
    }


    public String save(){
        return this.onboard+";"+this.damageLevel+";"+this.energyLevel;
    }
}

