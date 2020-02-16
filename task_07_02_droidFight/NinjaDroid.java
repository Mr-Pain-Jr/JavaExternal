package task_07_02_droidFight;

public class NinjaDroid extends Droid {


    public NinjaDroid(){
        this.damageLevel=20;
        this.energyLevel=95;
    }

    @Override
    public void walk() {
        System.out.println("I fly!");
    }

    public void shoot(Droid d){
        d.energyLevel-=this.damageLevel;
        System.out.println(d.toString()+" has "+d.energyLevel+" health!");
    }

    public void vampire(){
        this.energyLevel+=(this.damageLevel*0.5);
    }

    @Override
    public void fight(Droid d) {
        walk();
        shoot(d);
        vampire();
    }

    @Override
    public String toString() {
        return "Ninja Droid";
    }
}
