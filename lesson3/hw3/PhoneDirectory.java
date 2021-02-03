package JAVA_LEVEL_2.Java_lvl2_homework.git.lesson3.hw3;
import java.util.*;

public class PhoneDirectory {
//    private int phoneNumber;
//    private String family;
    private static Map<Integer,String> base = new HashMap<>();
    private static ArrayList<Integer> list = new ArrayList<>();

//    PhoneDirectory(String family,int phoneNumber){
//        this.phoneNumber = phoneNumber;
//        this.family =family;
//    }
//    public void HashMap() {
//        this.phoneNumber=phoneNumber;
//        this.family=family;
//    }
    public static String add(String family, int phoneNumber){
        base.put(phoneNumber, family);
        return "Пользователь " + family + " добавлен";
    }
    public static void get(String family) {
            if(base.containsValue(family)){
                for (Map.Entry<Integer, String> integerStringEntry : base.entrySet()) {
                    if(integerStringEntry.getValue().equals(family)){
                        list.add(integerStringEntry.getKey());
                    }
                }
                System.out.println("У пользователя " + family + " следующий номер: " + list);
                list.clear();
            }
    }
//    public static void printMap(){
//        Iterator e = base.entrySet().iterator();
//        while(e.hasNext()){
//            Map.Entry me = (Map.Entry)e.next();
//            System.out.print(me.getKey() + ": ");
//            System.out.println(me.getValue());
//        }
//    }


}
