package com.lvpf.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/unameCheckServlet.do")
public class unameCheckServlet extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String uname = req.getParameter("uname");
		String info = "";
		if("msb".equals(uname)){
			info = "用户名已经占用";
		}else {
			info="用户名可用";
		}
//		向浏览器响应数据
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		res.getWriter().print(info);
	}
}
