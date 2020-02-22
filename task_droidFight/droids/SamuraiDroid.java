package task_droidFight.droids;

public class SamuraiDroid extends Droid implements MeleeDroid{

    public SamuraiDroid(){
        this.damageLevel=50;
        this.energyLevel=80;
    }

    @Override
    public void walk() {
        System.out.println("I fly!");
    }

    public void shoot(Droid d){
        d.energyLevel-=this.damageLevel;
    }

    public void reincarnation(){
        this.energyLevel+=(80);
    }

    @Override
    public void fight(Droid d) {
        shoot(d);
        if(this.energyLevel<=5){
            reincarnation();
        }
    }

    @Override
    public String toString() {
        return "Melee Samurai Droid";
    }
    @Override
    public int compareTo(Droid o) {
        return this.damageLevel - o.damageLevel;
    }
}

