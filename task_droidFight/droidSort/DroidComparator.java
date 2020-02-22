package task_droidFight.droidSort;

import task_droidFight.droids.Droid;

import java.util.Comparator;

public class DroidComparator implements Comparator<Droid> {


    @Override
    public int compare(Droid o1, Droid o2) {
        if(o1.damageLevel < o2.damageLevel){
            return -1;
        }else if (o1.damageLevel > o2.damageLevel){
            return 1;
        }else{
            return 0;
        }

    }

}
