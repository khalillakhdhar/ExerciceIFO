package dao;

import java.sql.ResultSet;

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
	public ResultSet authentifier(String login,String mdp) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public void adduser(Utilisateur us) {
		// TODO Auto-generated method stub
		
	}

}
