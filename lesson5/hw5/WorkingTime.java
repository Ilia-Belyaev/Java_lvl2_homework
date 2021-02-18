package JAVA_LEVEL_2.Java_lvl2_homework.git.lesson5.hw5;

public class WorkingTime {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    public static void main(String[] args){
        //System.out.println("Время работы метода без потоков: " + WithoutFlow.withoutFlow());
        System.out.println("Время работы метода без потоков: " + WithoutFlow.withoutFlow(arr) + " миллиcекунд." );
        WithFlow.WithFlow(arr,h);
    }



}
