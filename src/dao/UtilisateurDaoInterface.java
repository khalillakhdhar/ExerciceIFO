package dao;

import java.sql.ResultSet;

import classes.Utilisateur;

public interface UtilisateurDaoInterface {
public ResultSet authentifier();
public void adduser(Utilisateur us);
}
