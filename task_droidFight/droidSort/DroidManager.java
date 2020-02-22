package task_droidFight.droidSort;

import task_droidFight.droids.Droid;
import task_droidFight.droids.DroidFactory;
import task_droidFight.droids.MeleeDroid;
import task_droidFight.droids.RangedDroid;

import java.util.*;

public class DroidManager{

    List<Droid> droids = new ArrayList<>();
    DroidFactory df = new DroidFactory();
    List<Droid> rDroids = new ArrayList<>();
    List<Droid> mDroids = new ArrayList<>();

    public DroidManager() {
        droids.add(df.bakeDroid(1));
        droids.add(df.bakeDroid(2));
        droids.add(df.bakeDroid(3));
        droids.add(df.bakeDroid(4));
        rDroids.add(df.bakeDroid(1));
        rDroids.add(df.bakeDroid(2));
        mDroids.add(df.bakeDroid(3));
        mDroids.add(df.bakeDroid(4));
    }

    public boolean dmgExists(Droid d, int damage){
        if(d.damageLevel == damage){
            return true;
        }else{
            return false;
        }
    }

    public boolean enrgExists(Droid d, int energy){
        if(d.energyLevel == energy){
            return true;
        }else{
            return false;
        }
    }


    public Droid searchDroid(int damage, int energy){
        for (Droid d :droids) {
            if(dmgExists(d,damage) && enrgExists(d,energy)){
                return d;
            }else{
                    System.out.println("There's no such droid!");
            }
        }
        return null;
    }

    public Droid searchDroidByDamage(int damage){
        for (Droid d :droids) {
            if(dmgExists(d,damage)){
                return d;
            }else{
                System.out.println("There's no such droid!");
            }
        }
        return null;
    }

    public Droid searchDroidByEnergy(int energy){
        for (Droid d :droids) {
            if(enrgExists(d,energy)) {
                return d;
            }
        }
        return null;
    }


    public List<Droid> sortByDamage(){


        Collections.sort(droids);
        System.out.println(droids.toString());

        return null;
    }


}
