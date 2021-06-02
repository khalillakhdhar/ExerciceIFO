package dao;

import java.sql.ResultSet;

import classes.Utilisateur;

public interface UtilisateurDaoInterface {
public ResultSet authentifier(String login,String mdp);
public void adduser(Utilisateur us);
}
