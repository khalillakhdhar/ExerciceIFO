package testes;
import dao.Connexion;
import validation.ValidUser;
import classes.Utilisateur;
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connexion c=new Connexion();
ValidUser vu=new ValidUser();
Utilisateur u=new Utilisateur("teste","teste"," admin ","admin");
if ((vu.verifUser(u.getNom())) && (vu.verifUser(u.getPrenom())) && ((vu.verifUser(u.getLogin())))
		&& (vu.verifUser(u.getMdp())))	{
	
	System.out.println("correcte");
	
}
else
	System.out.println("incorrecte");
	
	
	}

}
