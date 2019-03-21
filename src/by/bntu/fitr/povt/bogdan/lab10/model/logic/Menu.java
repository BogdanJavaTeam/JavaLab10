/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.bogdan.lab10.model.logic;

import by.bntu.fitr.povt.bogdan.lab10.model.entity.Client;
import by.bntu.fitr.povt.bogdan.lab10.model.entity.Item;
import by.bntu.fitr.povt.bogdan.lab10.model.entity.Order;
import static by.bntu.fitr.povt.bogdan.lab10.model.logic.Classes_Methods.clientDel;
import static by.bntu.fitr.povt.bogdan.lab10.model.logic.Classes_Methods.itemDel;
import static by.bntu.fitr.povt.bogdan.lab10.model.logic.Classes_Methods.orderDel;
import static by.bntu.fitr.povt.bogdan.lab10.controller.Lab10.clients;
import static by.bntu.fitr.povt.bogdan.lab10.controller.Lab10.items;
import static by.bntu.fitr.povt.bogdan.lab10.controller.Lab10.orders;
import by.bntu.fitr.povt.bogdan.lab10.view.Printer;


public class Menu {

    private static final String ERROR_ORDER = "Orders list is empty!";
    private static final String ERROR_CLIENTS = "Clients list is empty!";
    private static final String ERROR_ITEMS = "Items list is empty!";

    public static void callmenu(int x) {
        int length;
        switch (x) {
            case 0:
                System.exit(0);
            case 1:
                try {
                    length = orders.size();
                    Printer.println(orders.get(0).toString());
                    for (int i = 0; i < length; i++) {
                        orders.get(i).about();
                    }
                } catch (Exception err) {
                    Printer.println(ERROR_ORDER);
                }
                break;
            case 2:
                try {
                    length = clients.size();
                    Printer.println(clients.get(0).toString());
                    for (int i = 0; i < length; i++) {
                        clients.get(i).about();
                    }
                } catch (Exception err) {
                    Printer.println(ERROR_CLIENTS);
                }
                break;
            case 3:
                try {
                    length = items.size();
                    Printer.println(items.get(0).toString());
                    for (int i = 0; i < length; i++) {
                        items.get(i).about();
                    }
                } catch (Exception err) {
                    Printer.println(ERROR_ITEMS);
                }
                break;
            case 4:
                Order order = new Order(orders, items);
                orders.add(order);
                break;
            case 5:
                orderDel();
                break;
            case 6:
                Item item = new Item(items);
                items.add(item);
                break;
            case 7:
                itemDel();
                break;
            case 8:
                Client bufcl = new Client(clients);
                clients.add(bufcl);
                break;
            case 9:
                clientDel();
                break;
            default:
                break;
        }
    }
}
