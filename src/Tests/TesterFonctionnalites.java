package Tests;

import brw.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 19/01/14.
 */
public class TesterFonctionnalites {
    public static void testAddFemme(){
        Homme homme = new Homme("Diop","Flingo");
        Femme femme = new Femme("sow","prenomFemme");
        Femme femme2 = new Femme("Balde","prenomFemme8");
        Femme femme3 = new Femme("DIALLO","prenomFemme3");

        homme.addFemme(femme);
        homme.addFemme(femme2);
        homme.addFemme(femme3);
        System.out.println(" Vous avez en ce moment: " + homme.getFemmes().size() + " femmes");
    }

    public static void testAddFils(){
        Pere pere = new Pere("Diop","Flingoooo");
        Femme femme = new Femme("sow","prenomFemme");
        Femme femme2 = new Femme("Balde","prenomFemme8");
        Femme femme3 = new Femme("DIALLO","prenomFemme3");
        pere.addFemme(femme);
        pere.addFemme(femme2);
        pere.addFemme(femme3);

        Fils f = new Fils("nomFils","prenomFils");
        Fille fille = new Fille("nomFille","prenomFille");
        MethodesUtiles.addFils(pere,f);
        MethodesUtiles.addFille(pere, fille);

        List<Personne> maliste = new ArrayList<Personne>();
        maliste = pere.getEnfants();

        System.out.println(" Vous etes "+pere.getPrenom()+" "+pere.getNom().toUpperCase() );
        System.out.println(" Vous avez en ce moment: "+pere.getFemmes().size()+" femmes");
        if (maliste.isEmpty() == false){
            System.out.println(" Vous avez en ce moment: "+maliste.size()+" enfants qui sont: ");
            for (int i = 1; i<= maliste.size(); i++){
                System.out.println("           Nom " + maliste.get(i).getNom() + " Prenom " + maliste.get(i).getPrenom());
            }
        }else{
            System.out.println(" Vous n'avez aucun enfant!!! ");
        }

/*        for (Personne personne : maliste){
            System.out.println("           Nom "+personne.getNom()+" Prenom "+personne.getPrenom());
        }*/
    }

    public static void main(String[] args){
        testAddFemme();
        testAddFils();

    }
}
