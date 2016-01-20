package com.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ibcio.WebSocketMessageServlet;

@WebServlet("/InitUser")
public class InitUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InitUser() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String user = (String)session.getAttribute("user");
		//为用户生成昵称
		user = "游客" + WebSocketMessageServlet.ONLINE_USER_COUNT;
		WebSocketMessageServlet.ONLINE_USER_COUNT ++;
		session.setAttribute("user", user);
	}

}
