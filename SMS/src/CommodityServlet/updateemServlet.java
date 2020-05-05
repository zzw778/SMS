package CommodityServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.IMloginservice;
import System.entity.employee;
import SystemService.Impl.mloginserviceimpl;


public class updateemServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		int id=Integer.parseInt(request.getParameter("id"));
		String pos=request.getParameter("pos");
		int sal=Integer.parseInt(request.getParameter("sal"));
		employee em=new employee(name,id,pos,sal);
		IMloginservice man=new mloginserviceimpl();
		man.updateemp(name,id,em);
		request.getRequestDispatcher("CheckempServlet?name="+name+"&id="+id).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
