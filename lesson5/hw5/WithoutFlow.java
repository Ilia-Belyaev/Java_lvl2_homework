package JAVA_LEVEL_2.Java_lvl2_homework.git.lesson5.hw5;

public class WithoutFlow {
    public static long withoutFlow(float[] arr){
        for (int i = 0; i < arr.length ; i++) {
            arr[i] =1;
        }
        //float sum = 0;
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2) );
            //sum = sum+arr[i];
        }
        System.currentTimeMillis();
       // return sum;
        return System.currentTimeMillis() - a;
    }
}
