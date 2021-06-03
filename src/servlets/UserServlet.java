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
String erreur="";
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String login=request.getParameter("login");
		String mdp=request.getParameter("mdp");
		Utilisateur u=new Utilisateur(nom, prenom, login, mdp);
		ValidUser vu=new ValidUser();
		
		if ((vu.verifUser(u.getNom())) && (vu.verifUser(u.getPrenom())) && ((vu.verifUser(u.getLogin())))
				&& (vu.verifUser(u.getMdp())))	{
			udi.adduser(u);
			response.sendRedirect("index.jsp");
			System.out.println("correcte");
			
		}
		else
		{
			erreur ="verifier vos champs";
			request.setAttribute("erreur", erreur);
			request.getRequestDispatcher("user.jsp").forward(request, response);
			System.out.println("incorrecte");
		}			
			
		
	}

}
