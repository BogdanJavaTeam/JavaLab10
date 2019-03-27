/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.bogdan.lab10.model.logic;

import by.bntu.fitr.povt.bogdan.lab10.model.entity.Client;
import by.bntu.fitr.povt.bogdan.lab10.model.entity.Order;
import by.bntu.fitr.povt.bogdan.lab10.model.entity.Item;
import by.bntu.fitr.povt.bogdan.lab10.model.util.Request;
import by.bntu.fitr.povt.bogdan.lab10.model.util.Request;
import static by.bntu.fitr.povt.bogdan.lab10.controller.Lab10.clients;
import static by.bntu.fitr.povt.bogdan.lab10.controller.Lab10.items;
import static by.bntu.fitr.povt.bogdan.lab10.controller.Lab10.orders;
import by.bntu.fitr.povt.bogdan.lab10.view.Printer;
import java.util.List;

public class Classes_Methods {

    private static final String DELETE_ITEM = "Remove item by id : ";
    private static final String DELETE_CLIENT = "Remove client by id : ";
    private static final String DELETE_ORDER = "Remove order by id : ";
    private static final String ID_OUT = "ID out of range!";

    public static boolean findItem(List<Item> array, int id) {
        int length = array.size();
        for (int i = 0; i < length; i++) {
            if (array.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static boolean findOrder(List<Order> array, int id) {
        int length = array.size();
        for (int i = 0; i < length; i++) {
            if (array.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static boolean findClient(List<Client> array, int id) {
        int length = array.size();
        for (int i = 0; i < length; i++) {
            if (array.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static int itemId(List<Item> array) {
        int buf = array.get(0).getId();
        for (int i = 0, length = array.size(); i < length; i++) {
            if (buf < array.get(i).getId()) {
                buf = array.get(i).getId();
            }
        }
        return buf;
    }

    /* DELETE FUNCTIONS */
    public static void orderDel() {
        try {
            int delete = Request.getint(DELETE_ORDER, 0);
            for (int i = 0, length = orders.size(); i < length; i++) {
                if (orders.get(i).getId() == delete) {
                    orders.remove(i);
                }
            }
        } catch (Exception err) {
            Printer.println(ID_OUT);
        }
    }

    public static void clientDel() {
        try {
            int delete = Request.getint(DELETE_CLIENT, 0);
            for (int i = 0, length = clients.size(); i < length; i++) {
                if (clients.get(i).getId() == delete) {
                    clients.remove(i);
                }
            }
        } catch (Exception err) {
            Printer.println(ID_OUT);
        }
    }

    public static void itemDel() {
        try {
            int delete = Request.getint(DELETE_ITEM, 0);
            for (int i = 0, length = items.size(); i < length; i++) {
                if (items.get(i).getId() == delete) {
                    items.remove(i);
                }
            }
        } catch (Exception err) {
            Printer.println(ID_OUT);
        }
    }
}
