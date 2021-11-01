package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        int[] barcode = new int[13];
        int num1 = 0;
        int num2 = 0;
        while(!valid) {
            try {
                for (int i = 0; i < 13; i++) {
                    System.out.println("type in the barcode digit by digit");
                    barcode[i] = sc.nextShort();
                    if (barcode[i] < 0 || barcode[i] > 9) {
                        barcode[i] = Integer.parseInt("just type in a number between 1 and 10");
                    }
                    if(i % 2 == 0){
                        num1 += i;
                    }
                    else if(i < 11){
                        num2 += i;
                    }
                    num1 = num1 * 3;
                    num1 = num2 + num1;
                    num1 += barcode[12];
                }
                if(num1 % 10 == 0){
                    System.out.println("valid barcode");
                }
                else{
                    System.out.println("invalid barcode");
                }
                valid = true;
            } catch (Exception e) {
                System.out.println("just type in a 13 digit barcode idiot " + e);
            }
            finally {
                for (int i = 0; i < 13; i++) {
                    System.out.print(barcode[i]);
                }
            }
        }
    }
}
