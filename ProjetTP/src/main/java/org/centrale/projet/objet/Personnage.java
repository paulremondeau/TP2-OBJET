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
public class Personnage {
    private String nom;
    private int ptVie;
    private int ptMana;
    private int pourcentageAtt;
    private int pourcentagePar;
    private int pourcentageMag;
    private int pourcentageResistMag;
    private int degAtt;
    private int degMag;
    private int distAttMax;
    private Point2D pos;

    public Personnage(String nom, int ptV, int ptM, int pA, int pP, int pM, int rM, int dA, int dM, int distMax, Point2D pos) {
        this.nom = nom;
        this.ptVie = ptV;
        this.ptMana = ptM;
        this.pourcentageAtt = pA;
        this.pourcentagePar = pP;
        this.pourcentageMag = pM;
        this.pourcentageResistMag = rM;
        this.degAtt = dA;
        this.degMag = dM;
        this.distAttMax = distMax;
        this.pos = new Point2D(pos);
    }

    public Personnage(Personnage perso) {
        this.nom = perso.nom;
        this.ptVie = perso.ptVie;
        this.ptMana = perso.ptMana;
        this.pourcentageAtt = perso.pourcentageAtt;
        this.pourcentagePar = perso.pourcentagePar;
        this.pourcentageMag = perso.pourcentageMag;
        this.pourcentageResistMag = perso.pourcentageResistMag;
        this.degAtt = perso.degAtt;
        this.degMag = perso.degMag;
        this.distAttMax = perso.distAttMax;
        this.pos = new Point2D(perso.pos);        
    }

    public Personnage() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String value) {
        this.nom = value;
    }

    public void setPtVie(int value) {
        this.ptVie = value;
    }

    public int getPtVie() {
        return ptVie;
    }

    public void setPtMana(int value) {
        this.ptMana = value;
    }

    public int getPtMana() {
        return ptMana;
    }

    public void setPourcentageAtt(int value) {
        this.pourcentageAtt = value;
    }

    public int getPourcentageAtt() {
        return this.pourcentageAtt;
    }

    public void setPourcentagePar(int value) {
        this.pourcentagePar = value;
    }

    public int getPourcentagePar() {
        return this.pourcentagePar;
    }

    public void setPourcentageMag(int value) {
        this.pourcentageMag = value;
    }

    public int getPourcentageMag() {
        return this.pourcentageMag;
    }

    public void setPourcentageResistMag(int value) {
        this.pourcentageResistMag = value;
    }

    public int getPourcentageResistMag() {
        return pourcentageResistMag;
    }

    public int getDegAtt() {
        return this.degAtt;
    }

    public void setDegAtt(int value) {
        this.degAtt = value;
    }

    public void setDegMag(int value) {
        this.degMag = value;
    }

    public int getDegMag() {
        return this.degMag;
    }

    public void setDistAttMax(int value) {
        this.distAttMax = value;
    }

    public int getDistAttMax() {
        return this.distAttMax;
    }

    public void setPos(Point2D value) {
        this.pos = new Point2D(value);
    }

    public Point2D getPos() {
        return this.pos;
    }
    
    public void deplace() {
        // déplace le personnage à un endroit aléatoire
        Random generateurAleatoire = new Random();
        
        int entierAleaX = generateurAleatoire.nextInt(100);
        int entierAleaY = generateurAleatoire.nextInt(100);           
        Point2D position = new Point2D(entierAleaX, entierAleaY);
        
        this.setPos(position);
    }
    
    public void affiche() {
        System.out.println("Le personnage s'appelle "+this.nom + " et est situé à la position " + this.pos + ".");
        
        System.out.println(this.nom+" a "+ this.ptVie+" points de vie.");
        System.out.println(this.nom+" a "+ this.ptMana+" points de mana.");
        System.out.println(this.nom+" a "+ this.degAtt+" points de dégats physique.");
        System.out.println(this.nom+" a "+ this.degMag+" points de dégats magique.");
        System.out.println(this.nom+" a une portée de "+ this.distAttMax+".");
        System.out.println(this.nom+" a un pourcentage d'attaque de "+ this.pourcentageAtt +"%.");
        System.out.println(this.nom+" a "+this.pourcentagePar + "% de chance de parer." );
        System.out.println(this.nom+" a un pourcentage d'attaque magique de "+ this.pourcentageMag + "%.");
        System.out.println(this.nom+" a "+this.pourcentageResistMag + "% de résistance magique." );
    }
    
}
