package com.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChangeNickname
 */
@WebServlet("/ChangeNickname")
public class ChangeNickname extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ChangeNickname() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String newNickname = request.getParameter("nickname");
		request.getSession().setAttribute("user", newNickname);
		response.sendRedirect("/WebSocket");
	}

}
