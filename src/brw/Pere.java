package brw;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 19/01/14.
 */
public class Pere extends Homme {

    private ArrayList<Personne> enfants = new ArrayList<Personne>();

    public Pere(String nom, String prenom) {
        super(nom, prenom);
    }

    public ArrayList<Personne> getEnfants() {
        return this.enfants;
    }

    public void setEnfants(Personne personne) {
        ArrayList<Personne> childs = this.getEnfants();

        if (childs.contains(personne) == false) {
            if (personne instanceof Fils) {
                try {
                    childs.add((Fils) personne);
                    return;
                } catch (Exception e) {
                    System.out.println("Erreur d'ajout du Fils!!! ");
                    e.printStackTrace();
                }
            } else {
                if (personne instanceof Fille) {
                    try {
                         childs.add((Fille) personne);
                         return;
                    } catch (Exception e) {
                        System.out.println("Erreur d'ajout de la fille!!! ");
                        e.printStackTrace();
                    }
                }
            }
            return;
        } else return;// la personne existe deja dans la liste des enfants
    }
}
