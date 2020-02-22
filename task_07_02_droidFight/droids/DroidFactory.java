package task_07_02_droidFight.droids;

public class DroidFactory {


    public DroidFactory() {
    }

    public Droid doChose(int choise) {
        if (choise == 1){
            return new BattleDroid();
        }else if(choise == 2){
            return new RocketDroid();
        }else if(choise == 3){
            return new NinjaDroid();
        }else if(choise == 4){
            return new SamuraiDroid();
        }else{
            System.out.println("You must choose droids between 1-4!");
            return null;
        }
    }

}
