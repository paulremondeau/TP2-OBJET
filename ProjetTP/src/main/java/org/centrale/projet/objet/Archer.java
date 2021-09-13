/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

/**
 *
 * @author bodet
 */
public class Archer extends Personnage {
    // Hérite de la classe Personnage
    
    private int nbFleches;

    public Archer(String nom, int pV, int pA, int pP, int pM, int rM, int dA, int dM, int distMax, Point2D pos, int  nbF) {
        super(nom, pV, 0, pA, pP, pM, rM, dA, dM, distMax, pos);   // On sous-entend que l'archer a 0 points de mana
        this.nbFleches = nbF;
    }

    public Archer(Archer a) {
        super(a);
        this.nbFleches= a.nbFleches;
    }

    public Archer() {
        super();
    }

    public int getNbFleches() {
        return nbFleches;
    }

    public void setNbFleches(int value) {
        this.nbFleches = value;
    }
    
    public void affiche(){
        super.affiche();
        System.out.println(this.getNom() + " a " + this.nbFleches + " flèches.");
    }
    
    
    
}
