package CommodityServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.IMloginservice;
import System.entity.employee;
import SystemService.Impl.mloginserviceimpl;


public class deleteemServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		int id=Integer.parseInt(request.getParameter("id"));
		
		IMloginservice man=new mloginserviceimpl();
		man.deleteemp(name,id);
		request.getRequestDispatcher("checkemp.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
