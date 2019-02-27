/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.bogdan.lab10.model.logic;

import by.bntu.fitr.povt.bogdan.lab10.model.util.Request;
import static by.bntu.fitr.povt.bogdan.lab10.controller.Lab10.clients;
import static by.bntu.fitr.povt.bogdan.lab10.controller.Lab10.items;
import static by.bntu.fitr.povt.bogdan.lab10.controller.Lab10.orders;
import java.util.List;

public class Classes_Methods {
    private static final String DELETE_ITEM = "Remove item by id : ";
    private static final String DELETE_CLIENT = "Remove client by id : ";
    private static final String DELETE_ORDER = "Remove order by id : ";
    private static final String ID_OUT = "ID out of range!";
    
    public static boolean finditem (List <Item> array, int id) {
        int length = array.size();
        for (int i = 0; i < length; i++) {
            if (array.get(i).getid() == id)
                return true;
        }
        return false;
    }
    
    public static boolean findorder (List <Order> array, int id) {
        int length = array.size();
        for (int i = 0; i < length; i++) {
            if (array.get(i).getid() == id)
                return true;
        }
        return false;
    }
    
    public static boolean findclient (List <Client> array, int id) {
        int length = array.size();
        for (int i = 0; i < length; i++) {
            if (array.get(i).getid() == id)
                return true;
        }
        return false;
    }
    
    public static int itemid (List <Item> array) {
        int buf = array.get(0).getid();
        for (int i = 0, length = array.size(); i < length; i++) {
            if (buf < array.get(i).getid())
                buf = array.get(i).getid();
        }
        return buf;
    }
    
    /* DELETE FUNCTIONS */
    public static void orderdel() {
        try {
            int delete = Request.getint(DELETE_ORDER, 0);
            for (int i = 0, length = orders.size(); i < length; i++) {
                if (orders.get(i).getid() == delete)
                    orders.remove(i);
            }
        } catch (Exception err) {
            System.out.println(ID_OUT);
        }    
    }
    
    public static void clientdel() {
        try {
            int delete = Request.getint(DELETE_CLIENT, 0);
            for (int i = 0, length = clients.size(); i < length; i++) {
                if (clients.get(i).getid() == delete)
                    clients.remove(i);
            }
        } catch (Exception err) {
            System.out.println(ID_OUT);
        }    
    }
    
    public static void itemdel() {
        try {
            int delete = Request.getint(DELETE_ITEM, 0);
            for (int i = 0, length = items.size(); i < length; i++) {
                if (items.get(i).getid() == delete)
                    items.remove(i);
            }
        } catch (Exception err) {
            System.out.println(ID_OUT);
        }    
    }
}
