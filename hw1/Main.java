package JAVA_LEVEL_2.lesson1;

import java.lang.reflect.Array;

public class Main {
    public static Actions[] actions = new Actions[4];
    public static Barriers[] barriers = new Barriers[2];
    public static void main(String[] args) {

        actions[0] = new People("Николай");
        actions[1] = new Cat("Маруся");
        actions[2] = new Robot("T-1000");
        actions[3] = new Robot("T-2000");
        //System.out.println(actions[0].getMaxJump());
        barriers[0] = new Wall();
        barriers[1] = new RoadRun();
            for (Barriers barriers: barriers) {
                if (barriers instanceof Wall){
                    ((Wall)barriers).Wall(actions);
                }
                if (barriers instanceof RoadRun){
                    ((RoadRun) barriers).RoadRun(actions);
                }
            }
    }
}
