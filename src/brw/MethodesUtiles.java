package brw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by majid on 19/01/14.
 */
public class MethodesUtiles {

    //Un parent ajoute son fils
    public static void addFils (Personne pers, Fils f){
        List enfants = new ArrayList<Personne>();
        try {
            if (pers instanceof  Pere){//Un pere ajoute un fils
                //On recupere la liste des enfants du pere
                enfants = ((Pere) pers).getEnfants();
                f.setPere((Pere) pers);
                if (enfants.contains(f) == false){//verification si il n'est pas deja ajouter
                    try {
                        enfants.add(f);
                    } catch (Exception e) {
                        System.out.println("erreur d'ajout du fils pour le pere");
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("Cette personne est deja ajouter dans la la liste de vos enfants");
                    return;
                }
            }else if (pers instanceof Mere){//Une mère ajoute un fils
                enfants = ((Mere) pers).getEnfants();
                f.setMere((Mere) pers);
                if (enfants.contains(f) == false){//verification si il n'est pas deja ajouter
                    try {
                        enfants.add(f);
                    } catch (Exception e) {
                        System.out.println("Erruer d'ajout du fils pou la mère");
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("Cette personnes est déja dans votre liste d'enfant");
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println(" Cette personne ne peut pas ajouter de fils ");
            e.printStackTrace();
        }
    }

    //Un parent ajoute sa fille
    public static void addFille (Personne pers, Fille fille){
        List enfants;
        try {
            if (pers instanceof  Pere){//Un pere ajoute un fils
                //On recupere la liste des enfants du pere
                enfants = ((Pere) pers).getEnfants();
                fille.setPere((Pere) pers);
                if (enfants.contains(fille) == false){//verification si il n'est pas deja ajouter
                    try {
                        enfants.add(fille);
                    } catch (Exception e) {
                        System.out.println("erreur d'ajout de la fille pour le pere");
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("Cette personne est deja ajouter dans la la liste de vos enfants");
                    return;
                }
            }else if (pers instanceof Mere){//Une mère ajoute un fils
                enfants = (((Mere) pers).getEnfants());
                fille.setMere((Mere) pers);
                if (enfants.contains(fille) == false){//verification si il n'est pas deja ajouter
                    try {
                        enfants.add(fille);
                    } catch (Exception e) {
                        System.out.println("Erruer d'ajout de la fille pour la mère");
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("Cette personnes est déja dans votre liste d'enfant");
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println(" Cette personne ne peut pas ajouter de fille ");
            e.printStackTrace();
        }
    }

    public static void addFrere (Personne pers, Homme frere){
        List frereSoeur = new ArrayList<Personne>();
        frereSoeur = pers.getPere().getEnfants();
        try {
            frereSoeur.add((Homme)frere);
        } catch (Exception e) {
            System.out.println("Erreur d'ajout du frere");
            e.printStackTrace();
        }
    }

    public static void addSoeur (Personne pers, Femme soeur){
        List frereSoeur = new ArrayList<Personne>();
        frereSoeur = pers.getPere().getEnfants();
        try {
            frereSoeur.add((Femme)soeur);
        } catch (Exception e) {
            System.out.println("Erreur d'ajout de la soeur");
            e.printStackTrace();
        }
    }

}
