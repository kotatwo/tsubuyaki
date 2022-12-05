package com.design_shinbi.tsubuyaki.servlet;

import java.sql.Connection;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.design_shinbi.tsubuyaki.model.Const;
import com.design_shinbi.tsubuyaki.model.entity.User;

@WebServlet("/logout")
public class LogoutServlet extends AuthenticationServlet {

	@Override
	protected String view(HttpServletRequest request, HttpServletResponse response, Connection connection,
			User loginUser) throws Exception {
		
		HttpSession session = request.getSession();
		session.removeAttribute(Const.LOGIN_USER_KEY);
		
		String jsp = "/WEB-INF/jsp/login.jsp";
		
		return jsp;
	}
}
