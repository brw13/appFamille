package brw;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 19/01/14.
 */
public class Homme extends Personne {
    private ArrayList<Femme> femmes;

    public Homme(String nom, String prenom) {
        super(nom, prenom);
        this.setSexe("Homme");
        this.femmes = new ArrayList<Femme>();
    }

    public ArrayList<Femme> getFemmes() {
        return femmes;
    }

    public void setFemmes(Femme femme) {
        this.femmes.add(femme);
        femme.setMariee(true);
    }

    public void addFemme(Femme femme) throws IllegalArgumentException {
        if (this.getSexe() == "Homme") {
            if ((this.getFemmes().contains(femme) == true) || (femme.isMariee() == true)) {
                System.out.println(" La Femme " + femme.getPrenom() + " " + femme.getNom().toUpperCase() + " est déjà mariée!");
            } else {
                try {
                    this.setFemmes(femme);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Erreur d'ajout de la femme!");
                }
                femme.setMariee(true);
            }
        } else System.out.println(" Vous n'êtes pas un homme donc vous ne pouvez pas avoir de femme!");

    }
}
