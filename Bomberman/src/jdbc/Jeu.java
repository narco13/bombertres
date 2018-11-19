/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import javax.imageio.ImageIO;
import static jdbc.Main.Adversaires;

/**
 *
 * @author pdolle
 */

/**
 * Exemple de jeu
 *
 * @author guillaume.laurent
 */
public class Jeu {

    private BufferedImage nyancat, fond, spritegauche1, spritegauche2, spritegauche3,
            spritegauche4, spritegauche5, spritegauche6, spritegauche7, spritegauche8,
            spritegauche9, spritegauche10, spritedroite1, spritedroite2, spritedroite3,
            spritedroite4, spritedroite5, spritedroite6, spritedroite7, spritedroite8,
            spritedroite9, spritedroite10, spritebas1, spritebas2, spritebas3, spritebas4,
            spritebas5, spritebas6, spritebas7, spritebas8, spritebas9, spritebas10, mur,
            spritehaut1, spritehaut2, spritehaut3, spritehaut4, spritehaut5, spritehaut6,
            spritehaut7, spritehaut8, spritehaut9, spritehaut10;
    private Joueur Moi;

    public Jeu(Joueur moi) {
        try {
            this.fond = ImageIO.read(new File("fond.jpg"));
            this.nyancat = ImageIO.read(new File("nyancat.png"));
            this.spritegauche1 = ImageIO.read(new File("ZeldaGaucheStep1PetitTr.png"));
            this.spritedroite1 = ImageIO.read(new File("ZeldaDroiteStep1PetitTr.png"));
            this.spritehaut1 = ImageIO.read(new File("ZeldaHautStep1PetitTr.png"));
            this.spritebas1 = ImageIO.read(new File("ZeldaBasStep1PetitTr.png")); 
            this.spritegauche2 = ImageIO.read(new File("ZeldaGaucheStep2PetitTr.png"));
            this.spritedroite2 = ImageIO.read(new File("ZeldaDroiteStep2PetitTr.png"));
            this.spritehaut2 = ImageIO.read(new File("ZeldaHautStep2PetitTr.png"));
            this.spritebas2 = ImageIO.read(new File("ZeldaBasStep2PetitTr.png"));
            this.spritegauche3 = ImageIO.read(new File("ZeldaGaucheStep3PetitTr.png"));
            this.spritedroite3 = ImageIO.read(new File("ZeldaDroiteStep3PetitTr.png"));
            this.spritehaut3 = ImageIO.read(new File("ZeldaHautStep3PetitTr.png"));
            this.spritebas3 = ImageIO.read(new File("ZeldaBasStep3PetitTr.png"));
            this.spritegauche4 = ImageIO.read(new File("ZeldaGaucheStep4PetitTr.png"));
            this.spritedroite4 = ImageIO.read(new File("ZeldaDroiteStep4PetitTr.png"));
            this.spritehaut4 = ImageIO.read(new File("ZeldaHautStep4PetitTr.png"));
            this.spritebas4 = ImageIO.read(new File("ZeldaBasStep4PetitTr.png")); 
            this.spritegauche5 = ImageIO.read(new File("ZeldaGaucheStep5PetitTr.png"));
            this.spritedroite5 = ImageIO.read(new File("ZeldaDroiteStep5PetitTr.png"));
            this.spritehaut5 = ImageIO.read(new File("ZeldaHautStep5PetitTr.png"));
            this.spritebas5 = ImageIO.read(new File("ZeldaBasStep5PetitTr.png"));
            this.spritegauche6 = ImageIO.read(new File("ZeldaGaucheStep6PetitTr.png"));
            this.spritedroite6 = ImageIO.read(new File("ZeldaDroiteStep6PetitTr.png"));
            this.spritehaut6 = ImageIO.read(new File("ZeldaHautStep6PetitTr.png"));
            this.spritebas6 = ImageIO.read(new File("ZeldaBasStep6PetitTr.png"));
            this.spritegauche7 = ImageIO.read(new File("ZeldaGaucheStep7PetitTr.png"));
            this.spritedroite7 = ImageIO.read(new File("ZeldaDroiteStep7PetitTr.png"));
            this.spritehaut7 = ImageIO.read(new File("ZeldaHautStep7PetitTr.png"));
            this.spritebas7 = ImageIO.read(new File("ZeldaBasStep7PetitTr.png")); 
            this.spritegauche8 = ImageIO.read(new File("ZeldaGaucheStep8PetitTr.png"));
            this.spritedroite8 = ImageIO.read(new File("ZeldaDroiteStep8PetitTr.png"));
            this.spritehaut8 = ImageIO.read(new File("ZeldaHautStep8PetitTr.png"));
            this.spritebas8 = ImageIO.read(new File("ZeldaBasStep8PetitTr.png"));
            this.spritegauche9 = ImageIO.read(new File("ZeldaGaucheStep9PetitTr.png"));
            this.spritedroite9 = ImageIO.read(new File("ZeldaDroiteStep9PetitTr.png"));
            this.spritehaut9 = ImageIO.read(new File("ZeldaHautStep9PetitTr.png"));
            this.spritebas9 = ImageIO.read(new File("ZeldaBasStep9PetitTr.png"));
            this.spritegauche10 = ImageIO.read(new File("ZeldaGaucheStep10PetitTr.png"));
            this.spritedroite10 = ImageIO.read(new File("ZeldaDroiteStep10PetitTr.png"));
            this.spritehaut10 = ImageIO.read(new File("ZeldaHautStep10PetitTr.png"));
            this.spritebas10 = ImageIO.read(new File("ZeldaBasStep10PetitTr.png"));
            this.mur = ImageIO.read(new File("mur.jpg"));
            this.Moi= moi;
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Jeu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Update(Joueur Moi){
        this.Moi = Moi;
    }


    public void Afficher(Graphics2D contexte) {
        int x = this.Moi.getX();
        int y = this.Moi.getY();
        //dessiner fond
        for (int i=0; i<=20; i++){
            for (int j=0; j<=20; j++){
                contexte.drawImage(this.fond, 0+30*i, 0+30*j, null);
            }
        }
        // dessiner un joueur
        this.AfficherJoueur(contexte,Moi);
        this.AfficherJoueur(contexte,Adversaires.joueur1);
        this.AfficherJoueur(contexte,Adversaires.joueur2);
        this.AfficherJoueur(contexte,Adversaires.joueur3);

        //dessiner mur
         for (int i=0; i<=20; i++){
        
                contexte.drawImage(this.mur, 0+30*i, 0, null);
            
        }
         for (int i=0; i<=20; i++){
        
                contexte.drawImage(this.mur, 0+30*i, 350, null);
            
        }
         for (int i=0; i<=20; i++){
        
                contexte.drawImage(this.mur, 0, 0+30*i, null);
            
        }
         for (int i=0; i<=20; i++){
        
                contexte.drawImage(this.mur, 577, 0+30*i, null);
            
        }
    }
     public void AfficherJoueur(Graphics2D contexte, Joueur j1) {
        int x = j1.getX();
        int y = j1.getY();
        int id = j1.getId();
        
        //contexte.drawImage(this.spritebas1, x, y, null);
        if (id==1){
        if (j1.getDirection()==4){    
                if (((x<15)&&(x>0))|((x>150)&&(x<165))|((x<315)&&(x>300))|((x>450)&&(x<465))){
                    contexte.drawImage(this.spritegauche1, x, y, null);
                }
                if (((x<30)&&(x>15))|((x>165)&&(x<180))|((x<330)&&(x>315))|((x>465)&&(x<480))){
                    contexte.drawImage(this.spritegauche2, x, y, null);
                }
                if (((x<45)&&(x>30))|((x>180)&&(x<195))|((x<345)&&(x>330))|((x>480)&&(x<495))){
                    contexte.drawImage(this.spritegauche3, x, y, null);
                }
                if (((x<60)&&(x>45))|((x>195)&&(x<210))|((x<360)&&(x>345))|((x>495)&&(x<510))){
                    contexte.drawImage(this.spritegauche4, x, y, null);
                }
                if (((x<75)&&(x>60))|((x>210)&&(x<225))|((x<375)&&(x>360))|((x>510)&&(x<525))){
                    contexte.drawImage(this.spritegauche5, x, y, null);
                }
                if (((x<90)&&(x>75))|((x>225)&&(x<240))|((x<390)&&(x>375))|((x>525)&&(x<540))){
                    contexte.drawImage(this.spritegauche6, x, y, null);
                }
                if (((x<105)&&(x>90))|((x>240)&&(x<255))|((x<405)&&(x>390))|((x>540)&&(x<555))){
                    contexte.drawImage(this.spritegauche7, x, y, null);
                }
                if (((x<120)&&(x>105))|((x>255)&&(x<270))|((x<420)&&(x>405))|((x>555)&&(x<570))){
                    contexte.drawImage(this.spritegauche8, x, y, null);
                }
                if (((x<135)&&(x>120))|((x>270)&&(x<285))|((x<435)&&(x>420))|((x>570)&&(x<585))){
                    contexte.drawImage(this.spritegauche9, x, y, null);
                }
                if (((x<150)&&(x>135))|((x>285)&&(x<300))|((x<450)&&(x>435))|((x>585)&&(x<600))){
                    contexte.drawImage(this.spritegauche10, x, y, null);
                }
        
        }
        
        if (j1.getDirection()==2){    
                if (((x<15)&&(x>0))|((x>150)&&(x<165))|((x<315)&&(x>300))|((x>450)&&(x<465))){
                    contexte.drawImage(this.spritedroite1, x, y, null);
                }
                if (((x<30)&&(x>15))|((x>165)&&(x<180))|((x<330)&&(x>315))|((x>465)&&(x<480))){
                    contexte.drawImage(this.spritedroite2, x, y, null);
                }
                if (((x<45)&&(x>30))|((x>180)&&(x<195))|((x<345)&&(x>330))|((x>480)&&(x<495))){
                    contexte.drawImage(this.spritedroite3, x, y, null);
                }
                if (((x<60)&&(x>45))|((x>195)&&(x<210))|((x<360)&&(x>345))|((x>495)&&(x<510))){
                    contexte.drawImage(this.spritedroite4, x, y, null);
                }
                if (((x<75)&&(x>60))|((x>210)&&(x<225))|((x<375)&&(x>360))|((x>510)&&(x<525))){
                    contexte.drawImage(this.spritedroite5, x, y, null);
                }
                if (((x<90)&&(x>75))|((x>225)&&(x<240))|((x<390)&&(x>375))|((x>525)&&(x<540))){
                    contexte.drawImage(this.spritedroite6, x, y, null);
                }
                if (((x<105)&&(x>90))|((x>240)&&(x<255))|((x<405)&&(x>390))|((x>540)&&(x<555))){
                    contexte.drawImage(this.spritedroite7, x, y, null);
                }
                if (((x<120)&&(x>105))|((x>255)&&(x<270))|((x<420)&&(x>405))|((x>555)&&(x<570))){
                    contexte.drawImage(this.spritedroite8, x, y, null);
                }
                if (((x<135)&&(x>120))|((x>270)&&(x<285))|((x<435)&&(x>420))|((x>570)&&(x<585))){
                    contexte.drawImage(this.spritedroite9, x, y, null);
                }
                if (((x<150)&&(x>135))|((x>285)&&(x<300))|((x<450)&&(x>435))|((x>585)&&(x<600))){
                    contexte.drawImage(this.spritedroite10, x, y, null);
                }
        }
        if (j1.getDirection()==1){    
                if (((y<15)&&(y>0))|((y>150)&&(y<165))|((y<315)&&(y>300))|((y>450)&&(y<465))){
                    contexte.drawImage(this.spritebas1, x, y, null);
                }
                if (((y<30)&&(y>15))|((y>165)&&(y<180))|((y<330)&&(y>315))|((y>465)&&(y<480))){
                    contexte.drawImage(this.spritebas2, x, y, null);
                }
                if (((y<45)&&(y>30))|((y>180)&&(y<195))|((y<345)&&(y>330))|((y>480)&&(y<495))){
                    contexte.drawImage(this.spritebas3, x, y, null);
                }
                if (((y<60)&&(y>45))|((y>195)&&(y<210))|((y<360)&&(y>345))|((y>495)&&(y<510))){
                    contexte.drawImage(this.spritebas4, x, y, null);
                }
                if (((y<75)&&(y>60))|((y>210)&&(y<225))|((y<375)&&(y>360))|((y>510)&&(y<525))){
                    contexte.drawImage(this.spritebas5, x, y, null);
                }
                if (((y<90)&&(y>75))|((y>225)&&(y<240))|((y<390)&&(y>375))|((y>525)&&(y<540))){
                    contexte.drawImage(this.spritebas6, x, y, null);
                }
                if (((y<105)&&(y>90))|((y>240)&&(y<255))|((y<405)&&(y>390))|((y>540)&&(y<555))){
                    contexte.drawImage(this.spritebas7, x, y, null);
                }
                if (((y<120)&&(y>105))|((y>255)&&(y<270))|((y<420)&&(y>405))|((y>555)&&(y<570))){
                    contexte.drawImage(this.spritebas8, x, y, null);
                }
                if (((y<135)&&(y>120))|((y>270)&&(y<285))|((y<435)&&(y>420))|((y>570)&&(y<585))){
                    contexte.drawImage(this.spritebas9, x, y, null);
                }
                if (((y<150)&&(y>135))|((y>285)&&(y<300))|((y<450)&&(y>435))|((y>585)&&(y<600))){
                    contexte.drawImage(this.spritebas10, x, y, null);
                }
        }
        if (j1.getDirection()==3){    
                if (((y<15)&&(y>0))|((y>150)&&(y<165))|((y<315)&&(y>300))|((y>450)&&(y<465))){
                    contexte.drawImage(this.spritehaut1, x, y, null);
                }
                if (((y<30)&&(y>15))|((y>165)&&(y<180))|((y<330)&&(y>315))|((y>465)&&(y<480))){
                    contexte.drawImage(this.spritehaut2, x, y, null);
                }
                if (((y<45)&&(y>30))|((y>180)&&(y<195))|((y<345)&&(y>330))|((y>480)&&(y<495))){
                    contexte.drawImage(this.spritehaut3, x, y, null);
                }
                if (((y<60)&&(y>45))|((y>195)&&(y<210))|((y<360)&&(y>345))|((y>495)&&(y<510))){
                    contexte.drawImage(this.spritehaut4, x, y, null);
                }
                if (((y<75)&&(y>60))|((y>210)&&(y<225))|((y<375)&&(y>360))|((y>510)&&(y<525))){
                    contexte.drawImage(this.spritehaut5, x, y, null);
                }
                if (((y<90)&&(y>75))|((y>225)&&(y<240))|((y<390)&&(y>375))|((y>525)&&(y<540))){
                    contexte.drawImage(this.spritehaut6, x, y, null);
                }
                if (((y<105)&&(y>90))|((y>240)&&(y<255))|((y<405)&&(y>390))|((y>540)&&(y<555))){
                    contexte.drawImage(this.spritehaut7, x, y, null);
                }
                if (((y<120)&&(y>105))|((y>255)&&(y<270))|((y<420)&&(y>405))|((y>555)&&(y<570))){
                    contexte.drawImage(this.spritehaut8, x, y, null);
                }
                if (((y<135)&&(y>120))|((y>270)&&(y<285))|((y<435)&&(y>420))|((y>570)&&(y<585))){
                    contexte.drawImage(this.spritehaut9, x, y, null);
                }
                if (((y<150)&&(y>135))|((y>285)&&(y<300))|((y<450)&&(y>435))|((y>585)&&(y<600))){
                    contexte.drawImage(this.spritehaut10, x, y, null);
                }
        }
        }
        if (id==2){
            if (j1.getDirection()==4){    
                if (((x<15)&&(x>0))|((x>150)&&(x<165))|((x<315)&&(x>300))|((x>450)&&(x<465))){
                    contexte.drawImage(this.spritegauche1, x, y, null);
                }
                if (((x<30)&&(x>15))|((x>165)&&(x<180))|((x<330)&&(x>315))|((x>465)&&(x<480))){
                    contexte.drawImage(this.spritegauche2, x, y, null);
                }
                if (((x<45)&&(x>30))|((x>180)&&(x<195))|((x<345)&&(x>330))|((x>480)&&(x<495))){
                    contexte.drawImage(this.spritegauche3, x, y, null);
                }
                if (((x<60)&&(x>45))|((x>195)&&(x<210))|((x<360)&&(x>345))|((x>495)&&(x<510))){
                    contexte.drawImage(this.spritegauche4, x, y, null);
                }
                if (((x<75)&&(x>60))|((x>210)&&(x<225))|((x<375)&&(x>360))|((x>510)&&(x<525))){
                    contexte.drawImage(this.spritegauche5, x, y, null);
                }
                if (((x<90)&&(x>75))|((x>225)&&(x<240))|((x<390)&&(x>375))|((x>525)&&(x<540))){
                    contexte.drawImage(this.spritegauche6, x, y, null);
                }
                if (((x<105)&&(x>90))|((x>240)&&(x<255))|((x<405)&&(x>390))|((x>540)&&(x<555))){
                    contexte.drawImage(this.spritegauche7, x, y, null);
                }
                if (((x<120)&&(x>105))|((x>255)&&(x<270))|((x<420)&&(x>405))|((x>555)&&(x<570))){
                    contexte.drawImage(this.spritegauche8, x, y, null);
                }
                if (((x<135)&&(x>120))|((x>270)&&(x<285))|((x<435)&&(x>420))|((x>570)&&(x<585))){
                    contexte.drawImage(this.spritegauche9, x, y, null);
                }
                if (((x<150)&&(x>135))|((x>285)&&(x<300))|((x<450)&&(x>435))|((x>585)&&(x<600))){
                    contexte.drawImage(this.spritegauche10, x, y, null);
                }
        
        }
        
        if (j1.getDirection()==2){    
                if (((x<15)&&(x>0))|((x>150)&&(x<165))|((x<315)&&(x>300))|((x>450)&&(x<465))){
                    contexte.drawImage(this.spritedroite1, x, y, null);
                }
                if (((x<30)&&(x>15))|((x>165)&&(x<180))|((x<330)&&(x>315))|((x>465)&&(x<480))){
                    contexte.drawImage(this.spritedroite2, x, y, null);
                }
                if (((x<45)&&(x>30))|((x>180)&&(x<195))|((x<345)&&(x>330))|((x>480)&&(x<495))){
                    contexte.drawImage(this.spritedroite3, x, y, null);
                }
                if (((x<60)&&(x>45))|((x>195)&&(x<210))|((x<360)&&(x>345))|((x>495)&&(x<510))){
                    contexte.drawImage(this.spritedroite4, x, y, null);
                }
                if (((x<75)&&(x>60))|((x>210)&&(x<225))|((x<375)&&(x>360))|((x>510)&&(x<525))){
                    contexte.drawImage(this.spritedroite5, x, y, null);
                }
                if (((x<90)&&(x>75))|((x>225)&&(x<240))|((x<390)&&(x>375))|((x>525)&&(x<540))){
                    contexte.drawImage(this.spritedroite6, x, y, null);
                }
                if (((x<105)&&(x>90))|((x>240)&&(x<255))|((x<405)&&(x>390))|((x>540)&&(x<555))){
                    contexte.drawImage(this.spritedroite7, x, y, null);
                }
                if (((x<120)&&(x>105))|((x>255)&&(x<270))|((x<420)&&(x>405))|((x>555)&&(x<570))){
                    contexte.drawImage(this.spritedroite8, x, y, null);
                }
                if (((x<135)&&(x>120))|((x>270)&&(x<285))|((x<435)&&(x>420))|((x>570)&&(x<585))){
                    contexte.drawImage(this.spritedroite9, x, y, null);
                }
                if (((x<150)&&(x>135))|((x>285)&&(x<300))|((x<450)&&(x>435))|((x>585)&&(x<600))){
                    contexte.drawImage(this.spritedroite10, x, y, null);
                }
        }
        if (j1.getDirection()==1){    
                if (((y<15)&&(y>0))|((y>150)&&(y<165))|((y<315)&&(y>300))|((y>450)&&(y<465))){
                    contexte.drawImage(this.spritebas1, x, y, null);
                }
                if (((y<30)&&(y>15))|((y>165)&&(y<180))|((y<330)&&(y>315))|((y>465)&&(y<480))){
                    contexte.drawImage(this.spritebas2, x, y, null);
                }
                if (((y<45)&&(y>30))|((y>180)&&(y<195))|((y<345)&&(y>330))|((y>480)&&(y<495))){
                    contexte.drawImage(this.spritebas3, x, y, null);
                }
                if (((y<60)&&(y>45))|((y>195)&&(y<210))|((y<360)&&(y>345))|((y>495)&&(y<510))){
                    contexte.drawImage(this.spritebas4, x, y, null);
                }
                if (((y<75)&&(y>60))|((y>210)&&(y<225))|((y<375)&&(y>360))|((y>510)&&(y<525))){
                    contexte.drawImage(this.spritebas5, x, y, null);
                }
                if (((y<90)&&(y>75))|((y>225)&&(y<240))|((y<390)&&(y>375))|((y>525)&&(y<540))){
                    contexte.drawImage(this.spritebas6, x, y, null);
                }
                if (((y<105)&&(y>90))|((y>240)&&(y<255))|((y<405)&&(y>390))|((y>540)&&(y<555))){
                    contexte.drawImage(this.spritebas7, x, y, null);
                }
                if (((y<120)&&(y>105))|((y>255)&&(y<270))|((y<420)&&(y>405))|((y>555)&&(y<570))){
                    contexte.drawImage(this.spritebas8, x, y, null);
                }
                if (((y<135)&&(y>120))|((y>270)&&(y<285))|((y<435)&&(y>420))|((y>570)&&(y<585))){
                    contexte.drawImage(this.spritebas9, x, y, null);
                }
                if (((y<150)&&(y>135))|((y>285)&&(y<300))|((y<450)&&(y>435))|((y>585)&&(y<600))){
                    contexte.drawImage(this.spritebas10, x, y, null);
                }
        }
        if (j1.getDirection()==3){    
                if (((y<15)&&(y>0))|((y>150)&&(y<165))|((y<315)&&(y>300))|((y>450)&&(y<465))){
                    contexte.drawImage(this.spritehaut1, x, y, null);
                }
                if (((y<30)&&(y>15))|((y>165)&&(y<180))|((y<330)&&(y>315))|((y>465)&&(y<480))){
                    contexte.drawImage(this.spritehaut2, x, y, null);
                }
                if (((y<45)&&(y>30))|((y>180)&&(y<195))|((y<345)&&(y>330))|((y>480)&&(y<495))){
                    contexte.drawImage(this.spritehaut3, x, y, null);
                }
                if (((y<60)&&(y>45))|((y>195)&&(y<210))|((y<360)&&(y>345))|((y>495)&&(y<510))){
                    contexte.drawImage(this.spritehaut4, x, y, null);
                }
                if (((y<75)&&(y>60))|((y>210)&&(y<225))|((y<375)&&(y>360))|((y>510)&&(y<525))){
                    contexte.drawImage(this.spritehaut5, x, y, null);
                }
                if (((y<90)&&(y>75))|((y>225)&&(y<240))|((y<390)&&(y>375))|((y>525)&&(y<540))){
                    contexte.drawImage(this.spritehaut6, x, y, null);
                }
                if (((y<105)&&(y>90))|((y>240)&&(y<255))|((y<405)&&(y>390))|((y>540)&&(y<555))){
                    contexte.drawImage(this.spritehaut7, x, y, null);
                }
                if (((y<120)&&(y>105))|((y>255)&&(y<270))|((y<420)&&(y>405))|((y>555)&&(y<570))){
                    contexte.drawImage(this.spritehaut8, x, y, null);
                }
                if (((y<135)&&(y>120))|((y>270)&&(y<285))|((y<435)&&(y>420))|((y>570)&&(y<585))){
                    contexte.drawImage(this.spritehaut9, x, y, null);
                }
                if (((y<150)&&(y>135))|((y>285)&&(y<300))|((y<450)&&(y>435))|((y>585)&&(y<600))){
                    contexte.drawImage(this.spritehaut10, x, y, null);
                }
        }
        }
        if (id==3){
            if (j1.getDirection()==4){    
                if (((x<15)&&(x>0))|((x>150)&&(x<165))|((x<315)&&(x>300))|((x>450)&&(x<465))){
                    contexte.drawImage(this.spritegauche1, x, y, null);
                }
                if (((x<30)&&(x>15))|((x>165)&&(x<180))|((x<330)&&(x>315))|((x>465)&&(x<480))){
                    contexte.drawImage(this.spritegauche2, x, y, null);
                }
                if (((x<45)&&(x>30))|((x>180)&&(x<195))|((x<345)&&(x>330))|((x>480)&&(x<495))){
                    contexte.drawImage(this.spritegauche3, x, y, null);
                }
                if (((x<60)&&(x>45))|((x>195)&&(x<210))|((x<360)&&(x>345))|((x>495)&&(x<510))){
                    contexte.drawImage(this.spritegauche4, x, y, null);
                }
                if (((x<75)&&(x>60))|((x>210)&&(x<225))|((x<375)&&(x>360))|((x>510)&&(x<525))){
                    contexte.drawImage(this.spritegauche5, x, y, null);
                }
                if (((x<90)&&(x>75))|((x>225)&&(x<240))|((x<390)&&(x>375))|((x>525)&&(x<540))){
                    contexte.drawImage(this.spritegauche6, x, y, null);
                }
                if (((x<105)&&(x>90))|((x>240)&&(x<255))|((x<405)&&(x>390))|((x>540)&&(x<555))){
                    contexte.drawImage(this.spritegauche7, x, y, null);
                }
                if (((x<120)&&(x>105))|((x>255)&&(x<270))|((x<420)&&(x>405))|((x>555)&&(x<570))){
                    contexte.drawImage(this.spritegauche8, x, y, null);
                }
                if (((x<135)&&(x>120))|((x>270)&&(x<285))|((x<435)&&(x>420))|((x>570)&&(x<585))){
                    contexte.drawImage(this.spritegauche9, x, y, null);
                }
                if (((x<150)&&(x>135))|((x>285)&&(x<300))|((x<450)&&(x>435))|((x>585)&&(x<600))){
                    contexte.drawImage(this.spritegauche10, x, y, null);
                }
        
        }
        
        if (j1.getDirection()==2){    
                if (((x<15)&&(x>0))|((x>150)&&(x<165))|((x<315)&&(x>300))|((x>450)&&(x<465))){
                    contexte.drawImage(this.spritedroite1, x, y, null);
                }
                if (((x<30)&&(x>15))|((x>165)&&(x<180))|((x<330)&&(x>315))|((x>465)&&(x<480))){
                    contexte.drawImage(this.spritedroite2, x, y, null);
                }
                if (((x<45)&&(x>30))|((x>180)&&(x<195))|((x<345)&&(x>330))|((x>480)&&(x<495))){
                    contexte.drawImage(this.spritedroite3, x, y, null);
                }
                if (((x<60)&&(x>45))|((x>195)&&(x<210))|((x<360)&&(x>345))|((x>495)&&(x<510))){
                    contexte.drawImage(this.spritedroite4, x, y, null);
                }
                if (((x<75)&&(x>60))|((x>210)&&(x<225))|((x<375)&&(x>360))|((x>510)&&(x<525))){
                    contexte.drawImage(this.spritedroite5, x, y, null);
                }
                if (((x<90)&&(x>75))|((x>225)&&(x<240))|((x<390)&&(x>375))|((x>525)&&(x<540))){
                    contexte.drawImage(this.spritedroite6, x, y, null);
                }
                if (((x<105)&&(x>90))|((x>240)&&(x<255))|((x<405)&&(x>390))|((x>540)&&(x<555))){
                    contexte.drawImage(this.spritedroite7, x, y, null);
                }
                if (((x<120)&&(x>105))|((x>255)&&(x<270))|((x<420)&&(x>405))|((x>555)&&(x<570))){
                    contexte.drawImage(this.spritedroite8, x, y, null);
                }
                if (((x<135)&&(x>120))|((x>270)&&(x<285))|((x<435)&&(x>420))|((x>570)&&(x<585))){
                    contexte.drawImage(this.spritedroite9, x, y, null);
                }
                if (((x<150)&&(x>135))|((x>285)&&(x<300))|((x<450)&&(x>435))|((x>585)&&(x<600))){
                    contexte.drawImage(this.spritedroite10, x, y, null);
                }
        }
        if (j1.getDirection()==1){    
                if (((y<15)&&(y>0))|((y>150)&&(y<165))|((y<315)&&(y>300))|((y>450)&&(y<465))){
                    contexte.drawImage(this.spritebas1, x, y, null);
                }
                if (((y<30)&&(y>15))|((y>165)&&(y<180))|((y<330)&&(y>315))|((y>465)&&(y<480))){
                    contexte.drawImage(this.spritebas2, x, y, null);
                }
                if (((y<45)&&(y>30))|((y>180)&&(y<195))|((y<345)&&(y>330))|((y>480)&&(y<495))){
                    contexte.drawImage(this.spritebas3, x, y, null);
                }
                if (((y<60)&&(y>45))|((y>195)&&(y<210))|((y<360)&&(y>345))|((y>495)&&(y<510))){
                    contexte.drawImage(this.spritebas4, x, y, null);
                }
                if (((y<75)&&(y>60))|((y>210)&&(y<225))|((y<375)&&(y>360))|((y>510)&&(y<525))){
                    contexte.drawImage(this.spritebas5, x, y, null);
                }
                if (((y<90)&&(y>75))|((y>225)&&(y<240))|((y<390)&&(y>375))|((y>525)&&(y<540))){
                    contexte.drawImage(this.spritebas6, x, y, null);
                }
                if (((y<105)&&(y>90))|((y>240)&&(y<255))|((y<405)&&(y>390))|((y>540)&&(y<555))){
                    contexte.drawImage(this.spritebas7, x, y, null);
                }
                if (((y<120)&&(y>105))|((y>255)&&(y<270))|((y<420)&&(y>405))|((y>555)&&(y<570))){
                    contexte.drawImage(this.spritebas8, x, y, null);
                }
                if (((y<135)&&(y>120))|((y>270)&&(y<285))|((y<435)&&(y>420))|((y>570)&&(y<585))){
                    contexte.drawImage(this.spritebas9, x, y, null);
                }
                if (((y<150)&&(y>135))|((y>285)&&(y<300))|((y<450)&&(y>435))|((y>585)&&(y<600))){
                    contexte.drawImage(this.spritebas10, x, y, null);
                }
        }
        if (j1.getDirection()==3){    
                if (((y<15)&&(y>0))|((y>150)&&(y<165))|((y<315)&&(y>300))|((y>450)&&(y<465))){
                    contexte.drawImage(this.spritehaut1, x, y, null);
                }
                if (((y<30)&&(y>15))|((y>165)&&(y<180))|((y<330)&&(y>315))|((y>465)&&(y<480))){
                    contexte.drawImage(this.spritehaut2, x, y, null);
                }
                if (((y<45)&&(y>30))|((y>180)&&(y<195))|((y<345)&&(y>330))|((y>480)&&(y<495))){
                    contexte.drawImage(this.spritehaut3, x, y, null);
                }
                if (((y<60)&&(y>45))|((y>195)&&(y<210))|((y<360)&&(y>345))|((y>495)&&(y<510))){
                    contexte.drawImage(this.spritehaut4, x, y, null);
                }
                if (((y<75)&&(y>60))|((y>210)&&(y<225))|((y<375)&&(y>360))|((y>510)&&(y<525))){
                    contexte.drawImage(this.spritehaut5, x, y, null);
                }
                if (((y<90)&&(y>75))|((y>225)&&(y<240))|((y<390)&&(y>375))|((y>525)&&(y<540))){
                    contexte.drawImage(this.spritehaut6, x, y, null);
                }
                if (((y<105)&&(y>90))|((y>240)&&(y<255))|((y<405)&&(y>390))|((y>540)&&(y<555))){
                    contexte.drawImage(this.spritehaut7, x, y, null);
                }
                if (((y<120)&&(y>105))|((y>255)&&(y<270))|((y<420)&&(y>405))|((y>555)&&(y<570))){
                    contexte.drawImage(this.spritehaut8, x, y, null);
                }
                if (((y<135)&&(y>120))|((y>270)&&(y<285))|((y<435)&&(y>420))|((y>570)&&(y<585))){
                    contexte.drawImage(this.spritehaut9, x, y, null);
                }
                if (((y<150)&&(y>135))|((y>285)&&(y<300))|((y<450)&&(y>435))|((y>585)&&(y<600))){
                    contexte.drawImage(this.spritehaut10, x, y, null);
                }
        }
        }
        if (id==4){
            if (j1.getDirection()==4){    
                if (((x<15)&&(x>0))|((x>150)&&(x<165))|((x<315)&&(x>300))|((x>450)&&(x<465))){
                    contexte.drawImage(this.spritegauche1, x, y, null);
                }
                if (((x<30)&&(x>15))|((x>165)&&(x<180))|((x<330)&&(x>315))|((x>465)&&(x<480))){
                    contexte.drawImage(this.spritegauche2, x, y, null);
                }
                if (((x<45)&&(x>30))|((x>180)&&(x<195))|((x<345)&&(x>330))|((x>480)&&(x<495))){
                    contexte.drawImage(this.spritegauche3, x, y, null);
                }
                if (((x<60)&&(x>45))|((x>195)&&(x<210))|((x<360)&&(x>345))|((x>495)&&(x<510))){
                    contexte.drawImage(this.spritegauche4, x, y, null);
                }
                if (((x<75)&&(x>60))|((x>210)&&(x<225))|((x<375)&&(x>360))|((x>510)&&(x<525))){
                    contexte.drawImage(this.spritegauche5, x, y, null);
                }
                if (((x<90)&&(x>75))|((x>225)&&(x<240))|((x<390)&&(x>375))|((x>525)&&(x<540))){
                    contexte.drawImage(this.spritegauche6, x, y, null);
                }
                if (((x<105)&&(x>90))|((x>240)&&(x<255))|((x<405)&&(x>390))|((x>540)&&(x<555))){
                    contexte.drawImage(this.spritegauche7, x, y, null);
                }
                if (((x<120)&&(x>105))|((x>255)&&(x<270))|((x<420)&&(x>405))|((x>555)&&(x<570))){
                    contexte.drawImage(this.spritegauche8, x, y, null);
                }
                if (((x<135)&&(x>120))|((x>270)&&(x<285))|((x<435)&&(x>420))|((x>570)&&(x<585))){
                    contexte.drawImage(this.spritegauche9, x, y, null);
                }
                if (((x<150)&&(x>135))|((x>285)&&(x<300))|((x<450)&&(x>435))|((x>585)&&(x<600))){
                    contexte.drawImage(this.spritegauche10, x, y, null);
                }
        
        }
        
        if (j1.getDirection()==2){    
                if (((x<15)&&(x>0))|((x>150)&&(x<165))|((x<315)&&(x>300))|((x>450)&&(x<465))){
                    contexte.drawImage(this.spritedroite1, x, y, null);
                }
                if (((x<30)&&(x>15))|((x>165)&&(x<180))|((x<330)&&(x>315))|((x>465)&&(x<480))){
                    contexte.drawImage(this.spritedroite2, x, y, null);
                }
                if (((x<45)&&(x>30))|((x>180)&&(x<195))|((x<345)&&(x>330))|((x>480)&&(x<495))){
                    contexte.drawImage(this.spritedroite3, x, y, null);
                }
                if (((x<60)&&(x>45))|((x>195)&&(x<210))|((x<360)&&(x>345))|((x>495)&&(x<510))){
                    contexte.drawImage(this.spritedroite4, x, y, null);
                }
                if (((x<75)&&(x>60))|((x>210)&&(x<225))|((x<375)&&(x>360))|((x>510)&&(x<525))){
                    contexte.drawImage(this.spritedroite5, x, y, null);
                }
                if (((x<90)&&(x>75))|((x>225)&&(x<240))|((x<390)&&(x>375))|((x>525)&&(x<540))){
                    contexte.drawImage(this.spritedroite6, x, y, null);
                }
                if (((x<105)&&(x>90))|((x>240)&&(x<255))|((x<405)&&(x>390))|((x>540)&&(x<555))){
                    contexte.drawImage(this.spritedroite7, x, y, null);
                }
                if (((x<120)&&(x>105))|((x>255)&&(x<270))|((x<420)&&(x>405))|((x>555)&&(x<570))){
                    contexte.drawImage(this.spritedroite8, x, y, null);
                }
                if (((x<135)&&(x>120))|((x>270)&&(x<285))|((x<435)&&(x>420))|((x>570)&&(x<585))){
                    contexte.drawImage(this.spritedroite9, x, y, null);
                }
                if (((x<150)&&(x>135))|((x>285)&&(x<300))|((x<450)&&(x>435))|((x>585)&&(x<600))){
                    contexte.drawImage(this.spritedroite10, x, y, null);
                }
        }
        if (j1.getDirection()==1){    
                if (((y<15)&&(y>0))|((y>150)&&(y<165))|((y<315)&&(y>300))|((y>450)&&(y<465))){
                    contexte.drawImage(this.spritebas1, x, y, null);
                }
                if (((y<30)&&(y>15))|((y>165)&&(y<180))|((y<330)&&(y>315))|((y>465)&&(y<480))){
                    contexte.drawImage(this.spritebas2, x, y, null);
                }
                if (((y<45)&&(y>30))|((y>180)&&(y<195))|((y<345)&&(y>330))|((y>480)&&(y<495))){
                    contexte.drawImage(this.spritebas3, x, y, null);
                }
                if (((y<60)&&(y>45))|((y>195)&&(y<210))|((y<360)&&(y>345))|((y>495)&&(y<510))){
                    contexte.drawImage(this.spritebas4, x, y, null);
                }
                if (((y<75)&&(y>60))|((y>210)&&(y<225))|((y<375)&&(y>360))|((y>510)&&(y<525))){
                    contexte.drawImage(this.spritebas5, x, y, null);
                }
                if (((y<90)&&(y>75))|((y>225)&&(y<240))|((y<390)&&(y>375))|((y>525)&&(y<540))){
                    contexte.drawImage(this.spritebas6, x, y, null);
                }
                if (((y<105)&&(y>90))|((y>240)&&(y<255))|((y<405)&&(y>390))|((y>540)&&(y<555))){
                    contexte.drawImage(this.spritebas7, x, y, null);
                }
                if (((y<120)&&(y>105))|((y>255)&&(y<270))|((y<420)&&(y>405))|((y>555)&&(y<570))){
                    contexte.drawImage(this.spritebas8, x, y, null);
                }
                if (((y<135)&&(y>120))|((y>270)&&(y<285))|((y<435)&&(y>420))|((y>570)&&(y<585))){
                    contexte.drawImage(this.spritebas9, x, y, null);
                }
                if (((y<150)&&(y>135))|((y>285)&&(y<300))|((y<450)&&(y>435))|((y>585)&&(y<600))){
                    contexte.drawImage(this.spritebas10, x, y, null);
                }
        }
        if (j1.getDirection()==3){    
                if (((y<15)&&(y>0))|((y>150)&&(y<165))|((y<315)&&(y>300))|((y>450)&&(y<465))){
                    contexte.drawImage(this.spritehaut1, x, y, null);
                }
                if (((y<30)&&(y>15))|((y>165)&&(y<180))|((y<330)&&(y>315))|((y>465)&&(y<480))){
                    contexte.drawImage(this.spritehaut2, x, y, null);
                }
                if (((y<45)&&(y>30))|((y>180)&&(y<195))|((y<345)&&(y>330))|((y>480)&&(y<495))){
                    contexte.drawImage(this.spritehaut3, x, y, null);
                }
                if (((y<60)&&(y>45))|((y>195)&&(y<210))|((y<360)&&(y>345))|((y>495)&&(y<510))){
                    contexte.drawImage(this.spritehaut4, x, y, null);
                }
                if (((y<75)&&(y>60))|((y>210)&&(y<225))|((y<375)&&(y>360))|((y>510)&&(y<525))){
                    contexte.drawImage(this.spritehaut5, x, y, null);
                }
                if (((y<90)&&(y>75))|((y>225)&&(y<240))|((y<390)&&(y>375))|((y>525)&&(y<540))){
                    contexte.drawImage(this.spritehaut6, x, y, null);
                }
                if (((y<105)&&(y>90))|((y>240)&&(y<255))|((y<405)&&(y>390))|((y>540)&&(y<555))){
                    contexte.drawImage(this.spritehaut7, x, y, null);
                }
                if (((y<120)&&(y>105))|((y>255)&&(y<270))|((y<420)&&(y>405))|((y>555)&&(y<570))){
                    contexte.drawImage(this.spritehaut8, x, y, null);
                }
                if (((y<135)&&(y>120))|((y>270)&&(y<285))|((y<435)&&(y>420))|((y>570)&&(y<585))){
                    contexte.drawImage(this.spritehaut9, x, y, null);
                }
                if (((y<150)&&(y>135))|((y>285)&&(y<300))|((y<450)&&(y>435))|((y>585)&&(y<600))){
                    contexte.drawImage(this.spritehaut10, x, y, null);
                }
        }
        }
     }


}

    

