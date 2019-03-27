/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.bogdan.lab10.model.entity;

import by.bntu.fitr.povt.bogdan.lab10.model.logic.Classes_Methods;
import by.bntu.fitr.povt.bogdan.lab10.model.util.Request;
import by.bntu.fitr.povt.bogdan.lab10.view.Printer;
import java.util.List;

public class Item {

    /* OUTPUT MESSAGE LIST */
    private static final String ID_YET = "\nThis ID already yet in base!";
    private static final String ID_REQUEST = "ID : ";
    private static final String COUNT_REQUEST = "COUNT : ";
    private static final String CONST_REQUEST = "COST : ";
    private static final String NAME_REQUEST = "NAME : ";
    private static final String CATEG_REQUEST = "CATEGORY : ";
    private static final String BORDER = "\t|\t";

    private int id;
    private int count; // Count in stock
    private float cost;
    private String name;
    private String category;

    /* CONSTRUCTOR */
    public Item() {
        this.id = Request.getint(ID_REQUEST, 0);
        this.count = Request.getint(COUNT_REQUEST, 0);
        this.cost = Request.getfloat(CONST_REQUEST, 0.0f);
        this.name = Request.getstr(NAME_REQUEST);
        this.category = Request.getstr(CATEG_REQUEST);
    }

    public Item(List<Item> array) {
        this();
        while (Classes_Methods.findItem(array, this.id)) {
            Printer.println(ID_YET);
            this.id = Request.getint(ID_REQUEST, 0);
        }
    }
    
    public Item(Item item){
        this.id = item.id;
        this.count = item.count;
        this.cost = item.cost;
        this.name = item.name;
        this.category = item.category;
    }

    /* GET & SET */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    /* PRINT METHODS */
    public void about() {
        Printer.println("ID" + BORDER
                + "COUNT" + BORDER
                + "COST $" + BORDER
                + "NAME" + BORDER
                + "CATEGORY");
    }

    @Override
    public String toString() {
        return this.id + BORDER
                + this.count + BORDER
                + this.cost + BORDER
                + this.name + BORDER
                + this.category;
    }
}
