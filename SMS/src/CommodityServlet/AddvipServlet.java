package CommodityServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.IMloginservice;
import System.entity.employee;
import System.entity.vip;
import SystemService.Impl.mloginserviceimpl;


public class AddvipServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		int vnum=Integer.parseInt(request.getParameter("vnum"));
		String sex=request.getParameter("sex");
		int vid=Integer.parseInt(request.getParameter("vid"));
		int vphone=Integer.parseInt(request.getParameter("vphone"));
		int vmon=Integer.parseInt(request.getParameter("vmon"));
		String vbir=request.getParameter("vbir");
		String vlev=request.getParameter("vlev");
		String vdate=request.getParameter("vdate");
		int vintegral=0;
		vip em=new vip(vnum,name,sex,vid,vphone,vbir,vlev,vmon,vintegral,vdate);
		IMloginservice man=new mloginserviceimpl();
		man.addvip(em);
		request.getRequestDispatcher("addvip.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
