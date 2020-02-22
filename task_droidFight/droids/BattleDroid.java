package task_droidFight.droids;

public class BattleDroid extends Droid implements RangedDroid{



    public BattleDroid(){
        this.damageLevel=25;
        this.energyLevel=100;
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


}

