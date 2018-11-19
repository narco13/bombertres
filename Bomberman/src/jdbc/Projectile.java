/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import static jdbc.Main.Adversaires;
import static jdbc.Main.Moi;
import static jdbc.Main.connexion;
import static jdbc.Main.hauteurPersos;
import static jdbc.Main.largeurPersos;
import outils.OutilsJDBC;

/**
 *
 * @author pdolle
 */
public class Projectile {
    
    private String type;
    private int x;
    private int y;
    private int vitessex;
    private int vitessey;
    private int hauteur;
    private int largeur;
    private int numero_lanceur;
    private long naissance;
    
    /*constructeur*/
    public Projectile(String type, int x, int y, int vitessex, int vitessey, int hauteur, int largeur, int numero_lanceur, long naissance) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.vitessex = vitessex;
        this.vitessey = vitessey;
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.numero_lanceur = numero_lanceur;
        this.naissance = naissance;
    }

    public Projectile() {
        
    }
    
    /*getters*/

    public String getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getVitessex() {
        return vitessex;
    }

    public int getVitessey() {
        return vitessey;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getNumero_lanceur() {
        return numero_lanceur;
    }

    public long getNaissance() {
        return naissance;
    }
    
    
    /*setter*/

    public void setType(String type) {
        this.type = type;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setVitessex(int vitessex) {
        this.vitessex = vitessex;
    }

    public void setVitessey(int vitessey) {
        this.vitessey = vitessey;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void setNumero_lanceur(int numero_lanceur) {
        this.numero_lanceur = numero_lanceur;
    }

    public void setNaissance(long naissance) {
        this.naissance = naissance;
    }

    
    
    
    public ArrayList<Joueur> SontEnRange(){
        ArrayList<Joueur> JoueursEnRange = new ArrayList<Joueur>();
        
        if (TestChoc(Moi)){
            JoueursEnRange.add(Moi);
        }
        if (TestChoc(Adversaires.joueur1)){
            JoueursEnRange.add(Moi);
        }
        if (TestChoc(Adversaires.joueur2)){
            JoueursEnRange.add(Moi);
        }
        if (TestChoc(Adversaires.joueur3)){
            JoueursEnRange.add(Moi);
        }
        
        return JoueursEnRange;
    }
    
    
    
    public boolean TestChoc(){
        boolean Choc = false;
        ArrayList<Joueur> listeJoueur=new ArrayList<>();
        listeJoueur.add(Adversaires.joueur1);
        listeJoueur.add(Adversaires.joueur2);
        listeJoueur.add(Adversaires.joueur3);
        
        //Génération des 4 points délimitant le rectangle du joueur, en commencant 
        //par en haut à gauche et en tournant dans le sens horaire
        for(Joueur joueur : listeJoueur){
            
        
            int x1=joueur.getX()-largeurPersos/2;
            int y1=joueur.getY()-hauteurPersos/2;
            int x2=joueur.getX()+largeurPersos/2;
            int y2=y1;
            int x3=x2;
            int y3=joueur.getY()+hauteurPersos/2;
            int x4=x1;
            int y4=y3;

            if ((this.x-this.largeur/2)<x1 & (this.x+this.largeur/2)>x1 & (this.y-this.hauteur/2)<y1 & (this.y+this.largeur/2)>y1){
                Choc = true;
            }
            if ((this.x-this.largeur/2)<x2 & (this.x+this.largeur/2)>x2 & (this.y-this.hauteur/2)<y2 & (this.y+this.largeur/2)>y2){
                Choc = true;
            }
            if ((this.x-this.largeur/2)<x3 & (this.x+this.largeur/2)>x3 & (this.y-this.hauteur/2)<y3 & (this.y+this.largeur/2)>y3){
                Choc = true;
            }
            if ((this.x-this.largeur/2)<x4 & (this.x+this.largeur/2)>x4 & (this.y-this.hauteur/2)<y4 & (this.y+this.largeur/2)>y4){
                Choc = true;
            }
        }
        
        return Choc;
    }
    
    public boolean TestChoc(Joueur joueur){
        boolean Choc = false;
        
        
        //Génération des 4 points délimitant le rectangle du joueur, en commencant 
        //par en haut à gauche et en tournant dans le sens horaire
        
            
        
            int x1=joueur.getX()-largeurPersos/2;
            int y1=joueur.getY()-hauteurPersos/2;
            int x2=joueur.getX()+largeurPersos/2;
            int y2=y1;
            int x3=x2;
            int y3=joueur.getY()+hauteurPersos/2;
            int x4=x1;
            int y4=y3;

            if ((this.x-this.largeur/2)<x1 & (this.x+this.largeur/2)>x1 & (this.y-this.hauteur/2)<y1 & (this.y+this.largeur/2)>y1){
                Choc = true;
            }
            if ((this.x-this.largeur/2)<x2 & (this.x+this.largeur/2)>x2 & (this.y-this.hauteur/2)<y2 & (this.y+this.largeur/2)>y2){
                Choc = true;
            }
            if ((this.x-this.largeur/2)<x3 & (this.x+this.largeur/2)>x3 & (this.y-this.hauteur/2)<y3 & (this.y+this.largeur/2)>y3){
                Choc = true;
            }
            if ((this.x-this.largeur/2)<x4 & (this.x+this.largeur/2)>x4 & (this.y-this.hauteur/2)<y4 & (this.y+this.largeur/2)>y4){
                Choc = true;
            }
        
        
        return Choc;
    }
    
    
    public void Ajouter(){
        try {

            PreparedStatement requete = connexion.prepareStatement("INSERT INTO projectiles VALUES ('"+this.getType()+"','"+this.x+"','"+this.y+"','"+this.naissance+"','"+this.vitessex+"','"+this.vitessey+"','"+this.hauteur+"','"+this.largeur+"','"+this.numero_lanceur+"')");
            
            
            requete.executeUpdate();

            requete.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean EstPerime(){
        boolean EstPerime =false;
        
        String type = this.getType();
        
        if (type == "Couteau" && System.currentTimeMillis()-25> this.getNaissance()){
            EstPerime = true;
        }
        
        
        return EstPerime;
    }
    
<<<<<<< HEAD

=======
>>>>>>> 179f87a65776ebe02ab2bc7f08ccde411bd2652a
    public void Exploser(){
        
        
        // Rajouter les actions à faire lors du déclenchement d'une munition ici
        
        
    }
    
    public boolean Avancer(){
        
        boolean Aexpire=false;
        
        this.x += this.vitessex;
        this.y += this.vitessey;
        
        
        if (this.EstPerime()){
            Aexpire = true;
        }
        if (this.TestChoc()){
            Aexpire =true;
            this.Exploser();
        }
        
        
        return Aexpire;
    }
<<<<<<< HEAD

=======
    
>>>>>>> 179f87a65776ebe02ab2bc7f08ccde411bd2652a
    public Projectile EstArme(Projectile proj, Joueur joueur, String Arme){
        if (Arme == "couteau"){
        proj = new Projectile("couteau",joueur.getX(),joueur.getY(),0,0,10,10,joueur.getId(),System.currentTimeMillis());
        }
        return proj;
    }
   
<<<<<<< HEAD

=======
>>>>>>> 179f87a65776ebe02ab2bc7f08ccde411bd2652a
}

    
/*if(evt.getKeyCode() == evt.VK_RIGHT && System.currentTimeMillis() - Moi.getDerniereAttaque() > 1000){
            Moi.setDerniereAttaque(System.currentTimeMillis());
            Projectile proj = new Projectile();
            proj.estCouteau(proj, Moi);
            Projectiles.add(proj);
            System.out.println("Coup de couteau");
            System.out.println(System.currentTimeMillis());
            Moi.setDirection(2);
        }*/
