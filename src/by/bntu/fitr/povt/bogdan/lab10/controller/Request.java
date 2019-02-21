/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.bogdan.lab10.controller;

import java.util.Scanner;

public class Request {
    private static final String WRONGINT = "Please, write int value!";
    private static final String WRONGFLOAT = "Please, write float value!";
    
    /* REQUEST INT VALUE > MIN */
    public static int getint(String text, int min) {
        int value = min - 1;
        while (value < min) {
            try {
                System.out.print(text);
                value = new Scanner(System.in).nextInt();
            }
            catch (Exception x) {
                System.out.println(WRONGINT);
            }
        }
        return value;
    }
    
    public static int getint(String text, int min, int max) {
        int value = min - 1;
        while (value < min || value > max) {
            try {
                System.out.print(text);
                value = new Scanner(System.in).nextInt();
            }
            catch (Exception x) {
                System.out.println(WRONGINT);
            }
        }
        return value;
    }
    
    /* REQUEST FLOAT VALUE > MIN */
    public static float getfloat(String text, float min) {
        float value = min - 1;
        while (value < min) {
            try {
                System.out.print(text);
                value = new Scanner(System.in).nextFloat();
            }
            catch (Exception x) {
                System.out.println(WRONGFLOAT);
            }
        }
        return value;
    }
    
    /* REQUEST STRING  */
    public static String getstr(String text) {
        System.out.print(text);
        return new Scanner(System.in).next();
    }
    
}