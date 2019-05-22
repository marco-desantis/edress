package controller;

import model.UserBean;
import model.UserBeanDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class ServletLogin extends HttpServlet {

	/*private void checkLogin(String username, String password) throws Exception {
		if () {
			//
		} else
			throw new Exception("Invalid login and password");
	}*/

	private UserBean getEmailPsw(HttpServletRequest request) {

		UserBean ub = null;
		String email = null, psw = null;

		Cookie[] c = request.getCookies(); // tramite cookie
		if (c != null) {
			for (int i = 0; i < c.length; i++) {
				if (c[i].getName().equals("email"))
					email = c[i].getValue();
				if (c[i].getName().equals("psw"))
					psw = c[i].getValue();
			}
		}
		if (email == null || psw == null) { // se recupero tramite cookie fallisce, allora tramite parametri
			String temp;
			temp = request.getParameter("email");
			if (temp != null) {
				email = temp;
				temp = request.getParameter("psw");
				if (temp != null) {
					psw = temp;
				}
			}
		}

		if (email != null && psw != null) // se recupero ha avuto successo riempio bean
			ub = new UserBean(email, psw);

		return ub;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession ssn = request.getSession();

		synchronized (ssn) // SINCRONIZZO LA SESSIONE
		{

			UserBean userB =/* new UserBean(request.getParameter("email"));*/getEmailPsw(request);
		/*if(!request.isSecure()) {
			response.sendRedirect("index.jsp");
		}*/
			if (userB == null) {
				response.sendRedirect("index.jsp");
				return;
			}
			UserBeanDAO ubd = new UserBeanDAO();
			String address = "";
			UserBean ub = ubd.doRetrieveByKey(userB.getEmail(), userB.getPsw());
			System.out.println(ub);
			if (ub == null) {
				request.setAttribute("denied", true);
				ssn.setAttribute("accesso", null);
				address = "exception.jsp";
			}

			String pw = ub.getPsw();

			if (pw.equals(request.getParameter("psw"))) {
				Cookie usrcookie = new Cookie("email", ub.getEmail());
				Cookie pswcookie = new Cookie("psw", ub.getPsw());
				usrcookie.setMaxAge(6 * 10);
				pswcookie.setMaxAge(6 * 6000);
				ssn.setAttribute("accesso", true);
				response.addCookie(usrcookie);
				response.addCookie(pswcookie);

				ssn.setAttribute("userBean", ub); // l'output ha bisogno di queste informazioni
				address = "benvenuto.jsp";

			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(address);
			dispatcher.forward(request, response);

		}

	}

}
