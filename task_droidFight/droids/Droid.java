package task_droidFight.droids;

public abstract class Droid implements Comparable<Droid>{

    Engine e;
    public int damageLevel;
    public int energyLevel;
    public void walk(){
        System.out.println("I go.");
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
