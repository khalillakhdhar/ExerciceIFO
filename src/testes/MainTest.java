package testes;
import dao.Connexion;
import dao.UtilisateurDaoImplement;
import validation.ValidUser;

import java.sql.SQLException;

import classes.Utilisateur;
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UtilisateurDaoImplement udi=new UtilisateurDaoImplement();
		try {
			System.out.println(udi.authentifier("teste", "teste"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ValidUser vu=new ValidUser();
		Utilisateur u=new Utilisateur("teste2","teste2"," admin ","admin");
		if ((vu.verifUser(u.getNom())) && (vu.verifUser(u.getPrenom())) && ((vu.verifUser(u.getLogin())))
				&& (vu.verifUser(u.getMdp())))	{
			udi.adduser(u);
			System.out.println("correcte");
			
		}
		else
			System.out.println("incorrecte");
			
				
		
		
//Connexion c=new Connexion();

//	}
	}
}
