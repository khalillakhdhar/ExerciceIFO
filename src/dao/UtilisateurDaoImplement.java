package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Utilisateur;


public class UtilisateurDaoImplement implements UtilisateurDaoInterface {
private Utilisateur us;

	public Utilisateur getUs() {
	return us;
}

public void setUs(Utilisateur us) {
	this.us = us;
}

	@Override
	public boolean authentifier(String login,String mdp) throws SQLException {
		// TODO Auto-generated method stub
		Connexion c = new Connexion(); //appel de connexion à la BD
		   PreparedStatement pst; 
		   pst = (PreparedStatement) c.conn.prepareStatement("SELECT * FROM `utilisateur` WHERE  `login`='"+login+"' AND mdp='"+mdp+"' "); // lister les admins
		   pst.executeQuery(); // lister les admins
		   ResultSet rs = (ResultSet) pst.executeQuery(); // stocker le résultat dans un resultset
		   if(rs.first()) {
		      // System.out.println(rs.getString("nom")); //teste d’affichage
		      return true;
		   }
		   else
		       return false;


		}
		
	

	@Override
	public void adduser(Utilisateur us) {
		// TODO Auto-generated method stub
		 try {
			// TODO add your handling code here:
			            Connexion c = new Connexion();
			            java.sql.PreparedStatement statement = c.conn.prepareStatement("INSERT INTO `utilisateur`(`nom`, `prenom`, `login`, `mdp`) VALUES ('" + us.getNom()+ "','" + us.getPrenom() + "','" + us.getLogin() + "','" + us.getMdp() + "')");
			            statement.executeUpdate();
			            System.out.println("ajouté avec succés");
			        } catch (SQLException ex) {
			                        System.out.println(ex);

			        }
	
	}

}
