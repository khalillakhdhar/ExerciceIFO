package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Utilisateur;
import dao.UtilisateurDaoImplement;
import validation.ValidUser;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		UtilisateurDaoImplement udi=new UtilisateurDaoImplement();

		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String login=request.getParameter("login");
		String mdp=request.getParameter("mdp");
		Utilisateur us=new Utilisateur(nom, prenom, login, mdp);
		ValidUser vu=new ValidUser();
		Utilisateur u=new Utilisateur("teste2","teste2"," admin ","admin");
		if ((vu.verifUser(u.getNom())) && (vu.verifUser(u.getPrenom())) && ((vu.verifUser(u.getLogin())))
				&& (vu.verifUser(u.getMdp())))	{
			udi.adduser(u);
			response.sendRedirect("index.jsp");
			System.out.println("correcte");
			
		}
		else
			System.out.println("incorrecte");
			
			
		
	}

}
