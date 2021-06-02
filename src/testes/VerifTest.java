package testes;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import classes.Utilisateur;
import validation.ValidUser;

public class VerifTest {
ValidUser vu;
//Utilisateur us;
@Before
public void initUser()
{
vu=new ValidUser();	
}
@Test
public void testUserNom()
{
assertTrue(vu.verifUser("teste"));	

}

}
