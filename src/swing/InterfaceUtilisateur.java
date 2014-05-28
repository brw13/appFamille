package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Created by majid on 28/01/14.
 */
public class InterfaceUtilisateur extends JMenuBar {

    public InterfaceUtilisateur() {

        // Listener générique qui affiche l'action du menu utilisé
        ActionListener afficherMenuListener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Elément de menu [" + event.getActionCommand()
                        + "] utilisé.");
            }
        };

        // Création du menu Fichier
        JMenu fichierMenu = new JMenu("Fichier");
        JMenuItem item = new JMenuItem("Nouveau", 'N');
        item.addActionListener(afficherMenuListener);
        fichierMenu.add(item);
        item = new JMenuItem("Ouvrir", 'O');
        item.addActionListener(afficherMenuListener);
        fichierMenu.add(item);
        item = new JMenuItem("Sauver", 'S');
        item.addActionListener(afficherMenuListener);
        fichierMenu.insertSeparator(1);
        fichierMenu.add(item);
        item = new JMenuItem("Quitter");
        item.addActionListener(afficherMenuListener);
        fichierMenu.add(item);

        // Création du menu Editer
        JMenu editerMenu = new JMenu("Editer");
        item = new JMenuItem("Copier");
        item.addActionListener(afficherMenuListener);
        item.setAccelerator(KeyStroke.getKeyStroke('C', Toolkit.getDefaultToolkit()
                .getMenuShortcutKeyMask(), false));
        editerMenu.add(item);
        item = new JMenuItem("Couper");
        item.addActionListener(afficherMenuListener);
        item.setAccelerator(KeyStroke.getKeyStroke('X', Toolkit.getDefaultToolkit()
                .getMenuShortcutKeyMask(), false));
        editerMenu.add(item);
        item = new JMenuItem("Coller");
        item.addActionListener(afficherMenuListener);
        item.setAccelerator(KeyStroke.getKeyStroke('V', Toolkit.getDefaultToolkit()
                .getMenuShortcutKeyMask(), false));
        editerMenu.add(item);

        // Création du menu Divers
        JMenu diversMenu = new JMenu("Divers");
        JMenu sousMenuDiver1 = new JMenu("Sous menu 1");

        item.addActionListener(afficherMenuListener);
        item = new JMenuItem("Sous menu 1 1");
        sousMenuDiver1.add(item);
        item.addActionListener(afficherMenuListener);
        JMenu sousMenuDivers2 = new JMenu("Sous menu 1 2");
        item = new JMenuItem("Sous menu 1 2 1");
        sousMenuDivers2.add(item);
        sousMenuDiver1.add(sousMenuDivers2);

        diversMenu.add(sousMenuDiver1);
        item = new JCheckBoxMenuItem("Validé");
        diversMenu.add(item);
        item.addActionListener(afficherMenuListener);
        diversMenu.addSeparator();
        ButtonGroup buttonGroup = new ButtonGroup();
        item = new JRadioButtonMenuItem("Cas 1");
        diversMenu.add(item);
        item.addActionListener(afficherMenuListener);
        buttonGroup.add(item);
        item = new JRadioButtonMenuItem("Cas 2");
        diversMenu.add(item);
        item.addActionListener(afficherMenuListener);
        buttonGroup.add(item);
        diversMenu.addSeparator();
        diversMenu.add(item = new JMenuItem("Autre",
                new ImageIcon("about_32.png")));
        item.addActionListener(afficherMenuListener);

        //menu ajouter une personne
        JMenu addPersonne = new JMenu("Ajouter une personne");
        ButtonGroup buttonGroup1 = new ButtonGroup();
        item = new JRadioButtonMenuItem("Homme");
        addPersonne.add(item);
        item.addActionListener(afficherMenuListener);
        buttonGroup.add(item);
        item = new JRadioButtonMenuItem("Femme");
        addPersonne.add(item);
        item.addActionListener(afficherMenuListener);
        buttonGroup.add(item);


        // ajout des menus à la barre de menus
        add(fichierMenu);
        add(editerMenu);
        add(diversMenu);
        add(addPersonne);
    }

    public static void main(String s[]) {
        JFrame frame = new JFrame("Test de menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setJMenuBar(new InterfaceUtilisateur());
        frame.setMinimumSize(new Dimension(450, 500));
        frame.pack();
        frame.setVisible(true);
    }


}
