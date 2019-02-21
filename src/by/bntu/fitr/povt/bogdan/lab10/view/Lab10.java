/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.bogdan.lab10.view;

import java.util.ArrayList;
import java.util.List;
import by.bntu.fitr.povt.bogdan.lab10.controller.Request;
import by.bntu.fitr.povt.bogdan.lab10.model.Client;
import by.bntu.fitr.povt.bogdan.lab10.model.Item;
import static by.bntu.fitr.povt.bogdan.lab10.model.Menu.*;
import by.bntu.fitr.povt.bogdan.lab10.model.Order;

/**
 *
 * @author Roule
 */
public class Lab10 {
    public static List <Item> items = new ArrayList <Item> ();
    public static List <Client> clients = new ArrayList <Client> ();
    public static List <Order> orders = new ArrayList <Order> ();
    
    public static void main(String[] args) {
       int awns = 1;
       while (awns != 0) {
           MENU:
           printmenu();
           awns = Request.getint("Awnswear : ", 0, 9);
           System.out.println("");
           callmenu(awns);
       }
       
    }
    
    public static void printmenu() {
        System.out.println("\n1 | Show active orders");
        System.out.println("2 | Show customers list");
        System.out.println("3 | Show items list");
        System.out.println("4 | Add order");
        System.out.println("5 | Delete order");
        System.out.println("6 | Add item");
        System.out.println("7 | Delete item");
        System.out.println("8 | Add customer");
        System.out.println("9 | Delete customer");
        System.out.println("0 | Exit\n");
    }
    
}