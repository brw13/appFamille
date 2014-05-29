package Tests;

import brw.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by majid on 28/05/14.
 */
public class TestUtilities {
    Pere pere = new Pere("DIALLO", "Bora_BAABA");
    Mere mere = new Mere("DIALLO", "Neene_Djaara");
    Homme homme = new Homme("DIALLO", "Homme_Marie");
    Femme femme = new Femme("DIALLO", "Femme_Mariee");

    @Test
    public void testPereAddEnfants(){

        pere.setEnfants(new Fille("DIALLO", "Djiwo_Baaba"));
        pere.setEnfants(new Fils("DIALLO", "Souka_Baaba"));

        Assert.assertTrue("Ajout d'enfant reussie", true);
    }

    @Test
    public void testMereAddEnfants(){

        mere.setEnfants(new Fille("DIALLO", "Djiwo_Nene"));
        mere.setEnfants(new Fils("DIALLO", "Souka_Nene"));
        mere.setEnfants(new Fils("DIALLO", "Souka_Nene13"));

        Assert.assertTrue("Ajout d'enfant reussie", true);
    }

    @Test
    public void testHommeAddFemme(){

        homme.addFemme(femme);
        System.out.println("Monsieur " + homme.getPrenom() + " s'est marier avec Madame " + femme.getPrenom());

        Assert.assertTrue("Ajout de la femme reussi", true);
    }


    @Test
    public void testGetEnfants(){
        testPereAddEnfants();
        testMereAddEnfants();

        System.out.println("Monsieur "+pere.getPrenom()+" a "+pere.getEnfants().size()+" enfants");
        System.out.println("Madame "+mere.getPrenom()+" a "+mere.getEnfants().size()+" enfants");
    }
}
