/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import outils.OutilsJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author guillaume.laurent
 */
public class TestSelectAll {

    public static void main(String[] args) {

        try {

            Connection connexion = DriverManager.getConnection("jdbc:mysql://nemrod.ens2m.fr:3306/tp_jdbc?serverTimezone=UTC", "etudiant", "YTDTvj9TR3CDYCmP");

            PreparedStatement requete = connexion.prepareStatement("SELECT * FROM objet;");
            ResultSet resultat = requete.executeQuery();
            OutilsJDBC.afficherResultSet(resultat);

            requete.close();
            connexion.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
