package brw;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 19/01/14.
 */
public class Mere extends Femme {

    private Homme mari;
    private List<Personne> enfants = new ArrayList<Personne>();

    public Mere(String nom, String prenom) {
        super(nom, prenom);
        this.enfants = null;
    }

    public Homme getMari() {
        return mari;
    }

    public void setMari(Homme mari) {
        this.mari = mari;
    }

    public List<Personne> getEnfants() {
        return enfants;
    }

    public void setEnfants(Personne personne) {
        if (personne instanceof Fils){
            try {
                this.enfants.add((Fils)personne);
                return;
            } catch (Exception e) {
                System.out.println("Erreur d'ajout du Fils!!! ");
                e.printStackTrace();
            }
        }else if (personne instanceof Fille){
            try {
                this.enfants.add((Fille)personne);
                return;
            } catch (Exception e) {
                System.out.println("Erreur d'ajout de la fille!!! ");
                e.printStackTrace();
            }
        }
        return;
    }
}
