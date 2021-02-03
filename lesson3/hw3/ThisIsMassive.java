package JAVA_LEVEL_2.Java_lvl2_homework.git.lesson3.hw3;
import com.sun.javafx.collections.MappingChange;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ThisIsMassive {
    public static void main(String[] args) {
        //Здание 1
        String[] array = new String[]{"A", "B", "A", "a", "b", "B", "c", "D", "D", "d", "r", "e"};
        Set<String> newSet = new HashSet<>(Arrays.asList(array));//"удаляю" повторяющиеся элементы с помощью hashSet
        ArrayList<String> aL = new ArrayList<>(Arrays.asList(array));//создал ArrayList для подсчёта одинаковых элеметов
        for (String s : newSet) {
            System.out.print(s + "\t");
        }
        System.out.println();
        for (String s:newSet){
            System.out.println("Слово " + s +" w"+ Collections.frequency(aL,s)+ " раз");
        }


    }
}
