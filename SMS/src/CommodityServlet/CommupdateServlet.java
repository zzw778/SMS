package CommodityServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.ICommodityService;
import System.entity.Commodity;
import SystemService.Impl.CommodityServiceImpl;

public class CommupdateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
	    String cname=request.getParameter("cname");
	   // System.out.print(cname);
	    String sname=request.getParameter("sname");
	    String corig=request.getParameter("corig");
	    String cunit=request.getParameter("cunit");
	    int cinprice=Integer.parseInt(request.getParameter("cinprice"));
	    int coutprice=Integer.parseInt(request.getParameter("coutprice"));
	    String coutdate=request.getParameter("coutdate");
	    int cnu=Integer.parseInt(request.getParameter("cnu"));
	    String cremark=request.getParameter("cremark");
	    Commodity comm=new Commodity(cname,sname,corig,cunit,cinprice,coutprice,coutdate,cnu,cremark);
	    ICommodityService commo=new CommodityServiceImpl();
	    if(commo.updatecommodity(comm))
			   request.getRequestDispatcher("CommallServlet").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
