package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int array[];
        System.out.println( "Введите размер массива: " );
        int length = input.nextInt();
        if(length <= 0){
            array = new int[10];
        }
        else{
            array = new int[length];
        }
        System.out.println("Вывод "+array.length+" значений:");
        for(int i=0; i<array.length; i++){
            array[i] = (int)input.nextInt();
        }
        Func(array);
    }
    public static void Func(int array[]){
        System.out.print("array: \n[");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(i != array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
