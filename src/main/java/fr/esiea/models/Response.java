package fr.esiea.models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Response {
    private int id;
    private Formulaire f;
    private String user;
    private ArrayList<String> responseDates;

    public SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy");

    public Response(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Formulaire getF() {
        return f;
    }

    public void setF(Formulaire f) {
        this.f = f;
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
