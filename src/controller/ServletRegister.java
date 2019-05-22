package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import model.*;

@WebServlet("/register")

public class ServletRegister extends HttpServlet 
{
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			UserBean ub = new UserBean();
			
			String email = request.getParameter("email");
			String psw = request.getParameter("psw");
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			String citta = request.getParameter("citta");
			String indirizzo = request.getParameter("indirizzo");
			String cap = request.getParameter("cap");
			
			
			String regexEmail = "^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$";
			if(email.matches(regexEmail)) {
				ub.setEmail(email);
			}
			String regexPsw = "^[a-zA-Z0-9\\_\\*\\-\\+\\!\\?\\,\\:\\;\\.\\xE0\\xE8\\xE9\\xF9\\xF2\\xEC\\x27]{8,20}";
			if(psw.matches(regexPsw)) {
				ub.setPsw(psw);
			}
			String regexNome = "^[a-zA-Z\\'\\s]+$";
			if(nome.matches(regexNome)) {
				ub.setNome(nome);
			}
			String regexCognome = "^[a-zA-Z\\s]+$";
			if(cognome.matches(regexCognome)) {
				ub.setCognome(cognome);
			}
			ub.setCitta(citta);
			ub.setIndirizzo(indirizzo);
			String regexCAP = "^\\d{5}$";
			if(cap.matches(regexCAP)) {
				ub.setCap(Integer.parseInt(cap));
			}
			
			UserBeanDAO ubd = new UserBeanDAO();
			
			if(ubd.doSave(ub)) {
				request.setAttribute("userBean", ub);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
				requestDispatcher.forward(request, response);
				}
			else {
				request.setAttribute("controllo", false);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("register.jsp");
				requestDispatcher.forward(request, response);
				}
			}
		catch(Exception e)
		{  
				request.setAttribute("exception", e);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/exception.jsp");
				requestDispatcher.forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
