package CommodityServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.IMloginservice;
import System.entity.employee;
import SystemService.Impl.mloginserviceimpl;


public class CheckallemServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IMloginservice man=new mloginserviceimpl();
		List<employee> ems=man.checkallemployee();
		request.setAttribute("ems", ems);
		request.getRequestDispatcher("emlist.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
