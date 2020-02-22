package task_droidFight.droids;

public class NinjaDroid extends Droid implements MeleeDroid {


    public NinjaDroid(){
        this.damageLevel=20;
        this.energyLevel=95;
        this.onboard="NinjaDroid";
    }

    public NinjaDroid(int damage, int energy){
        this.damageLevel=damage;
        this.energyLevel=energy;
        this.onboard="NinjaDroid";
    }

    @Override
    public void walk() {
        System.out.println("I fly!");
    }

    public void shoot(Droid d){
        d.energyLevel-=this.damageLevel;
    }

    public void vampire(){
        this.energyLevel+=(this.damageLevel*0.5);
    }

    @Override
    public void fight(Droid d) {

        shoot(d);
        vampire();
    }

    @Override
    public String toString() {
        return "Melee Ninja Droid";
    }
    @Override
    public int compareTo(Droid o) {
        return this.damageLevel - o.damageLevel;
    }

    public String save(){
        return this.onboard+";"+this.damageLevel+";"+this.energyLevel;
    }
}
