package com.example.Model;

import java.util.Date;

public class Formulaire {

    private int id;
    private String nomFormulaire;
    private String descFormulaire;


    public Formulaire(){}

    public Formulaire(int id, String nomFormulaire, String descFormulaire, Date[] dateFormulaire, boolean[] repFormulaire) {
        this.id = id;
        this.nomFormulaire = nomFormulaire;
        this.descFormulaire = descFormulaire;

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


}
