package com.antaladrien;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first age:");
        int num1 = myObj.nextInt();
        System.out.println("Enter second age:");
        int num2 = myObj.nextInt();
        System.out.println("Enter third age:");
        int num3 = myObj.nextInt();
        System.out.println("Any of them is teenager");
        System.out.println(hasTeen(num1, num2, num3));
        System.out.println("");

        System.out.println("Enter age of girl or boy:");
        int num4 = myObj.nextInt();
        System.out.println("She / he is teenager");
        System.out.println(isTeen(num4));
    }

    public static boolean hasTeen(int num1, int num2, int num3 ) {
        if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)) {
            return true;
        } return false;
    }

    public static boolean isTeen(int num4){
        if(num4 >=13 && num4 <= 19){
            return true;
        }return false;
    }
}
