package JAVA_LEVEL_2.lesson1;

public class Wall extends Barriers{

    public  void Wall(Actions[] actions){
        double height = Math.round(Math.random()*3);
        for(int i=0;i<actions.length;i++){
            if(actions[i].getMaxJump()>height){
                System.out.println(actions[i].getName() + " перепрыгнул " + height + " м");
            }else{
                System.out.println(actions[i].getName() + " не смог перепрыгнуть " + height + " м");
            }
        }
    }
}
