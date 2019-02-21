/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.bogdan.lab10.model;

import by.bntu.fitr.povt.bogdan.lab10.controller.Request;
import java.util.List;

public class Item {
    private int id;
    private int count;
    private float cost;
    private String name;
    private String category;
    
    /* GET & SET */
    public int getid() {
        return this.id;
    }
    
    public int getcount() {
        return this.count;
    }
    
    public float getcost() {
        return this.cost;
    }
    
    /* OUTPUT MESSAGE LIST */
    private static final String ID_YET = "\nThis ID already yet in base!";
    private static final String ID_REQUEST = "ID : ";
    private static final String COUNT_REQUEST = "COUNT : ";
    private static final String CONST_REQUEST = "COST : ";
    private static final String NAME_REQUEST = "NAME : ";
    private static final String CATEG_REQUEST = "CATEGORY : ";
    private static final String BORDER = "\t|\t";
            
    
    /* CONSTRUCTOR */ 
    Item(List <Item> array) {
        this();
        while (Classes_Methods.finditem(array, this.id)) {
            System.out.println(ID_YET);
            this.id = Request.getint(ID_REQUEST, 0);
        }
    }
    
    Item() {
        System.out.println("");
        this.id = Request.getint(ID_REQUEST, 0);
        this.count = Request.getint(COUNT_REQUEST, 0);
        this.cost = Request.getfloat(CONST_REQUEST, 0.0f);
        this.name = Request.getstr(NAME_REQUEST);
        this.category = Request.getstr(CATEG_REQUEST);
    }
    
    /* PRINT METHODS */
    void about() {
        System.out.println(
                this.id + BORDER + 
                this.count + BORDER +
                this.cost + BORDER + 
                this.name + BORDER + 
                this.category);
    }
    
    void title() {
        System.out.println(
                "ID" + BORDER +
                "COUNT" + BORDER +
                "COST $" + BORDER +
                "NAME" + BORDER + 
                "CATEGORY");
    }
}