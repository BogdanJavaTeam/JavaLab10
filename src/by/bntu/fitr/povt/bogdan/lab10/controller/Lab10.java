/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.bogdan.lab10.controller;

import java.util.ArrayList;
import java.util.List;
import by.bntu.fitr.povt.bogdan.lab10.model.util.Request;
import by.bntu.fitr.povt.bogdan.lab10.model.entity.Client;
import by.bntu.fitr.povt.bogdan.lab10.model.entity.Item;
import static by.bntu.fitr.povt.bogdan.lab10.model.logic.Menu.*;
import by.bntu.fitr.povt.bogdan.lab10.model.entity.Order;
import by.bntu.fitr.povt.bogdan.lab10.view.Printer;

/**
 *
 * @author Roule
 */
public class Lab10 {

    public static List<Item> items = new ArrayList<Item>();
    public static List<Client> clients = new ArrayList<Client>();
    public static List<Order> orders = new ArrayList<Order>();

    public static void main(String[] args) {
        int answer = 1;
        while (answer != 0) {
            MENU:
            Printer.printmenu();
            answer = Request.getint("Answer : ", 0, 9);
            Printer.println("");
            callmenu(answer);
        }

    }
}
