package Vues;

import Entities.Pompier;
import Entities.PompierPro;
import Entities.PompierVolontaire;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class FrmMenu extends  JFrame{
    private JPanel pnlRoot;

    public FrmMenu()
    {
        this.setTitle("Pompier");
        this.pack();
        this.setContentPane(pnlRoot);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);


        Pompier pompier = new Pompier(1,"Pierre",1452.25);
        PompierPro pompierPro = new PompierPro(2,"Lie",784.0,400);
        PompierVolontaire pompierVolontaire = new PompierVolontaire(3,"Aline",450.0,12,20.0);

        ArrayList <Pompier> lesPompiers = new ArrayList<>();
        lesPompiers.add(pompier);
        lesPompiers.add(pompierPro);
        lesPompiers.add(pompierVolontaire);

        Collections.sort(lesPompiers);


        for (Pompier pom : lesPompiers)
        {
            JOptionPane.showMessageDialog(null,pom.getInfo());
        }

    }
}
