package JAVA_LEVEL_2.Java_lvl2_homework.git.lesson2.hw2;

import java.util.Scanner;

public class MyNewException {
    public static int sum=0;
    public static Scanner length = new Scanner(System.in);
    public static Scanner height = new Scanner(System.in);
    public static int rememberLength;
    public static int rememberHeight;
    public static void main(String[] args) throws  MyArraySizeException,MyArrayDataException {
        System.out.println("Введите ширину массива");
        int y = length.nextInt();
        System.out.println("Введите длинну массива");
        int x = height.nextInt();
        CreateMassive createMassive = new CreateMassive();
        String[][] mass = new String[y][x];
        try{
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    mass[i][j] = createMassive.createMass(y,x)[i][j];
                    System.out.print(mass[i][j] + "\t");
                    rememberHeight = j;
                    rememberLength = i;
                    sum = sum + Integer.parseInt(mass[i][j]);
                    if (j==x-1){
                        System.out.println();
                    }
                }

            }
            System.out.println("Сумма элементов массива равна: " + sum);
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            throw new MyArrayDataException("Ошибка в ячейке" + rememberHeight + "-" + rememberLength);

        }

    }
}
