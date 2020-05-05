package CommodityServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.IMloginservice;
import System.entity.employee;
import System.entity.vip;
import SystemService.Impl.mloginserviceimpl;


public class CheckallvipServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IMloginservice man=new mloginserviceimpl();
		List<vip> vips=man.checkallvip();
		request.setAttribute("ems", vips);
		request.getRequestDispatcher("viplist.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
