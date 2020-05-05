package CommodityServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.IMloginservice;
import System.entity.Manage;
import SystemService.Impl.mloginserviceimpl;

public class manageupdateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		//System.out.println(name);
		IMloginservice manage=new mloginserviceimpl();
		Manage man=manage.checkmanage(name);
			request.setAttribute("man",man);
		request.getRequestDispatcher("Mmessage.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
