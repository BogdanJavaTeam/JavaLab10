/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bntu.fitr.povt.bogdan.lab10.model.logic;

import by.bntu.fitr.povt.bogdan.lab10.model.util.Request;
import by.bntu.fitr.povt.bogdan.lab10.model.logic.Classes_Methods;
import java.util.List;

public class Client {
    private int id;
    private int count;
    private String name;
    private String adress;
    private String phone;
    
    /* GET & SET */
    public int getid() {
        return this.id;
    }
    
    /* OUTPUT MESSAGE LIST */
    private static final String ID_YET = "This ID already yet in base!\n";
    private static final String ID_REQUEST = "ID : ";
    private static final String HONE_REQUEST = "PHONE : ";
    private static final String BORDER = "\t|\t";
    
    /* CONSTRUCTOR */ 
    Client() {
        this.id = Request.getint(ID_REQUEST, 0);
        this.count = Request.getint("ORDERS COUNT : ", 0);
        this.name = Request.getstr("NAME : ");
        this.adress = Request.getstr("ADRESS : ");
        this.phone = Request.getstr("PHONE : ");
    }
    
    Client(List <Client> array) {
        this();
        while (Classes_Methods.findclient(array, this.id)) {
            System.out.println(ID_YET);
            this.id = Request.getint(ID_REQUEST, 0);
        }
        
    }
    
    /* INCTEMENT ORDERS COUNT */
    void incr() {
        this.count++;
    }
    
    /* CHANGE CLIENT DATA*/
    void adress() {
        this.adress = Request.getstr("Adress : ");
    }
    
    void phone() {
        this.phone = Request.getstr("Phone : ");
    }
    
    /* PRINT INFORMATION ABOUT CLIENT */
    void about() {
        System.out.println(
                this.id + BORDER +
                this.count + BORDER +
                this.name + BORDER +
                this.adress + BORDER +
                this.phone);
    }
    
    void ToString() {
        System.out.println(
                "ID" + BORDER +
                "ORDERS COUNT" + BORDER +
                "NAME" + BORDER +
                "ADRESS" + BORDER +
                "PHONE");
    }
           
}
