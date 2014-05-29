package brw;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 19/01/14.
 */
public class Femme extends Personne {
    Homme mari;
    public Femme(String nom, String prenom) {
        super(nom, prenom);
        this.setSexe("Femme");
    }

    public Homme getMari() {
        return this.mari;
    }

    public void setMari(Homme mari) {
        this.mari = mari;
    }
}
