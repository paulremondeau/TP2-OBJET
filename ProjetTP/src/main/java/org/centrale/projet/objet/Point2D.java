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
public class Point2D {
    
    private int x;
    private int y;
    
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }
    
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Point2D(Point2D p) {
        this.x = p.x;
        this.y = p.y;
    }
    
    public void setX(int value){
        this.x = value;
    }
    
    public void setY(int value){
        this.y = value;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void translate(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    
    public void affiche(){
        System.out.println("[" +  this.x + ";" + this.y + "]");
    }
    
}
