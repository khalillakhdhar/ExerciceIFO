package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import classes.Utilisateur;

public interface UtilisateurDaoInterface {
public boolean authentifier(String login,String mdp) throws SQLException;
public void adduser(Utilisateur us);
}
