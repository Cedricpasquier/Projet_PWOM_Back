package fr.esiea.models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Response {
    private int id;
    private int formId;
    private String user;
    private ArrayList<String> responseDates;

    //public SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy");

    public Response(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFormId() {
        return formId;
    }

    public void setFormId(int f) {
        this.formId = f;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ArrayList<String> getResponseDates() {
        return responseDates;
    }

    public void setResponseDates(ArrayList<String> responseDates) {
        this.responseDates = responseDates;
    }




}
