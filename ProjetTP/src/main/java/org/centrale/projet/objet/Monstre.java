/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.projet.objet;

import java.util.Random;

/**
 *
 * @author bodet
 */
public class Monstre {
    
    private int ptVie;
    private int pourcentageAtt;
    private int pourcentagePar;
    private int degAtt;
    private Point2D pos;

    public Monstre(int pV, int pA, int pP, int dA, Point2D pos) {
        this.ptVie = pV;
        this.pourcentageAtt = pA;
        this.pourcentagePar = pP;
        this.degAtt = dA;
        this.pos = new Point2D(pos);
    }

    public Monstre(Monstre m) {
        this.ptVie = m.ptVie;
        this.pourcentageAtt = m.pourcentageAtt;
        this.pourcentagePar = m.pourcentagePar;
        this.degAtt = m.degAtt;
        this.pos = new Point2D(m.pos);
    }

    public Monstre() {
    }

    public int getPtVie() {
        return ptVie;
    }

    public void setPtVie(int value) {
        this.ptVie = ptVie;
    }

    public int getPourcentageAtt() {
        return pourcentageAtt;
    }

    public void setPourcentageAtt(int value) {
        this.pourcentageAtt = value;
    }

    public int getPourcentagePar() {
        return pourcentagePar;
    }

    public void setPourcentagePar(int value) {
        this.pourcentagePar = value;
    }
    
    public Integer getDegAtt() {
        return degAtt;
    }

    public void setDegAtt(int value) {
        this.degAtt = value;
    }
    
    public Point2D getPos() {
        return this.pos;
    }

    public void setPos(Point2D pos) {
        this.pos = new Point2D(pos);
    }
    
    public void deplace() {
        // déplace le monstre à un endroit aléatoire
        Random generateurAleatoire = new Random();
        
        int entierAleaX = generateurAleatoire.nextInt(100);
        int entierAleaY = generateurAleatoire.nextInt(100);           
        Point2D position = new Point2D(entierAleaX, entierAleaY);
        
        this.setPos(position);
    }
    
    public void affiche(){
        System.out.println("Le monstre a "+ this.ptVie+" points de vie et se situe en " + this.pos + ".");
        System.out.println("Le monstre a un pourcentage d'attaque de "+ this.pourcentageAtt +"%.");
        System.out.println("Le monstre a un pourcentage de parade de "+ this.pourcentageAtt +"%.");
        System.out.println("Le monstre a "+ this.degAtt +"points d'attaque.");
    }
}
