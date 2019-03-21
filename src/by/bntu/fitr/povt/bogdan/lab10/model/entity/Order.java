/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.bogdan.lab10.model.entity;

import by.bntu.fitr.povt.bogdan.lab10.model.logic.Classes_Methods;
import by.bntu.fitr.povt.bogdan.lab10.model.util.Request;
import by.bntu.fitr.povt.bogdan.lab10.view.Printer;
import java.util.ArrayList;
import java.util.List;



public class Order {

    /* OUTPUT MESSAGE LIST */
    private static final String ID_YET = "This ID already yet in base!\n";
    private static final String ID_FIND = "This ID not found in base!";
    private static final String ID_REQUEST = "ID : ";
    private static final String ITEM_REQUEST = "Item ID : ";
    private static final String CLIENT_REQUEST = "Client ID : ";
    private static final String BORDER = "\t|\t";
    private static final String ERROR_OBJ = "Wrong object. Delete from base.";
    
    /* FIELDS */
    private boolean status = false;
    private int id;
    private int clientid;
    private float sum = 0.0f;
    private List<Item> items = new ArrayList<>();

    /* GET & SET */

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    /* CONSTRUCTOR */
    public Order() {
        this.id = Request.getint(ID_REQUEST, 0);
        this.clientid = Request.getint(CLIENT_REQUEST, 0);
    }

    public Order(List<Order> array, List<Item> itembase) {
        this();
        while (Classes_Methods.findOrder(array, this.id)) {
            Printer.println(ID_YET);
            this.id = Request.getint(ID_REQUEST, 0);
        }
        // initialize items
        Item obj = null;
        while (true) {
            id = Request.getint(ITEM_REQUEST, 0);
            if (id == 0) {
                break;
            }
            for (int i = 0; i < itembase.size(); i++) {
                if (itembase.get(i).getId() == id) {
                    obj = itembase.get(i);
                }
            }
            try {
                this.items.add(obj);
            } catch (Exception err) {
                Printer.println(ID_FIND);
            }
        }
        // initialize sum
        try {
            if (this.items != null) {
                int length = this.items.size();
                for (int i = 0; i < length; i++) {
                    this.sum += this.items.get(i).getCost();
                }
            }
        } catch (Exception err) {
        }
    }

    /* PRINT METHODS */
    public void about() {
        try {
            Printer.println(
                    this.id + BORDER
                    + this.clientid + BORDER
                    + this.sum + BORDER
                    + this.items.size() + BORDER
                    + this.status);
        } catch (Exception err) {
            Printer.println(ERROR_OBJ);
        }
    }

    @Override
    public String toString() {
        return "ID" + BORDER + "CLIENT" + BORDER
                + "SUM $" + BORDER + "ITEMS" + BORDER
                + "STATUS";
    }
}
