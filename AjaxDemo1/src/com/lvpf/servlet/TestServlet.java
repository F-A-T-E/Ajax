package com.lvpf.servlet;

import com.google.gson.Gson;
import com.lvpf.pojo.User;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/testServlet.do")
public class TestServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user1 = new User("小明1",10,"男",new Date());
//		响应普通文本数据
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
//		把user对象转换成JSON格式的字符串响应给浏览器
		Gson gson = new Gson();
		String str = gson.toJson(user1);
		System.out.println(str);
		System.out.println("-------------");
		resp.getWriter().print("普通文本数据8888888888");
	}
}
