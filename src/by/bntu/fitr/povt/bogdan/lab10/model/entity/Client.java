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

public class Client {

    /* OUTPUT MESSAGE LIST */
    private static final String ID_YET = "This ID already yet in base!\n";
    private static final String ID_REQUEST = "ID : ";
    private static final String BORDER = "\t|\t";
    
    /* FIELDS */
    private int id;
    private int count;
    private String name;
    private String adress;
    private String phone;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /* CONSTRUCTOR */
    public Client() {
        this.id = Request.getint(ID_REQUEST, 0);
        this.count = Request.getint("ORDERS COUNT : ", 0);
        this.name = Request.getstr("NAME : ");
        this.adress = Request.getstr("ADRESS : ");
        this.phone = Request.getstr("PHONE : ");
    }

    public Client(List<Client> array) {
        this();
        while (Classes_Methods.findClient(array, this.id)) {
            Printer.println(ID_YET);
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
    public void about() {
        Printer.println(
                this.id + BORDER
                + this.count + BORDER
                + this.name + BORDER
                + this.adress + BORDER
                + this.phone);
    }

    @Override
    public String toString() {
        return "ID" + BORDER + "ORDERS COUNT" + BORDER
                + "NAME" + BORDER + "ADRESS" + BORDER
                + "PHONE";
    }

}
