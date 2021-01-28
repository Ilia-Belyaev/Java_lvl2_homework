package JAVA_LEVEL_2.lesson1;

public class Cat implements Actions {
    private String name;
    private final double MaxJump;
    private final double MaxRun;
    //бегать и прыгать
    public Cat(String name){
        this.name = name;
        this.MaxJump = 2;
        this.MaxRun = 100;
    }
    @Override
    public String toString(){

        return "Кошка " + name;
    }
    public void jump(){
        System.out.println(name + " прыгает");
    }
    public void run(){
        System.out.println(name + " бежит");
    }
     public double getMaxJump(){
        return MaxJump;
     }
     public double getMaxRun(){
        return MaxRun;
     }
    public String getName(){
        return name;
    }
}
