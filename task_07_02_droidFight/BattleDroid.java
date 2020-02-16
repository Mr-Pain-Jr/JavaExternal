package task_07_02_droidFight;

public class BattleDroid extends Droid {



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
        System.out.println(d.toString()+" has "+d.energyLevel+" health!");
    }

    @Override
    public void fight(Droid d){
        walk();
        shoot(d);
    }

    @Override
    public String toString() {
        return "Battle Droid";
    }
}

