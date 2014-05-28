package brw;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 19/01/14.
 */
public class Pere extends Homme {

    private List enfants = new ArrayList<Personne>();

    public Pere(String nom, String prenom) {
        super(nom, prenom);
        this.enfants = null;
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
