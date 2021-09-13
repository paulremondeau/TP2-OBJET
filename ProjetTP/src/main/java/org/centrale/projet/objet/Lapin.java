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
public class Lapin extends Monstre {
    // Hérite de la classe Monstre
    public Lapin(Integer pV, Integer pA, Integer pP, Integer dA, Point2D pos) {
        super(pV, pA, pP, dA, pos);
    }

    public Lapin(Monstre m) {
        super(m);
    }

    public Lapin() {
    }
    
        
    
}
