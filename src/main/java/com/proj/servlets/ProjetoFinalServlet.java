package com.proj.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProjetoFinalServlet
 */
@WebServlet("/ProjetoFinalServlet")
public class ProjetoFinalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Container container = new Container();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjetoFinalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id =request.getParameter("id");
		String alterar =request.getParameter("alterar");
		if(id != null) {
			
			if(alterar.equals("0")) {
				container.deletar(Integer.parseInt(id));
			}else if(alterar.equals("1")) {
				User user = container.consultar(Integer.parseInt(id));
				request.setAttribute("id", user.getId());
				request.setAttribute("nome", user.getNome());
				request.setAttribute("email", user.getEmail());
				request.setAttribute("pais", user.getPais());
				
				request.getRequestDispatcher("/form.jsp").forward(request, response);
			}
		}
		request.setAttribute("usuarios", container.consultar());
		request.getRequestDispatcher("/").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		if(request.getParameter("nome") != null && request.getParameter("email") != null && request.getParameter("pais") != null) {
			String var1 = request.getParameter("nome");
			String var2 = request.getParameter("email");
			String var3 = request.getParameter("pais");
			
			String id = request.getParameter("id");
			
			if(id != null && !id.isEmpty()) {
				container.alterar(Integer.parseInt(id), var1, var2, var3);
			}else {
				User user = new User(var1, var2, var3);
				container.inserir(user);
			}
			
			
			
			request.setAttribute("usuarios", container.consultar());
			
		}
		
		request.getRequestDispatcher("/").forward(request, response);
	}
	
}
