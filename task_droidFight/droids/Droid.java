package task_droidFight.droids;

public abstract class Droid implements Comparable<Droid>{

    Engine e;
    public int damageLevel;
    public int energyLevel;
    public String onboard;
    public void walk(){
        System.out.println("I go.");
    }

    public String save(){
        return this.onboard+";"+this.damageLevel+";"+this.energyLevel;
    }

    public void fight(Droid d){

    }
    class Engine{
      boolean isOn = false;

        public Engine(boolean isOn) {
            this.isOn = isOn;
        }
    }
}
