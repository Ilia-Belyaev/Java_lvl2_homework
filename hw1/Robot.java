package JAVA_LEVEL_2.lesson1;

public class Robot implements Actions {
    private String name;
    private final double MaxJump;
    private final double MaxRun;
    public Robot(String name){
        this.name = name;
        this.MaxRun = 10;
        this.MaxJump = 0;
    }
    @Override
    public String toString(){

        return "Робот " + name;
    }
    public void jump(){
        System.out.println(name + " прыгает");
    }
    public void run(){
        System.out.println(name + " бежит");
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
