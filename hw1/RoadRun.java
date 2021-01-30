package JAVA_LEVEL_2.lesson1;

import java.util.Random;

public class RoadRun extends Barriers{

    public  void RoadRun(Actions[] actions){
        double MaxRun = Math.round(Math.random()*2000);
        for(int i=0;i<actions.length;i++){// вместо 3 по идее нужна длинна массива actions, но я не смог её получить
            if(actions[i].getMaxRun()>MaxRun){
                System.out.println(actions[i].getName() + " пробежал "+ MaxRun + " м");
            }else{
                System.out.println(actions[i].getName() + " не смог пробежать "+MaxRun + " м");
            }
        }
    }
}
