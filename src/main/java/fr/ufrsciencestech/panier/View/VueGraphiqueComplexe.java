/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.View;

import fr.ufrsciencestech.panier.Controler.Controleur;
import fr.ufrsciencestech.panier.Model.Panier;
import java.awt.BorderLayout;
import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author celine
 */
public class VueGraphiqueComplexe extends VueGraphiqueSimple {
    
    
    private JComboBox listeFruits;   
    private JTextArea affichagePanier;

    public JComboBox getListeFruits() {
        return listeFruits;
    }

    public void setListeFruits(JComboBox listeFruits) {
        this.listeFruits = listeFruits;
    }

    public JTextArea getAffichagePanier() {
        return affichagePanier;
    }

    public void setAffichagePanier(JTextArea affichagePanier) {
        this.affichagePanier = affichagePanier;
    }
    
    
    public VueGraphiqueComplexe(){
        super();
                
        listeFruits = new JComboBox();
        listeFruits.addItem("Orange");
        listeFruits.addItem("Ananas");

        affichagePanier = new JTextArea();
        affichagePanier.setText("Panier vide");
        
                
        
        
        add(listeFruits, BorderLayout.LINE_END);
        add(affichagePanier, BorderLayout.LINE_START);
        
        listeFruits.setName("ListeFruits");
        affichagePanier.setName("AffichagePanier");
        
    }
    
    @Override
    public void update(Observable m, Object o) {
        Panier p = (Panier) m;
        getAffiche().setText(((Integer)p.getFruits().size()).toString());
        getAffichagePanier().setText("Le panier a "+p.getPrix()+"€ de fruits \n"+p.toStringAffichage());
    }
    
    
    @Override
    public void addControleur(Controleur c) {
        getInc().addActionListener(c);
        getDec().addActionListener(c);
        getListeFruits().addActionListener(c);
    }
}
