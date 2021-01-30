package JAVA_LEVEL_2.lesson1;

public class People implements Actions {
    private String name;
    private final double MaxJump;
    private final double MaxRun;
    //бегать и прыгать
    public People(String name){
        this.name = name;
        this.MaxJump = 1.2;
        this.MaxRun = 1000;
    }
    @Override
    public String toString(){

        return "Человек " + name;
    }
    public void jump(){
        System.out.println(name + " прыгает");
    }
    public void run(){
        System.out.println(name + " побежал");
    }

    public double getMaxJump() {
        return MaxJump;
    }
    public double getMaxRun(){
        return MaxRun;
    }
    public String getName(){
        return name;
    }
}
