package Rahul;

import java.util.Scanner;

public class Temptaure {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println( "Enter the Tempature :");

        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;

        System.out.println(tempF);
        }
}
