package Ajax;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ISystemService.ICommodityService;
import System.entity.Commodity;
import SystemService.Impl.CommodityServiceImpl;

public class addAjaxServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
	    String cname=request.getParameter("cname");
	    String sname=request.getParameter("sname");
	    System.out.println(sname);
	    ICommodityService commo=new CommodityServiceImpl();
	    
	    if(commo.isExit(cname,sname))
			response.getWriter().write("false");
		else 
			response.getWriter().write("true");
			   
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
