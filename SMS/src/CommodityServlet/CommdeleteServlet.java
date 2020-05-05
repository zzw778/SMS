package CommodityServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.ICommodityService;
import System.entity.Commodity;
import SystemService.Impl.CommodityServiceImpl;

public class CommdeleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String cname=request.getParameter("cname");
		//System.out.println(cname);
        String sname=request.getParameter("sname");
		ICommodityService comm=new CommodityServiceImpl();
		comm.deletestore(sname,cname);
		comm.deletecommodity(cname,sname);
		
		request.getRequestDispatcher("CommcheckoneServlet?cname="+cname).forward(request, response);	
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
