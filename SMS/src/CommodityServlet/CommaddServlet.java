package CommodityServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.ICommodityService;
import System.entity.Commodity;
import System.entity.Store;
import SystemService.Impl.CommodityServiceImpl;


public class CommaddServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
	    String cname=request.getParameter("cname");
	    String corig=request.getParameter("corig");
	    String cunit=request.getParameter("cunit");
	    int cinprice=Integer.parseInt(request.getParameter("cinprice"));
	    int coutprice=Integer.parseInt(request.getParameter("coutprice"));
	    String sname=request.getParameter("sname");
	    String coutdate=request.getParameter("coutdate");
	    int cnu=Integer.parseInt(request.getParameter("cnu"));
	    String cremark=request.getParameter("cremark");
	    ICommodityService commo=new CommodityServiceImpl();
	    boolean res=commo.isExitstore(sname,cname);
	    if(!res) {
	   	  Commodity comm=new Commodity(cname,sname,corig,cunit,cinprice,coutprice,coutdate,cnu,cremark);
	      Store s=new Store(sname,cname);
	      commo.addstore(s);
	      if(commo.addcommodity(comm))
			   request.getRequestDispatcher("CommallServlet").forward(request, response);
	    }
		/*
		 * FenYe page=new FenYe(); int
		 * count=Integer.parseInt(request.getParameter("allitem"));
		 * page.setAllitem(count);//总数据个数 request.setAttribute("page", page);
		 */
		 
	    
	}

	     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
