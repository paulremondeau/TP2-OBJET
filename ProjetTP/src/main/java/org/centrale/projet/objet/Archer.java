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
    
    private Integer nbFleches;

    public Archer(String nom, Integer pV, Integer pA, Integer pP, Integer pM, Integer rM, Integer dA, Integer dM, Integer distMax, Point2D pos, Integer  nbF) {
        super(nom, pV, 0, pA, pP, pM, rM, dA, dM, distMax, pos);   // On sous-entend que l'archer a 0 points de mana
        this.nbFleches = nbF;
    }

    public Archer(Archer a) {
        super(a);
        this.nbFleches= a.nbFleches;
    }

    public Archer() {
    }

    public Integer getNbFleches() {
        return nbFleches;
    }

    public void setNbFleches(Integer value) {
        this.nbFleches = value;
    }
    
    
    
}
