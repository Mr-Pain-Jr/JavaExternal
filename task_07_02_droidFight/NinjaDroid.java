package task_07_02_droidFight;

public class NinjaDroid extends Droid {


    public NinjaDroid(){
        this.damageLevel=15;
        this.energyLevel=95;
    }

    @Override
    public void walk() {
        System.out.println("I fly!");
    }

    public void shoot(Droid d)throws InterruptedException{
        Thread.sleep(135);
        d.energyLevel-=this.damageLevel;
        System.out.println(d.toString()+" has "+d.energyLevel+" health!");
    }

    public void vampire(NinjaDroid nd){
        nd.energyLevel+=(this.damageLevel*0.5);
    }

    @Override
    public String toString() {
        return "Ninja Droid";
    }
}
