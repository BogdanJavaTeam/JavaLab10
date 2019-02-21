/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.bogdan.lab10.model;

import static by.bntu.fitr.povt.bogdan.lab10.model.Classes_Methods.clientdel;
import static by.bntu.fitr.povt.bogdan.lab10.model.Classes_Methods.itemdel;
import static by.bntu.fitr.povt.bogdan.lab10.model.Classes_Methods.orderdel;
import static by.bntu.fitr.povt.bogdan.lab10.view.Lab10.clients;
import static by.bntu.fitr.povt.bogdan.lab10.view.Lab10.items;
import static by.bntu.fitr.povt.bogdan.lab10.view.Lab10.orders;

public class Menu {
    private static final String ERROR_ORDER = "Orders list is empty!";
    private static final String ERROR_CLIENTS = "Clients list is empty!";
    private static final String ERROR_ITEMS = "Items list is empty!";
    
    public static void callmenu(int x) {
        int length;
        switch (x){
            case 0 : 
                System.exit(0);
            case 1 :
                try {
                    length = orders.size();
                    orders.get(0).title();
                    for (int i = 0; i < length; i++)
                        orders.get(i).about();
                } catch (Exception err) {
                    System.out.println(ERROR_ORDER);
                }
                break;
            case 2 :
                try {
                    length = clients.size();
                    clients.get(0).title();
                    for (int i = 0; i < length; i++)
                        clients.get(i).about();
                } catch (Exception err) {
                    System.out.println(ERROR_CLIENTS);
                }
                break;
            case 3 :
                try {
                    length = items.size();
                    items.get(0).title();
                    for (int i = 0; i < length; i++)
                        items.get(i).about();
                } catch (Exception err) {
                    System.out.println(ERROR_ITEMS);
                }
                break;
            case 4 : 
                Order order = new Order(orders, items);
                orders.add(order);
                break;
            case 5 : 
                orderdel();
                break;
            case 6 : 
                Item item = new Item(items);
                items.add(item);
                break;
            case 7 :
                itemdel();
                break;
            case 8 :
                Client bufcl = new Client(clients);
                clients.add(bufcl);
                break;
            case 9 :
                clientdel();
                break;
            default :
                break;
        }
    }
}
