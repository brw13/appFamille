package brw;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: majid
 * Date: 18/01/14
 * Time: 00:45
 * To change this template use File | Settings | File Templates.
 */
public class Personne {

    private String nom;
    private String prenom;
    private String sexe;
    private boolean mariee;
    private Pere pere;
    private Mere mere;
    private Naissance naissance;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public boolean isMariee() {
        return mariee;
    }

    public void setMariee(boolean mariee) {
        this.mariee = mariee;
    }

    public Pere getPere() {
        return pere;
    }

    public void setPere(Pere pere) {
        this.pere = pere;
    }

    public Mere getMere() {
        return mere;
    }

    public void setMere(Mere mere) {
        this.mere = mere;
    }

    public Naissance getNaissance() {
        return naissance;
    }

    public void setNaissance(Naissance naissance) {
        this.naissance = naissance;
    }


}
