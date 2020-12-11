package fr.esiea.models;

import java.text.DateFormat;
import java.text.Normalizer;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

public class Formulaire {

    private int id;
    private String nomFormulaire;
    private String descFormulaire;
    private ArrayList<String> dates;

    public SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy");


    public Formulaire(){

    }

    public Formulaire(int id, String nomFormulaire, String descFormulaire, String d) {
        this.id = id;
        this.nomFormulaire = nomFormulaire;
        this.descFormulaire = descFormulaire;
        this.dates = new ArrayList<String>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomFormulaire() {
        return nomFormulaire;
    }

    public void setNomFormulaire(String nomFormulaire) {
        this.nomFormulaire = nomFormulaire;
    }

    public String getDescFormulaire() {
        return descFormulaire;
    }

    public void setDescFormulaire(String descFormulaire) {
        this.descFormulaire = descFormulaire;
    }

    public ArrayList<String> getDates() {
        return dates;
    }


}
