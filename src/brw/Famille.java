package brw;

import java.util.List;

/**
 * Created by majid on 18/01/14.
 */
public class Famille {
    private Personne pere;
    private Personne mere;
    private List<Personne> enfants;


    public Personne getPere() {
        return pere;
    }

    public void setPere(Personne pere) {
        this.pere = pere;
    }

    public Personne getMere() {
        return mere;
    }

    public void setMere(Personne mere) {
        this.mere = mere;
    }

    public List<Personne> getEnfants() {
        return enfants;
    }

    public void setEnfants(Personne enfant) {
        this.enfants.add(enfant);
    }

}
